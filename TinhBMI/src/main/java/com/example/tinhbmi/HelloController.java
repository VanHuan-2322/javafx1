package com.example.tinhbmi;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class HelloController {
    @FXML
    TextField height, weight;

    @FXML
    protected void onHelloButtonClick() {
        double height = Double.parseDouble(this.height.getText());
        double weight = Double.parseDouble(this.weight.getText());
        double BMI = weight / (height * height);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        alert.show();
        if (BMI < 18.5) {
            String string = "Chỉ số BMI là: " + BMI + " Suy dinh dưỡng";
            Text text = new Text(string);
            text.setWrappingWidth(350);
            alert.getDialogPane().setContent(text);

        } else if (BMI >= 18.5 && BMI < 24.9) {
            String string = "Chỉ số BMI là: " + BMI + " Bình thường";
            Text text = new Text(string);
            text.setWrappingWidth(350);
            alert.getDialogPane().setContent(text);
        } else {
            String string = "Chỉ số BMI là: " + BMI + " Béo phì";
            Text text = new Text(string);
            text.setWrappingWidth(350);
            alert.getDialogPane().setContent(text);

        }
        alert.show();
    }
}