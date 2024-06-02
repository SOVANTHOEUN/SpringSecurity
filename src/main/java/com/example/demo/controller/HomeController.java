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
    public String home(HttpServletRequest request) throws ServletException {
//        Cookie[] cookies = request.getCookies();
//        if (cookies != null) {
//            Arrays.stream(cookies).forEach(cookie -> {
//                String cookieInfo = String.format("Config Name: %s, Value: %s, Domain: %s, Path: %s, MaxAge: %d, Secure: %b, HttpOnly: %b",
//                        cookie.getName(), cookie.getValue(), cookie.getDomain(), cookie.getPath(), cookie.getMaxAge(), cookie.getSecure(), cookie.isHttpOnly());
//                System.out.println(cookieInfo);
//            });
//        } else {
//            System.out.println("No cookies found");
//        }
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
//        request.logout();
        System.out.println("**** called login ****");
        return "login";
    }

    @GetMapping("/logout")
    public void logout(HttpServletRequest request) throws ServletException {
        System.out.println("**** logout controller ****");
        request.logout();
    }


    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println(encoder.encode("admin"));
    }

}
