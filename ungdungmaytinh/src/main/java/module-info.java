module com.example.ungdungmaytinh {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.ungdungmaytinh to javafx.fxml;
    exports com.example.ungdungmaytinh;
}