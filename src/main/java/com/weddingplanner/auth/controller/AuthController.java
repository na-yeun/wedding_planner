package com.weddingplanner.auth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping({"/", "/login"})
    public String loginForm() {
        return "auth/login";
    }

    @GetMapping("/password/find")
    public String findPasswordForm() {
        return "auth/find-password";
    }
}
