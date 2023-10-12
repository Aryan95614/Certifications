package com.coding.springboot.demo.mycoolapp.rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {


    @Value("${coach.name}")
    private String coachName;

    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }


}
