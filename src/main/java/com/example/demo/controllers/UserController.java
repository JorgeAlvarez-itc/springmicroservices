package com.example.demo.controllers;

import com.example.demo.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Map<String,Object> model){
        User user= new User("Jorge","Alvarez","jalvarezm@flensa.com.mx");
        model.put("title","Curso de microservicios");
        model.put("user",user);
        return "details";
    }

    @GetMapping("/listUsers")
    public String list(ModelMap model){
        List<User> userList=  Arrays.asList(
          new User("Jorge","Alvarez","jalvarezm@flensa.com.mx"),
          new User("Abdiel","Lopez","alopez@flensa.com.mx"),
          new User("Moises","Santibanez","mramirez@flensa.com.mx"),
          new User("Kevin","Torres","ktorres@flensa.com.mx")
        );
        model.addAttribute("users",userList);
        model.addAttribute("title","Lista de usuarios");
        return "list";
    }

}
