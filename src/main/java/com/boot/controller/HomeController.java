package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    //The forward slash will identify which mapping it will take
    @RequestMapping("/")
    public String home(){
        return "Hello there Banele";
    }
}