module lab_13.calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens lab_13.calculator to javafx.fxml;
    exports lab_13.calculator;
}