package com.example.demo.controllers;

import com.example.demo.dto.UserDto;
import com.example.demo.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserRestController {
    @GetMapping("/details2")
    public UserDto details(){
        UserDto userDto= new UserDto();
        userDto.setTitle("Curso de microservicios");
        User user = new User("Jorge","Alvarez");
        userDto.setUser(user);
        return userDto;
    }

    @GetMapping("/details-map")
    public Map<String, Object> details_map(){
        User user = new User("Jorge","Alvarez");
        Map<String,Object> body = new HashMap<>();
        body.put("title","Curso de microservicios");
        body.put("user",user);

        return body;
    }

    public List<User> list(){
        User jorge = new User("Jorge","Alvarez");
        User alejandro = new User("Alejandro","Mandujano");
        User abdiel = new User("Abdiel","Lopez");

        List<User> userList = new ArrayList<>();

        userList.add(jorge);
        userList.add(alejandro);
        userList.add(abdiel);

        return userList;
    }
}
