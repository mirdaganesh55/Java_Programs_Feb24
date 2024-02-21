package com.orm.java;

import javafx.application.Application;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ConsoleStringToImageUI extends Application {

    @SuppressWarnings("restriction")
	public static void main(String[] args) {
        launch(args);
    }

    @SuppressWarnings("restriction")
	@Override
    public void start(Stage primaryStage) {
        // Replace this string with the console output you want to display as an image
        String consoleString = "Hello, this is a sample string from the console.";

        // Convert the string to a BufferedImage
        BufferedImage bufferedImage = convertStringToImage(consoleString);

        // Convert BufferedImage to JavaFX Image
        Image image = SwingFXUtils.toFXImage(bufferedImage, null);

        // Create UI elements
        ImageView imageView = new ImageView(image);
        Label label = new Label("Console Output Image:");
        
        // Display the console string in a TextArea
        TextArea textArea = new TextArea(consoleString);
        textArea.setEditable(false);

        // Set up the layout
        VBox root = new VBox(10);
        root.getChildren().addAll(label, imageView, textArea);

        // Set up the scene
        Scene scene = new Scene(root, 400, 300);

        // Set up the stage
        primaryStage.setTitle("Console String to Image UI");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private BufferedImage convertStringToImage(String input) {
        // You can implement your own logic to convert the string to an image.
        // For demonstration purposes, this example simply converts the string to a BufferedImage.

        BufferedImage bufferedImage = new BufferedImage(300, 100, BufferedImage.TYPE_INT_ARGB);
        bufferedImage.getGraphics().drawString(input, 10, 50);

        return bufferedImage;
    }
}
