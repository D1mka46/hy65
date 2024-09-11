package com.example.project;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class HelloController {

    @FXML
    private Button but;

    @FXML
    private Text finalText;

    @FXML
    private VBox grup;

    @FXML
    private CheckBox t1;

    @FXML
    private CheckBox t2;

    @FXML
    private CheckBox t3;

    @FXML
    private CheckBox t4;

    @FXML
    private CheckBox t5;

    @FXML
    public void Button() throws InterruptedException {
        if (t5.isSelected()){
            grup.setVisible(false);
            finalText.setVisible(true);
            finalText.setText("Спасибо за выбор!");
        } else if (t1.isSelected()) {
            grup.setVisible(false);
            finalText.setVisible(true);
            finalText.setText("Спасибо за выбор!");
        } else if (t2.isSelected()) {
            grup.setVisible(false);
            finalText.setVisible(true);
            finalText.setText("Спасибо за выбор!");
        }else if (t3.isSelected()) {
            grup.setVisible(false);
            finalText.setVisible(true);
            finalText.setText("Спасибо за выбор!");
        }else if (t4.isSelected()) {
            grup.setVisible(false);
            finalText.setVisible(true);
            finalText.setText("Спасибо за выбор!");
        }
        else{
            grup.setVisible(false);
            finalText.setVisible(true);
            //finalText.setText("Пусто...");
            Thread.sleep(1000);
            finalText.setText("Дасиданея!");
        }
    }
}
