module uk.ac.swansea.cs135.labs.lab9 {
    requires javafx.controls;
    requires javafx.fxml;

    opens uk.ac.swansea.cs135.labs.lab9 to javafx.fxml;
    exports uk.ac.swansea.cs135.labs.lab9;
}
