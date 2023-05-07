package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class CQSMain extends Application {


    @Override
    public void start(Stage stage) throws IOException {

        // FXMLLoader fxmlLoader = new FXMLLoader(CQSMain.class.getResource("CQSMainMenu.fxml"));

        // Main Menu Loading


        try {
            Parent root = FXMLLoader.load(getClass().getResource("CQSMainMenu.fxml"));
            Scene mainMenu = new Scene(root);
            // Setting Icon
            stage.getIcons().add(new Image(CQSMain.class.getResourceAsStream("/Logo.png")));
            stage.setTitle("Crassior Quam Sanguine");
            stage.setScene(mainMenu);
            stage.show();
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {
        launch();
    }
}