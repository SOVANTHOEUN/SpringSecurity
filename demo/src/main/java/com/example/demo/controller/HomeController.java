package com.example.demo.controller;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/logout")
    public void logout(HttpServletRequest request) throws ServletException {
        System.out.println("**** logout controller ****");
        request.logout();
    }

    @GetMapping("/login")
    public String logout() {
        System.out.println("**** login controller ****");
        return "login";
    }

}
