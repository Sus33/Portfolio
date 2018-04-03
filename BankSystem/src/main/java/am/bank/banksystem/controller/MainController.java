package am.bank.banksystem.controller;

import am.bank.banksystem.model.User;
import am.bank.banksystem.model.UserType;
import am.bank.banksystem.repository.ManagerRepository;
import am.bank.banksystem.security.CurrentUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    private User user;
    @Autowired
    private ManagerRepository managerRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String mainPage(ModelMap map) {
        map.addAttribute("allCollegas", managerRepository.findAll());
        map.addAttribute("manager", new User());

        return "login";
    }

    @RequestMapping(value = "/loginSuccess", method = RequestMethod.GET)
    public String loginSuccess() {
        CurrentUser principal = (CurrentUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal.getUser().getUserType() == UserType.MANAGER) {
            return "redirect:/admin";
        } else {
            if (principal.getUser().getUserType() == UserType.JEWELER) {
                return "redirect:/jewelerHome";

            }
        }
        return "redirect:/";
    }
    @RequestMapping(value = "/loginPage", method = RequestMethod.GET)
    public String login() {
        if (user.getUserType().equals(UserType.MANAGER)) {
            return "login";

            }

        return null;
    }
}