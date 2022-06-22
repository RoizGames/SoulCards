module com.example.cartas {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cartas to javafx.fxml;
    exports com.example.cartas;
}