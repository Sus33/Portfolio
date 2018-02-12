package am.itspace.spring_user_demo.controller;

import am.itspace.spring_user_demo.model.User;
import am.itspace.spring_user_demo.repository.PostRepository;
import am.itspace.spring_user_demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.apache.commons.io.IOUtils;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@Controller
public class MainController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String homePage(ModelMap map, @RequestParam(value = "message", required = false) String message){
        map.addAttribute ("users", userRepository.findAll ());
        map.addAttribute ("message", message != null ? message : "Welcome");
        map.addAttribute ("user", new User ());
        return "index";
    }

    @PostMapping("/addUser")
    public String saveUser(@Valid @ModelAttribute("user") User user, BindingResult result, @RequestParam("picture") MultipartFile multipartFile) throws IOException {
        StringBuilder sb = new StringBuilder ();
        if (result.hasErrors ()){
            for (ObjectError objectError : result.getAllErrors ()) {
                sb.append (objectError.getDefaultMessage () + "<br>");
            }
            return "redirect:/home?message=" + sb.toString ();
        }
        String picName = System.currentTimeMillis () + "_" + multipartFile.getOriginalFilename ();
        File file = new File ("D:\\spring\\" + picName);
        multipartFile.transferTo (file);
        user.setPicUrl (picName);
        userRepository.save (user);
        return "redirect:/home";
    }

    @GetMapping("/posts")
    public String postPage(ModelMap map){
        map.addAttribute ("posts", postRepository.findAll ());
        return "posts";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main(){
        return "redirect:/home";
    }

    @GetMapping("/deleteUser")
    public String deleteUsers (@RequestParam("id") int id){
        userRepository.delete (id);
        return "redirect:/home";
    }

    @RequestMapping(value = "/image", method = RequestMethod.GET)
    public void getImageAsByteArray(HttpServletResponse response, @RequestParam("fileName") String fileName) throws IOException {
        InputStream in = new FileInputStream ("D:\\spring\\" + fileName);
        response.setContentType (MediaType.IMAGE_JPEG_VALUE);
        IOUtils.copy(in, response.getOutputStream());

    }
}
