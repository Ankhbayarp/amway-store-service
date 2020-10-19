package com.mn.amway.storeservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    //@GetMapping("")
    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("appName", "ankhaa");
        model.addAttribute("formatted", "<b>blue</b>");
        return "home";
    }
}