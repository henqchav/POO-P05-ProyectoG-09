module com.mycompany.avancep {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.avancep to javafx.fxml;
    exports com.mycompany.avancep;
}
