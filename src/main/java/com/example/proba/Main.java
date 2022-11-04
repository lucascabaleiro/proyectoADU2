package com.example.proba;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends javafx.application.Application{
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("mainview.fxml"));
        stage.setTitle("Nombre anime");
        stage.setScene(new Scene(root, 600, 500));
        stage.show();
    }
}
