package ca.cmpt213.topic6.d;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class CSSDemo extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Label l = new Label("Hello World");
        // give label a class
        l.getStyleClass().add("labels");

        VBox vbox = new VBox(l);
        vbox.setAlignment(Pos.CENTER);
        // give vbox an id
        vbox.setId("customvb");


        Scene scene = new Scene(vbox,640,480);
        scene.getStylesheets().add("file:css/style.css");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}