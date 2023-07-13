package com.gmail.woosay333.springbootdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        log.info("Main controller is working");

        model.addAttribute("title", "Home page");

        return "main";
    }

}
