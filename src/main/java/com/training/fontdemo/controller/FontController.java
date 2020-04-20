package com.training.fontdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FontController {
    @GetMapping("font")
    public String font() {
        return "font";
    }
}
