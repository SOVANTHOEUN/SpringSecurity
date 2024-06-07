package com.example.demo.service.impl;


import com.example.demo.model.SignUpRequest;
import com.example.demo.model.SigninRequest;
import com.example.demo.model.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);
    JwtAuthenticationResponse signin(SigninRequest request);
}