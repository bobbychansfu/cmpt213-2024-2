package ca.cmpt213.topic6;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.scene.control.Label;

/**
 *  GridPane Demo
 */

public class GridPaneButtonDemo extends Application
{
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Create six Button components.
      Button button1 = new Button("Button 1");
      Button button2 = new Button("Button 2");
      Button button3 = new Button("Button 3");
      Button button4 = new Button("Button 4");
      Button button5 = new Button("Button 5");
      Button button6 = new Button("Button 6");

      // Create the GridPane.
      GridPane gridpane = new GridPane();

      // Add the buttons to the GridPane.
      gridpane.add(button1,0,0);
      gridpane.add(button2,0,1);
      gridpane.add(button3,1,0);
      gridpane.add(button4,1,1);
      gridpane.add(button5,0,2);
      gridpane.add(button6,2,0);

      // ADD
      gridpane.setHgap(10);
      gridpane.setPadding(new Insets(10));

      // Create a Scene with the GridPane as its root node.
      // The Scene is 200 pixels wide by 100 pixels high.
      Scene scene = new Scene(gridpane, 300, 100);
      
      // Add the Scene to the Stage.
      primaryStage.setScene(scene);
      
      // Show the window.
      primaryStage.show();
   }
}