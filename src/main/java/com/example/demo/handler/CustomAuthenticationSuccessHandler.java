package com.example.demo.handler;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class CustomAuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
                                        Authentication authentication) throws IOException, ServletException {
        // Retrieve the 'continue' parameter
        String redirectUrl = request.getParameter("continue");

        // Validate and sanitize the URL if necessary

        if (redirectUrl != null && !redirectUrl.isEmpty()) {
            // Redirect to the desired URL
            getRedirectStrategy().sendRedirect(request, response, redirectUrl);
        } else {
            // Default redirection if 'continue' parameter is not present
            super.onAuthenticationSuccess(request, response, authentication);
        }
    }
}
