package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class CQSController {


    public static String name;
    @FXML
    private TextField NameTextField;
    @FXML
    private Label lbl1_SS2;


    private Stage stage;
    private Scene scene;
    private Parent root;


    // Scene Switchers
    public void switchToMainMenu(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("CQSMainMenu.fxml"));
        stage =  (Stage) ( ((Node) event.getSource()).getScene().getWindow()  );
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToCredits(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Credits.fxml"));
        stage =  (Stage) ( ((Node) event.getSource()).getScene().getWindow()  );
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToScene1(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("StartScene1.fxml"));
        stage =  (Stage) ( ((Node) event.getSource()).getScene().getWindow()  );
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    // "Next" Button on Scene1
    public void switchToScene2(ActionEvent event) throws IOException{

        // Ensuring name is processed when Next button is pressed.
        name = String.valueOf(NameTextField.getText());

        root = FXMLLoader.load(getClass().getResource("StartScene2.fxml"));
        stage =  (Stage) ( ((Node) event.getSource()).getScene().getWindow()  );
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToScene3(ActionEvent e) throws IOException{
        root = FXMLLoader.load(getClass().getResource("StartScene3.fxml"));
        stage =  (Stage) ( ((Node) e.getSource()).getScene().getWindow()  );
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToScene4(ActionEvent e) throws IOException{
        root = FXMLLoader.load(getClass().getResource("StartScene4.fxml"));
        stage =  (Stage) ( ((Node) e.getSource()).getScene().getWindow()  );
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToPhase1_HighINTEL(ActionEvent e) throws IOException{
        root = FXMLLoader.load(getClass().getResource("Phase1_HighINTEL.fxml"));
        stage =  (Stage) ( ((Node) e.getSource()).getScene().getWindow()  );
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    // Input Code
    public void Exit(ActionEvent e){

        System.exit(1);
    }

    public void getName(ActionEvent e){
        try{
        name = String.valueOf(NameTextField.getText());
        }
        catch(Exception exception){
            System.out.println(exception.getCause());
        }

    }




    // Game Over Phase 1 Checker
    /*public void Phase1_FailureChecker(double INTEL, double MOE, double CONV) throws IOException{
        if(INTEL >= 0.95){
            // switch to Phase1_HighINTEL
            ActionEvent e = new ActionEvent();
            root = FXMLLoader.load(getClass().getResource("Phase1_HighINTEL.fxml"));
            stage =  (Stage) ( ((Node) e.getSource()).getScene().getWindow()  );
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

        if(INTEL < 0.5){
            // switch to Phase1_HighINTEL

        }

        if(CONV > 0.95){
            // switch to Phase1_LowINTEL

        }

        if(MOE > 0.95){
            // switch to Phase1_HighMOE

        }

        if(MOE < 0.5){
            // switch to Phase1_LowMOE

        }

    }*/





}