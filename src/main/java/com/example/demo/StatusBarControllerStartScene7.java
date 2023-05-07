
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

public class StatusBarControllerStartScene7 extends StatusBarControllerStartScene6  {

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
    @FXML
    RadioButton radio3;
    @FXML
    RadioButton radio4;


    private Stage stage;
    private Scene scene;
    private Parent root;

    // Sets appropriate values of INTEL, CONV, MOE
    static double INTEL = StatusBarControllerStartScene6.INTEL;
    static double CONV = StatusBarControllerStartScene6.CONV;
    static double MOE = StatusBarControllerStartScene6.MOE;


    // Resetting Options and Progress Bars
    public void Startup(){
        setDefaultValues(StatusBarControllerStartScene6.INTEL, StatusBarControllerStartScene6.MOE, StatusBarControllerStartScene6.CONV);
        radio1.setSelected(false);  radio2.setSelected(false);  radio3.setSelected(false);  radio4.setSelected(false);
    }


    // Switches to Scene 6
    public void switchToScene8(ActionEvent e) throws IOException {
        if(radio1.isSelected() || radio2.isSelected()||radio3.isSelected()||radio4.isSelected()){
            root = FXMLLoader.load(getClass().getResource("StartScene8.fxml"));
            stage =  (Stage) ( ((Node) e.getSource()).getScene().getWindow()  );
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();}

    }

    public void radioButtonSelect(ActionEvent e){

        System.out.println("INTEL = " + StatusBarControllerStartScene7.INTEL);
        System.out.println("MOE = " + StatusBarControllerStartScene7.MOE);
        System.out.println("CONV = " + StatusBarControllerStartScene7.CONV + "\n");

        if(radio1.isSelected()){
            setDefaultValues(StatusBarControllerStartScene6.INTEL, StatusBarControllerStartScene6.MOE, StatusBarControllerStartScene6.CONV);
            INTEL -= 0.2;
            CONV -= 0.1;


            Bar_INTELLIGENCE.setProgress(INTEL);
            Bar_CONVENIENCE.setProgress(CONV);
            Bar_MOE.setProgress(MOE);
        }
        if(radio2.isSelected()){
            setDefaultValues(StatusBarControllerStartScene6.INTEL, StatusBarControllerStartScene6.MOE, StatusBarControllerStartScene6.CONV);
            CONV += 0.2;
            INTEL += 0.2;

            Bar_INTELLIGENCE.setProgress(INTEL);
            Bar_CONVENIENCE.setProgress(CONV);
            Bar_MOE.setProgress(MOE);
        }
        if(radio3.isSelected()){
            setDefaultValues(StatusBarControllerStartScene6.INTEL, StatusBarControllerStartScene6.MOE, StatusBarControllerStartScene6.CONV);
            INTEL -= 0.25;
            CONV -= 0.25;

            Bar_INTELLIGENCE.setProgress(INTEL);
            Bar_CONVENIENCE.setProgress(CONV);
            Bar_MOE.setProgress(MOE);
        }
        if(radio4.isSelected()){
            setDefaultValues(StatusBarControllerStartScene6.INTEL, StatusBarControllerStartScene6.MOE, StatusBarControllerStartScene6.CONV);
            INTEL += 0.3;
            CONV -= 0.1;

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