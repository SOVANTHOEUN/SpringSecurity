package com.example.demo.config;

import com.example.demo.handler.CustomAuthenticationSuccessHandler;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityJDBC {
    @Autowired
    private CustomAuthenticationSuccessHandler customAuthenticationSuccessHandler;

    private static final String[] ALLOWED_URIS = {
            "/css/**", "/js/**", "/images/**"
    };

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .authorizeRequests(authorizeRequests ->
                    authorizeRequests
                            .requestMatchers(ALLOWED_URIS).permitAll()
                            .anyRequest().authenticated()
            )
            .formLogin(formLogin ->
                    formLogin
                            .loginPage("/login")
                            .successHandler(customAuthenticationSuccessHandler) //Redirect to last access url after successful login
                            .permitAll()
            )
            .logout(logout ->
                    logout
                            .permitAll()
            );
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public HttpSessionListener httpSessionListener() {
        return new HttpSessionListener() {
            @Override
            public void sessionCreated(HttpSessionEvent se) {
                se.getSession().setMaxInactiveInterval(60); // 60 seconds (1 minute)
            }

            @Override
            public void sessionDestroyed(HttpSessionEvent se) {
                // You can handle session destroy events here if needed
            }
        };
    }

}
