package com.example.demo.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError(HttpServletRequest request) {
        System.out.println("**** CustomErrorController handleError ****");
        return "An error occurred: ";
    }

    public String getErrorPath() {
        System.out.println("**** CustomErrorController getErrorPath ****");
        return "/error";
    }
}
