package com.example.demo.controllers;

import com.example.demo.dto.ParamDto;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/params")
public class RequestParamsController {

    @GetMapping("/foo")
    public ParamDto foo(@RequestParam(required = false, defaultValue = "Hola soy requestparam") String message){
        ParamDto paramDto= new ParamDto();
        paramDto.setMessage(message);
        return paramDto;
        //localhost:8080/api/params/foo?message=Hola
    }

    @GetMapping("/bar")
    public ParamDto bar(@RequestParam() String text, @RequestParam Integer code){
        ParamDto params= new ParamDto();
        params.setMessage(text);
        params.setCode(code);
        return params;
        //localhost:8080/api/params/foo?message=Hola&code=38010
    }

    @GetMapping("/request")
    public ParamDto request(HttpServletRequest request){
        ParamDto params= new ParamDto();
        params.setCode(Integer.valueOf(request.getParameter("code")));
        params.setMessage(request.getParameter("message"));
        return  params;
    }

}
