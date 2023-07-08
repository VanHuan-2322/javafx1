package com.example.bai1tiente;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    TextField money;

    @FXML
    protected void onHelloButtonClick() {
        double rate = 23000;
        double money = Double.parseDouble(this.money.getText());
        double total = rate * money;
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Số tiền khi chuyển là: " + total + "VNĐ");
        alert.show();
    }
}