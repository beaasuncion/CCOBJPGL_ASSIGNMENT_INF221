package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import model.*;

public class ClassmatesController {

@FXML

Button btn1, btn2,btn3,btn4,btn5;

Christine christine = new Christine();
Carlo carlo = new Carlo();
Arjay arjay = new Arjay();
Jasper jasper = new Jasper();
Darwin darwin = new Darwin();


public void initialize() {

darwin.setName("Darwin Umengan");
darwin.setage("19");
darwin.setcolor("blue");

christine.setName("Christine Lu");
christine.setage("19");
christine.setcolor("green");

jasper.setName("Jasper Deguito");
jasper.setage("19");
jasper.setcolor("yellow");

arjay.setName("Arjay balboa");
arjay.setage("20");
arjay.setcolor("black");

carlo.setName("Jhon Carlo Palatino");
carlo.setage("19");
carlo.setcolor("yellow");

}

public void showInfo(ActionEvent event) {


Button sourceButton = (Button) event.getSource();
 Alert alert = new Alert(AlertType.INFORMATION);


if (sourceButton.equals(btn1)) {
alert.setContentText("Hi my name is " + darwin.getName() + ", I'm " + darwin.getage() + " yrs old" + " and my favorite is " + darwin.getcolor() + "!"); 
}

if (sourceButton == btn2) {
    alert.setContentText("Hi my name is " + carlo.getName() + ", I'm " + carlo.getage() + " yrs old" + " and my favorite is " + carlo.getcolor() + "!");
    }

if (sourceButton.equals(btn3)) {
alert.setContentText("Hi my name is " + christine.getName() + ", I'm " + christine.getage() + " yrs old"+ " and my favorite is " + christine.getcolor() + "!");
}

if (sourceButton == btn4) {
alert.setContentText("Hi my name is " + jasper.getName() + ", I'm " + jasper.getage() + " yrs old"+ " and my favorite is " + jasper.getcolor()+ "!");
}

if (sourceButton == btn5) {
alert.setContentText("Hi my name is " + arjay.getName() + ", I'm " + arjay.getage() + " yrs old"+ " and my favorite is " + arjay.getcolor()+ "!");
}

alert.showAndWait();
    }
}
