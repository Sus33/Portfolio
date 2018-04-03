package am.bank.banksystem.controller;

import am.bank.banksystem.model.Room;
import am.bank.banksystem.model.User;
import am.bank.banksystem.repository.ManagerRepository;
import am.bank.banksystem.repository.RoomRepository;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@Controller
public class AdminController {
    @Value("D:\\mvc\\")
    private String imageUploadPath;
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    private ManagerRepository managerRepository;
    @Autowired
    private RoomRepository roomRepository;

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String adminPage(ModelMap map) {
        map.addAttribute ("manager", new User ());
        map.addAttribute ("room", new Room ());
        return "manager";

    }

    @RequestMapping(value = "/addCollega", method = RequestMethod.POST)
    public String addBrand(@ModelAttribute(name = "manager") User user, @RequestParam(value = "image") MultipartFile file) throws IOException {
        File dir = new File (imageUploadPath);
        if (!dir.exists ()) {
            dir.mkdir ();
        }
        String picName = System.currentTimeMillis () + "_" + file.getOriginalFilename ();
        File picture = new File ("D:\\bankSystem\\" + picName);
        file.transferTo (picture);
        user.setPicture (picName);
        user.setPassword (passwordEncoder.encode (user.getPassword ()));
        managerRepository.save (user);
        return "redirect:/admin";
    }

    @RequestMapping(value = "/product/image", method = RequestMethod.GET)
    public void getImageAsByteArray(HttpServletResponse response, @RequestParam("fileName") String fileName) throws IOException {
        InputStream in = new FileInputStream ("D:\\bankSystem\\" + fileName);
        response.setContentType (MediaType.IMAGE_JPEG_VALUE);
        IOUtils.copy (in, response.getOutputStream ());
    }

    @RequestMapping(value = "/addRoom", method = RequestMethod.POST)
    public String addRoom(@ModelAttribute(name = "room") Room room, @RequestParam(value = "image") MultipartFile file) throws IOException {
        File dir = new File (imageUploadPath);
        if (!dir.exists ()) {
            dir.mkdir ();
        }
        String picName = System.currentTimeMillis () + "_" + file.getOriginalFilename ();
        File picture = new File ("D:\\bankSystem\\" + picName);
        file.transferTo (picture);
        room.setPicture (picName);
        roomRepository.save (room);
        return "redirect:/admin";
    }
}

