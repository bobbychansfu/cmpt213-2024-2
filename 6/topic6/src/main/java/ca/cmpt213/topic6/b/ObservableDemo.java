package ca.cmpt213.topic6.b;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class ObservableDemo extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        
        Label l1 = new Label("Fokimon 1");
        Label l2 = new Label("Fokimon 2");
        Label l3 = new Label("Fokimon 3");
        Label l4 = new Label("Fokimon 4");
        Label l5 = new Label("Fokimon 5");

        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(l1,l2,l3,l4,l5);







        vbox.setAlignment(Pos.TOP_CENTER);
        HBox hb = new HBox(30,vbox);
        hb.setAlignment(Pos.TOP_CENTER);
        hb.setPadding(new Insets(30));
        Scene scene = new Scene(hb,640,480);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}