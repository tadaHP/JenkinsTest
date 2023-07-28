package com.ll.demo.domain.home.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String redirectToMain() {
        return "redirect:/usr/home/main";
    }

    @GetMapping("/usr/home/main")
    public String showMain() {
        return "usr/home/main";
    }

    @GetMapping("/usr/home/needLogin")
    @PreAuthorize("isAuthenticated()")
    public String showNeedLogin() {
        return "usr/home/needLogin";
    }
}
