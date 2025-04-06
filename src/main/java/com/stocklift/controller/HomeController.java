package com.stocklift.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String home(){
        return "welcome to trading platform";
    }
    @GetMapping("/api")
    public String secure(){
        return "welcome to trading platform Secure";
    }
}


