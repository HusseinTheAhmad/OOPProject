package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

import java.io.IOException;

public class StatusBarControllerStartScene5 extends StatusBarControllerStartScene4  {

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


    static double INTEL = StatusBarControllerStartScene4.INTEL;
    static double CONV = StatusBarControllerStartScene4.CONV;
    static double MOE = StatusBarControllerStartScene4.MOE;

    public void Startup(){
        setDefaultValues(StatusBarControllerStartScene4.INTEL, StatusBarControllerStartScene4.MOE, StatusBarControllerStartScene4.CONV);
        radio1.setSelected(false);  radio2.setSelected(false);  radio3.setSelected(false);  radio4.setSelected(false);
    }


    public void switchToScene6(ActionEvent e) throws IOException {
        if(radio1.isSelected() || radio2.isSelected()||radio3.isSelected()||radio4.isSelected()){
        root = FXMLLoader.load(getClass().getResource("StartScene6.fxml"));
        stage =  (Stage) ( ((Node) e.getSource()).getScene().getWindow()  );
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();}

    }

    public void radioButtonSelect(ActionEvent e){

        System.out.println("INTEL = " + StatusBarControllerStartScene4.INTEL);
        System.out.println("MOE = " + StatusBarControllerStartScene4.MOE);
        System.out.println("CONV = " + StatusBarControllerStartScene4.CONV + "\n");

        if(radio1.isSelected() /*&& e.getSource() == SubmitButtonScene4*/){
            setDefaultValues(StatusBarControllerStartScene4.INTEL, StatusBarControllerStartScene4.MOE, StatusBarControllerStartScene4.CONV);
            INTEL += 0.1;
            CONV += 0.2;

            if(INTEL > 0.95){

            }

            Bar_INTELLIGENCE.setProgress(INTEL);
            Bar_CONVENIENCE.setProgress(CONV);
            Bar_MOE.setProgress(MOE);
        }
        if(radio2.isSelected()  /*&& e.getSource() == SubmitButtonScene4*/){
            setDefaultValues(StatusBarControllerStartScene4.INTEL, StatusBarControllerStartScene4.MOE, StatusBarControllerStartScene4.CONV);
            CONV -= 0.2;
            INTEL += 0.05;

            Bar_INTELLIGENCE.setProgress(INTEL);
            Bar_CONVENIENCE.setProgress(CONV);
            Bar_MOE.setProgress(MOE);
        }
        if(radio3.isSelected() /*&& e.getSource() == SubmitButtonScene4*/){
            setDefaultValues(StatusBarControllerStartScene4.INTEL, StatusBarControllerStartScene4.MOE, StatusBarControllerStartScene4.CONV);
            INTEL -= 0.1;
            CONV -= 0.15;

            Bar_INTELLIGENCE.setProgress(INTEL);
            Bar_CONVENIENCE.setProgress(CONV);
            Bar_MOE.setProgress(MOE);
        }
        if(radio4.isSelected() /*&& e.getSource() == SubmitButtonScene4*/){
            setDefaultValues(StatusBarControllerStartScene4.INTEL, StatusBarControllerStartScene4.MOE, StatusBarControllerStartScene4.CONV);
            INTEL -= 0.3;
            CONV -= 0.2;
            MOE -= 0.15;

            Bar_INTELLIGENCE.setProgress(INTEL);
            Bar_CONVENIENCE.setProgress(CONV);
            Bar_MOE.setProgress(MOE);
        }


    }

    public void setDefaultValues(double a, double b, double c){
        INTEL = a;
        MOE = b;
        CONV = c;
        Bar_INTELLIGENCE.setProgress(a);
        Bar_MOE.setProgress(b);
        Bar_CONVENIENCE.setProgress(c);
    }




}

