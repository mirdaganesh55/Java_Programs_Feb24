package com.orm.java;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Random;

public class CaptchaGenerator {

    private static final int WIDTH = 200;
    private static final int HEIGHT = 50;
    private static final int CAPTCHA_LENGTH = 6;

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final Font FONT = new Font("Arial", Font.PLAIN, 30);

    public static String generateCaptcha() {
        StringBuilder captchaText = new StringBuilder();

        Random random = new Random();
        for (int i = 0; i < CAPTCHA_LENGTH; i++) {
            int index = random.nextInt(CHARACTERS.length());
            captchaText.append(CHARACTERS.charAt(index));
        }

        return captchaText.toString();
    }

    public static BufferedImage createCaptchaImage(String captchaText) {
        BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
        Graphics graphics = image.getGraphics();

        // Set background color
        graphics.setColor(Color.WHITE);
        graphics.fillRect(0, 0, WIDTH, HEIGHT);

        // Set font and draw characters
        graphics.setFont(FONT);
        for (int i = 0; i < captchaText.length(); i++) {
            graphics.setColor(getRandomColor());
            graphics.drawString(String.valueOf(captchaText.charAt(i)), 20 * i + 10, HEIGHT / 2 + 10);
        }

        // Add noise
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            graphics.setColor(getRandomColor());
            int x = random.nextInt(WIDTH);
            int y = random.nextInt(HEIGHT);
            graphics.fillRect(x, y, 2, 2);
        }

        graphics.dispose();

        return image;
    }

    private static Color getRandomColor() {
        Random random = new Random();
        return new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
    }

    public static void main(String[] args) {
        String captchaText = generateCaptcha();
        BufferedImage captchaImage = createCaptchaImage(captchaText);
        
        // In a real application, you might save the image or display it to the user
        // For simplicity, let's just print the CAPTCHA text for verification
        System.out.println("CAPTCHA Text: " + captchaText);
        System.out.println(captchaImage);
    }
}

