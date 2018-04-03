package am.bank.banksystem.controller;

import am.bank.banksystem.model.Citizen;
import am.bank.banksystem.model.Gold;
import am.bank.banksystem.repository.CitizenRepository;
import am.bank.banksystem.repository.JewelerRepository;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@Controller
public class JewelerController {
    @Value("D:\\mvc\\")
    private String imageUploadPath;
    @Autowired
    private JewelerRepository jewelerRepository;
    @Autowired
    private CitizenRepository citizenRepository;

    @RequestMapping(value = "/jewelerHome", method = RequestMethod.GET)
    public String jewelerHome(ModelMap map) {
        map.addAttribute ("gold", new Gold ());
        map.addAttribute ("citizen", new Citizen ());
        return "jeweler";
    }

    @RequestMapping(value = "/addGold", method = RequestMethod.POST)
    public String addGold(@ModelAttribute(name = "gold") Gold gold, @RequestParam(value = "image") MultipartFile file) throws IOException {
        File dir = new File (imageUploadPath);
        if (!dir.exists ()) {
            dir.mkdir ();
        }
        String picName = System.currentTimeMillis () + "_" + file.getOriginalFilename ();
        File picture = new File ("D:\\bankSystem\\" + picName);
        file.transferTo (picture);
        gold.setPicture (picName);
        jewelerRepository.save (gold);
        return "redirect:/jewelerHome";
    }

    @RequestMapping(value = "/gold/image", method = RequestMethod.GET)
    public void getImageByByteArray(HttpServletResponse response, @RequestParam("fileName") String fileName) throws IOException {
        InputStream in = new FileInputStream ("D:\\bankSystem\\" + fileName);
        response.setContentType (MediaType.IMAGE_JPEG_VALUE);
        IOUtils.copy (in, response.getOutputStream ());
    }

    @RequestMapping(value = "addCitizen", method = RequestMethod.GET)
    public String addCitizen(@ModelAttribute(name = "citizen") Citizen citizen) {
        citizenRepository.save (citizen);
        return "redirect:/jewelerHome";
    }

    @GetMapping("/user/{id}")
    public String userDetil(@PathVariable int id, ModelMap map){
        Citizen one = citizenRepository.findOne (id);
        map.addAttribute ("user", one);
        return "main";

    }

}
