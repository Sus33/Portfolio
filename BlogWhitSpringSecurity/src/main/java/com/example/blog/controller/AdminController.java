package com.example.blog.controller;

import com.example.blog.model.Category;
import com.example.blog.model.Post;
import com.example.blog.model.User;
import com.example.blog.repository.CategoryRepository;
import com.example.blog.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.File;
import java.io.IOException;

@Controller
public class AdminController {
    @Autowired
    private PostRepository postRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String adminPage(ModelMap map) {
        map.addAttribute ("manager", new User ());

        map.addAttribute ("addCategory", new Category ());
        map.addAttribute ("post", new Post ());
        map.addAttribute ("allCategories", categoryRepository.findAll ());

        return "manager";
    }

    @PostMapping("/addPost")
    public String savePost(@Valid @ModelAttribute("post") Post post, BindingResult result, @RequestParam("picture") MultipartFile multipartFile) throws IOException {
        StringBuilder stringBuilder = new StringBuilder ();
        if (result.hasErrors ()) {
            for (ObjectError objectError : result.getAllErrors ()) {
                stringBuilder.append (objectError.getDefaultMessage () + "<br>");
            }
            return "redirect:/home?message=" + stringBuilder.toString ();
        }
        String picName = System.currentTimeMillis () + "_" + multipartFile.getOriginalFilename ();
        File file = new File ("D:\\posts\\" + picName);
        multipartFile.transferTo (file);
        post.setPicUrl (picName);
        postRepository.save (post);
        return "redirect:/admin";
    }
}

