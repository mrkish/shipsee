package com.shipsee.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "")
public class HomeController {

    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("title", "Welcome!");

        return "index";
    }
}
