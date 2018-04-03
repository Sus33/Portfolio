package am.bank.banksystem.controller;

import am.bank.banksystem.model.AccessMoney;
import am.bank.banksystem.model.ExitMoney;
import am.bank.banksystem.repository.AccessMoneyRepository;
import am.bank.banksystem.repository.ExitMoneyRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CashierController {
    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AccessMoneyRepository accessMoneyRepository;
    @Autowired
    private ExitMoneyRepository exitMoneyRepository;

    @RequestMapping(value = "/cashierHome", method = RequestMethod.GET)
    public String mainPage(ModelMap map) {
        map.addAttribute("accessMoney", new AccessMoney ());
        map.addAttribute("exitMoney", new ExitMoney ());

        return "cashier";
    }

    @PostMapping(value = "/change")
    public String change(@ModelAttribute("accessMoney") AccessMoney money) {

        accessMoneyRepository.save(money);
        return "redirect:/cashierHome";
    }


    @PostMapping(value = "/changer")
    public String changer(@ModelAttribute("exitMoney") ExitMoney exitMoney) {
        exitMoneyRepository.save(exitMoney);

        return "redirect:/cashierHome";

    }

}
