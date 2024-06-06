//package com.example.demo.config;
//
//import com.example.demo.handler.CustomAuthenticationSuccessHandler;
//import jakarta.servlet.http.HttpSessionEvent;
//import jakarta.servlet.http.HttpSessionListener;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityInMemory {
//    private static final String[] ALLOWED_URIS = {
//            "/css/**", "/js/**", "/images/**"
//    };
//
//    @Autowired
//    private CustomAuthenticationSuccessHandler customAuthenticationSuccessHandler;
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//            .sessionManagement(sessionManagement ->
//                    sessionManagement
//                            .sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED)
//                            .sessionFixation()
//                            .migrateSession()
//                            .maximumSessions(1)
//                            .maxSessionsPreventsLogin(true)
//                            .expiredUrl("/sessionExpired.html")
//            )
//            .authorizeRequests(authorizeRequests ->
//                    authorizeRequests
//                            .requestMatchers(ALLOWED_URIS).permitAll()
//                            .anyRequest().authenticated()
//            )
//            .formLogin(formLogin ->
//                    formLogin
//                            .loginPage("/login")
//                            .successHandler(customAuthenticationSuccessHandler) //Redirect to last access url after successful login
//                            .permitAll()
//            )
//            .logout(logout ->
//                    logout
//                            .permitAll()
//            );
//        return http.build();
//    }
//
//
//    /*
//     * In-memory authentication
//     * */
//    @Bean
//    public UserDetailsService userDetailsService() {
//        UserDetails user = User.withDefaultPasswordEncoder()
//                .username("admin")
//                .password("admin")
//                .roles("USER")
//                .build();
//        return new InMemoryUserDetailsManager(user);
//    }
//
//    @Bean
//    public HttpSessionListener httpSessionListener() {
//        return new HttpSessionListener() {
//            @Override
//            public void sessionCreated(HttpSessionEvent se) {
//                se.getSession().setMaxInactiveInterval(60); // 60 seconds (1 minute)
//            }
//
//            @Override
//            public void sessionDestroyed(HttpSessionEvent se) {
//                // You can handle session destroy events here if needed
//            }
//        };
//    }
//}
