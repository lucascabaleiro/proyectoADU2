package com.example.proba.Controller;

import com.example.proba.Model.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private TableColumn c1;
    @FXML
    private TableColumn c2;
    @FXML
    private TableColumn c3;
    @FXML
    private TableView table1;
    @FXML
    protected void onHelloButtonClick() throws IOException {
        String url = "https://api.jikan.moe/v4/anime/223";
        URL jsonURL = new URL(url);
        ObjectMapper objectMapper = new ObjectMapper();
        Response response = objectMapper.readValue(jsonURL, Response.class);
        System.out.println(response.getData().getTitle());
        c1.setCellValueFactory(new PropertyValueFactory<>("title"));
        c2.setCellValueFactory(new PropertyValueFactory<>("score"));
        c3.setCellValueFactory(new PropertyValueFactory<>("popularity"));
        table1.getItems().add(response.getData());

    }
}