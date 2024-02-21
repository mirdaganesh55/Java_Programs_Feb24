package com.mvc.java;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/validateCaptcha")
public class ValidateCaptchaServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get the entered CAPTCHA text
        String enteredCaptcha = request.getParameter("captcha");

        // Get the stored CAPTCHA text from the session
        String storedCaptcha = (String) request.getSession().getAttribute("captchaText");

        // Validate the entered CAPTCHA
        if (enteredCaptcha != null && enteredCaptcha.equals(storedCaptcha)) {
            // CAPTCHA is valid
            response.getWriter().println("CAPTCHA is valid!");
        } else {
            // CAPTCHA is invalid
            response.getWriter().println("CAPTCHA is invalid!");
        }
    }
}
