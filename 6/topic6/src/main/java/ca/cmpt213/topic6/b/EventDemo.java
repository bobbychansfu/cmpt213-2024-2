package ca.cmpt213.topic6.b;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *  An Event Demo
 */

public class EventDemo extends Application
{
   // Field for the Label control
   private Label myLabel;

   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }

   @Override
   public void start(Stage primaryStage)
   {
      myLabel = new Label("Click the button to see a message.");
      Button myButton = new Button("Click me");
      // Vbox with label and button
      VBox vbox = new VBox(10, myLabel, myButton);
      // new scene
      Scene scene = new Scene(vbox, 300, 300);
      // Add the Scene to the Stage.
      primaryStage.setScene(scene);
      // Set the stage title.
      primaryStage.setTitle("Button Demo");
      // Show the window.
      primaryStage.show();
   }

   // event handler class

}