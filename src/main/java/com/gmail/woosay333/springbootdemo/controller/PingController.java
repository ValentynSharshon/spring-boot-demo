package com.gmail.woosay333.springbootdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class PingController {

    @GetMapping("/ping")
    public String ping(Model model) {
        log.info("Ping controller is working");

        model.addAttribute("title", "Ping page");

        return "ping";
    }

}
