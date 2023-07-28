package com.ll.demo.domain.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usr/member")
public class MemberController {
    @GetMapping("/login")
    public String showMain() {
        return "usr/member/login";
    }
}
