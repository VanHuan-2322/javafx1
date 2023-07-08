package com.example.ungdungmaytinh;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    TextField a,b;

    @FXML
    protected void congHelloButtonClick() {
      double a=Double.parseDouble(this.a.getText());
      double b=Double.parseDouble(this.b.getText());
      double cong= a+b;
        Alert alert= new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Kết quả là: "+cong);
        alert.show();
    }
    @FXML
    protected void truHelloButtonClick() {
      double a=Double.parseDouble(this.a.getText());
      double b=Double.parseDouble(this.b.getText());
      double tru= a-b;
        Alert alert= new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Kết quả là: "+tru);
        alert.show();
    }
    @FXML
    protected void nhanHelloButtonClick() {
      double a=Double.parseDouble(this.a.getText());
      double b=Double.parseDouble(this.b.getText());
      double nhan= a*b;
        Alert alert= new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Kết quả là: "+nhan);
        alert.show();
    }
    @FXML
    protected void chiaHelloButtonClick() {
      double a=Double.parseDouble(this.a.getText());
      double b=Double.parseDouble(this.b.getText());
      double chia = a/b;
        Alert alert= new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Kết quả là: "+chia);
        alert.show();
    }
}