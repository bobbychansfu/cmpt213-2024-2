package ca.cmpt213.topic6.a;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class ButtonDemo extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Label label = new Label("Click below");
        Button button = new Button("Click me");

        VBox vbox = new VBox(10,label,button);
        vbox.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vbox,640,320);
        stage.setTitle("Button!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}