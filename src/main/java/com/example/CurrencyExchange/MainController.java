package com.example.CurrencyExchange;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    private MainService service;
    @Autowired
    public MainController(MainService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/exchange")
    public String exchange(@ModelAttribute("currencyExchange") CurrencyExchange currencyExchange) {
        service.getCurrencyExchange(currencyExchange);
        return "index";
    }
}