package com.example.fruitProject.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    public String About() {
        return "templates/about.html";
    }
}
