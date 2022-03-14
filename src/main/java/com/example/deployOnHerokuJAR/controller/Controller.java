package com.example.deployOnHerokuJAR.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String func()
    {
        return "hiyaaa";
    }
}
