module com.example.proba {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    //requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires com.fasterxml.jackson.annotation;
    requires com.fasterxml.jackson.databind;

    opens com.example.proba to javafx.fxml;
    exports com.example.proba;
    exports com.example.proba.Model;
    opens com.example.proba.Model;
    exports com.example.proba.Controller;
    opens com.example.proba.Controller to javafx.fxml;
}