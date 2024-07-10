package ca.cmpt213.topic6.d;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

/**
 * JavaFX App
 */
public class SimpleMenu extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        final double WIDTH = 640;
        final double HEIGHT = 480;

        // define menus

        BorderPane bp = new BorderPane();
        // set menu

        Scene scene = new Scene(bp,WIDTH,HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}