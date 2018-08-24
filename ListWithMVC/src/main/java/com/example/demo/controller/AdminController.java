package com.example.demo.controller;

import com.example.demo.model.Ad;
import com.example.demo.model.Category;
import com.example.demo.repository.AdRepository;
import com.example.demo.repository.CategoryRepository;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@Controller
public class AdminController {
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private AdRepository adRepository;

    @GetMapping(value = "/adminHome")
    public String adminController(ModelMap map) {
        map.addAttribute ("addCategory", new Category ());
        map.addAttribute ("ad", new Ad ());
        map.addAttribute ("allCategories", categoryRepository.findAll ());

        return "admin";
    }

    @GetMapping(value = "/addCategory")
    public String addCategory(@ModelAttribute("Category") Category category) {
        categoryRepository.save (category);
        return "redirect:/adminHome";
    }

    @PostMapping("/addAds")
    public String saveAd(@Valid @ModelAttribute("ad") Ad ad, BindingResult result, @RequestParam("picture") MultipartFile multipartFile) throws IOException {
        StringBuilder sb = new StringBuilder ();
        if (result.hasErrors ()) {
            for (ObjectError objectError : result.getAllErrors ()) {
                sb.append (objectError.getDefaultMessage () + "<br>");
            }
            return "redirect:/home?message=" + sb.toString ();
        }
        String picName = System.currentTimeMillis () + "_" + multipartFile.getOriginalFilename ();
        File file = new File ("D:\\lists\\" + picName);
        multipartFile.transferTo (file);
        ad.setPicUrl (picName);
        adRepository.save (ad);
        return "redirect:/home";
    }

    @RequestMapping(value = "/image", method = RequestMethod.GET)
    public void getImageAsByteArray(HttpServletResponse response, @RequestParam("fileName") String fileName) throws IOException {
        InputStream in = new FileInputStream ("D:\\lists\\" + fileName);
        response.setContentType (MediaType.IMAGE_JPEG_VALUE);
        IOUtils.copy (in, response.getOutputStream ());
    }
}
