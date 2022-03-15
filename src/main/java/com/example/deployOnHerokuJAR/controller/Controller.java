package com.example.deployOnHerokuJAR.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String welcome()
    {
        return "hiyaaa";
    }

    @GetMapping("/trial")
    public String secondLink()
    {
        return "trial page";
    }

    @GetMapping("/trial/123")
    public String thirdLink()
    {
        return "trial page 123";
    }


}
