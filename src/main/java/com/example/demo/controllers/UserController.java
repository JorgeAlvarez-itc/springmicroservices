package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){
        model.addAttribute("title","Curso de microservicios");
        model.addAttribute("name","Jorge Alvarez");
        model.addAttribute("lastName","Alvarez");
        return "details";
    }

}
