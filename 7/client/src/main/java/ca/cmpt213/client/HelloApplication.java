package ca.cmpt213.client;

import javafx.application.Application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Label nameLabel = new Label("Name: ");
        Label ageLabel = new Label("Age: ");
        TextField nameField = new TextField();
        TextField ageField = new TextField();
        Button submit = new Button("POST Req");
        Button submit2 = new Button("GET Req");

        Label outputLabel = new Label();


        GridPane gridpane = new GridPane();
        gridpane.add(nameLabel, 0, 0);
        gridpane.add(ageLabel, 0, 1);
        gridpane.add(nameField, 1, 0);
        gridpane.add(ageField, 1, 1);
        gridpane.add(submit, 1, 2);
        gridpane.add(submit2, 1, 3);




        VBox vb = new VBox(20, gridpane, outputLabel);

        Scene scene = new Scene(vb, 500, 240);

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}