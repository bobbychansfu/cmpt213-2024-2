package ca.cmpt213.topic6.d;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class Popup extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        Label label = new Label("Simple Pop-up example");

        // Add button to open new window




        VBox vbox = new VBox(label);
        vbox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vbox,640,480);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}