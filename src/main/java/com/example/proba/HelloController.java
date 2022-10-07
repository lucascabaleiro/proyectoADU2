package com.example.proba;

import com.example.proba.Model.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() throws IOException {
        String url = "https://api.jikan.moe/v4/anime/223";
        URL jsonURL = new URL(url);
        ObjectMapper objectMapper = new ObjectMapper();
        Response response = objectMapper.readValue(jsonURL, Response.class);
        System.out.println(response.getData().getTitle());
    }
}