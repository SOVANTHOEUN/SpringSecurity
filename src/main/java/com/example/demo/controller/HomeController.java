package com.example.demo.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//@RestController
@Controller
public class HomeController {

    @GetMapping("/")
    public String landing(){
        return "landing";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/signup")
    public String signup(){
        return "signup";
    }

    @GetMapping("/forget-password")
    public String forgetPassword(){
        return "forget-password";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/logout")
    public void logout(HttpServletRequest request) throws ServletException {
        request.logout();
    }

    public static void main(String[] args) {
        // generate jwt token here

    }

}
