package com.example.demo.controller;

import com.example.demo.model.Ad;
import com.example.demo.repository.AdRepository;
import com.example.demo.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private AdRepository adRepository;

    @GetMapping(value = "/main")
    public String mainPage(ModelMap map) {
        map.addAttribute ("ad", adRepository.findAll ());
        map.addAttribute ("allCategories", categoryRepository.findAll ());
        return "index";
    }


    @GetMapping("/ads")
    public String bookPage(ModelMap map) {
        map.addAttribute ("ads", adRepository.findAll ());
        return "ads";
    }

    @GetMapping("/findId")
    public String findAdtByCategory(@PathVariable("id") int id, ModelMap map) {
        List<Ad> adList = (List<Ad>) adRepository.findCategoryById (id);
        map.addAttribute ("ad", adList);
        return "ads";
    }

}
