package com.example.proba.Controller;

import com.example.proba.Model.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

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
    private TextField text1;
    @FXML
    private Button btnJson;
    @FXML
    private TextField text2;
    @FXML
    protected void onHelloButtonClick() throws IOException {
        /*table1.getItems().clear();
        c1.setCellValueFactory(new PropertyValueFactory<>("title"));
        c2.setCellValueFactory(new PropertyValueFactory<>("score"));
        c3.setCellValueFactory(new PropertyValueFactory<>("popularity"));
        String nombre = text1.getText();
        String url = "https://api.jikan.moe/v4/anime?q=" + nombre;
        URL jsonURL = new URL(url);
        ObjectMapper objectMapper = new ObjectMapper();
        Response res = objectMapper.readValue(jsonURL, Response.class);
        for (byte i = 0; i < res.getData().size(); i++) {
            table1.getItems().add(res.getData().get(i));
        }*/
        table1.getItems().clear();
        try {
            String nombre = text1.getText();
            String consulta = "select * from animes where titulo rlike '" + nombre + "'";
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/anime", "root", "root");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(consulta);

            while (resultSet.next()) {
                c1.setCellValueFactory(new PropertyValueFactory<>("titulo"));
                c2.setCellValueFactory(new PropertyValueFactory<>("valoracion"));
                c3.setCellValueFactory(new PropertyValueFactory<>("popularidad"));
                table1.getItems().add(new Anime(resultSet.getString("titulo"),resultSet.getFloat("valoracion"),resultSet.getInt("popularidad")));
                System.out.println(resultSet.getString("popularidad"));
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @FXML
    protected void onBtnJsonClick() throws IOException {
        /*ObjectMapper mapper = new ObjectMapper();
        DataItem anime = (DataItem)table1.getSelectionModel().getSelectedItem();
        mapper.writeValue(Paths.get(text2.getText() + ".json").toFile(),anime);*/
    }
    @FXML
    protected  void onBtnBinarioClick() throws  IOException {
       /* ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(text2.getText() + ".bin"));
        DataItem anime = (DataItem)table1.getSelectionModel().getSelectedItem();
        escritor.writeObject(anime);
        escritor.close();*/
    }
    @FXML
    protected void onBtnTextoClick() throws IOException {
        /*ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(text2.getText() + ".txt"));
        DataItem anime = (DataItem)table1.getSelectionModel().getSelectedItem();
        escritor.writeObject(anime);
        escritor.close();*/
    }
}
