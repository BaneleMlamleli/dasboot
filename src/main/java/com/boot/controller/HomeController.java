package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    //This code will run spring boot
    @RequestMapping("/")
    public String home(){
        return "Hello there Banele";
    }
}