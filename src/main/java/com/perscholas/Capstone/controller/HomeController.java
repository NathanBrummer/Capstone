package com.perscholas.Capstone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"/", "/index"})
    public String index(Model model) { return "home"; }

    @GetMapping({"/schedule"})
    public String schedule(Model model) { return "schedule"; }

    @GetMapping({"/application"})
    public String application(Model model) { return "application"; }

}
