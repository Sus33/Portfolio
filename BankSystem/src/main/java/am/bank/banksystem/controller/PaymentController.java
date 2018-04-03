package am.bank.banksystem.controller;

import am.bank.banksystem.model.Payment;
import am.bank.banksystem.repository.CitizenRepository;
import am.bank.banksystem.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class PaymentController {

    @Autowired
    private PaymentRepository paymentRepository;
    @Autowired
    private CitizenRepository citizenRepository;

    @RequestMapping(value = "/paymentPoint", method = RequestMethod.GET)
    public String addPayment(ModelMap map) {
        map.addAttribute("payment", new Payment ());
        map.addAttribute("allCitizen",citizenRepository.findAll());

        return "payment";
    }

    @PostMapping(value = "/payment")
    public String change(@ModelAttribute("payment") Payment payment) {

        paymentRepository.save(payment);
        return "redirect:/paymentPoint";

    }
}
