module com.example.javafxlesson1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxlesson1 to javafx.fxml;
    exports com.example.javafxlesson1;
}