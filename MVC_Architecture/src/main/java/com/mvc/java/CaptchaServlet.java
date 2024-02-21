package com.mvc.java;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.orm.java.CaptchaGenerator;

@WebServlet("/captcha")
public class CaptchaServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Generate CAPTCHA text
        String captchaText = CaptchaGenerator.generateCaptcha();

        // Create CAPTCHA image
        BufferedImage captchaImage = CaptchaGenerator.createCaptchaImage(captchaText);

        // Set response content type
        response.setContentType("image/png");

        // Send the image to the client
        OutputStream outputStream = response.getOutputStream();
        ImageIO.write(captchaImage, "png", outputStream);
        outputStream.close();

        // Save the CAPTCHA text in the session for validation
        request.getSession().setAttribute("captchaText", captchaText);
    }
}
