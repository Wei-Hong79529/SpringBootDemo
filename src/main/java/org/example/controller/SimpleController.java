package org.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SimpleController {
    @Value("${spring.application.name}")
    String appName;

    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String homePage(Model model) {
        model.addAttribute("appName", appName);
        return "home";
    }
}

