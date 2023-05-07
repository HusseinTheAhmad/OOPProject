package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ProgressBar;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class StatusBarControllerStartScene4 extends CQSController implements Initializable  {
    @FXML
    Button SubmitButtonScene4;
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

    static double INTEL;
    static double CONV;
    static double MOE;     // Intelligence, convenience, Magnitude of Empathizing/Empathy
    private Stage stage;
    private Scene scene;
    private Parent root;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Bar_INTELLIGENCE.setStyle("-fx-accent: red;");
        Bar_MOE.setStyle("-fx-accent: green;");
        Bar_CONVENIENCE.setStyle("-fx-accent: blue;");
    }

    public void switchToScene5(ActionEvent e) throws IOException {

        if(radio1.isSelected() || radio2.isSelected()||radio3.isSelected()||radio4.isSelected()){
            root = FXMLLoader.load(getClass().getResource("StartScene5.fxml"));
            stage =  (Stage) ( ((Node) e.getSource()).getScene().getWindow()  );
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }


    }

    public void Startup(){
        setDefaultValues(0.5, 0.5, 0.5);
        radio1.setSelected(false);  radio2.setSelected(false);  radio3.setSelected(false);  radio4.setSelected(false);
    }


    public void radioButtonSelect(ActionEvent e){

        if(radio1.isSelected() /*&& e.getSource() == SubmitButtonScene4*/){
            setDefaultValues(0.5, 0.5, 0.5);
            INTEL += 0.1;

            Bar_INTELLIGENCE.setProgress(INTEL);
            Bar_CONVENIENCE.setProgress(CONV);
            Bar_MOE.setProgress(MOE);
        }
        if(radio2.isSelected()  /*&& e.getSource() == SubmitButtonScene4*/){
            setDefaultValues(0.5, 0.5, 0.5);
            CONV -= 0.1;

            Bar_INTELLIGENCE.setProgress(INTEL);
            Bar_CONVENIENCE.setProgress(CONV);
            Bar_MOE.setProgress(MOE);
        }
        if(radio3.isSelected() /*&& e.getSource() == SubmitButtonScene4*/){
            setDefaultValues(0.5, 0.5, 0.5);
            INTEL += 0.1;
            CONV += 0.2;

            Bar_INTELLIGENCE.setProgress(INTEL);
            Bar_CONVENIENCE.setProgress(CONV);
            Bar_MOE.setProgress(MOE);
        }
        if(radio4.isSelected() /*&& e.getSource() == SubmitButtonScene4*/){
            setDefaultValues(0.5, 0.5, 0.5);
            INTEL -= 0.2;
            CONV -= 0.2;

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
