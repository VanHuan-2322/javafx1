module com.example.bai1tiente {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.bai1tiente to javafx.fxml;
    exports com.example.bai1tiente;
}