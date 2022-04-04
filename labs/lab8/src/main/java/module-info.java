module uk.ac.swansea.cs135.labs.lab8 {
    requires javafx.controls;
    requires javafx.fxml;

    opens uk.ac.swansea.cs135.labs.lab8 to javafx.fxml;
    exports uk.ac.swansea.cs135.labs.lab8;
}
