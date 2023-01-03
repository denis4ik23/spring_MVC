package com.denis4ik23.springmvc.config.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecondController {

    @GetMapping("/exit")
    public String exit() {
        return "second/exit";
    }
}
