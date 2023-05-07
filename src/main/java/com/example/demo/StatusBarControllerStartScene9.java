package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ProgressBar;
import javafx.stage.Stage;
import java.io.IOException;

public class StatusBarControllerStartScene9 extends StatusBarControllerStartScene8  {

    @FXML
    ProgressBar Bar_INTELLIGENCE;
    @FXML
    ProgressBar Bar_MOE;
    @FXML
    ProgressBar Bar_CONVENIENCE;
    @FXML
    RadioButton radio1;
    @FXML
    RadioButton radio2;



    private Stage stage;
    private Scene scene;
    private Parent root;

    // Sets appropriate values of INTEL, CONV, MOE
    static double INTEL = StatusBarControllerStartScene8.INTEL;
    static double CONV = StatusBarControllerStartScene8.CONV;
    static double MOE = StatusBarControllerStartScene8.MOE;


    // Resetting Options and Progress Bars
    public void Startup(){
        setDefaultValues(StatusBarControllerStartScene8.INTEL, StatusBarControllerStartScene8.MOE, StatusBarControllerStartScene8.CONV);
        radio1.setSelected(false);  radio2.setSelected(false);
    }


    // Switches to Scene 6
    public void switchToScene10(ActionEvent e) throws IOException {
        if(radio1.isSelected() || radio2.isSelected()){
            root = FXMLLoader.load(getClass().getResource("StartScene10.fxml"));
            stage =  (Stage) ( ((Node) e.getSource()).getScene().getWindow()  );
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();}

    }

    public void radioButtonSelect(ActionEvent e){

        System.out.println("INTEL = " + StatusBarControllerStartScene9.INTEL);
        System.out.println("MOE = " + StatusBarControllerStartScene9.MOE);
        System.out.println("CONV = " + StatusBarControllerStartScene9.CONV + "\n");

        if(radio1.isSelected()){
            setDefaultValues(StatusBarControllerStartScene8.INTEL, StatusBarControllerStartScene8.MOE, StatusBarControllerStartScene8.CONV);
            INTEL += 0.05;
            MOE += 0.15;

            if(INTEL > 0.9){

            }

            Bar_INTELLIGENCE.setProgress(INTEL);
            Bar_CONVENIENCE.setProgress(CONV);
            Bar_MOE.setProgress(MOE);
        }
        if(radio2.isSelected()){
            setDefaultValues(StatusBarControllerStartScene8.INTEL, StatusBarControllerStartScene8.MOE, StatusBarControllerStartScene8.CONV);
            MOE -= 0.15;

            Bar_INTELLIGENCE.setProgress(INTEL);
            Bar_CONVENIENCE.setProgress(CONV);
            Bar_MOE.setProgress(MOE);
        }



    }

    // Sets Default values
    public void setDefaultValues(double a, double b, double c){
        INTEL = a;
        MOE = b;
        CONV = c;
        Bar_INTELLIGENCE.setProgress(a);
        Bar_MOE.setProgress(b);
        Bar_CONVENIENCE.setProgress(c);
    }


}