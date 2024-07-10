package ca.cmpt213.topic6.d;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

/**
 *  A RadioButton ActionEvent Demo
 */

public class RadioButtonEvent extends Application
{
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Create two Image objects.
      Image flowerImage = new Image("file:img/Flower.jpg");
      Image sunsetImage = new Image("file:img/Sunset.jpg");
      // Create an ImageView object.
      ImageView imageView = new ImageView(flowerImage);
      imageView.setFitWidth(200);
      imageView.setPreserveRatio(true);
      // Put the ImageView in an HBox.
      HBox imageHBox = new HBox(imageView);
      imageHBox.setAlignment(Pos.CENTER);
      // Create the RadioButtons - set flowerRadio true
      RadioButton flowerRadio = new RadioButton("Flower");
      RadioButton sunsetRadio = new RadioButton("Sunset");
      flowerRadio.setSelected(true);
      // Add the RadioButtons to a ToggleGroup.
      ToggleGroup radioGroup = new ToggleGroup();
      flowerRadio.setToggleGroup(radioGroup);
      sunsetRadio.setToggleGroup(radioGroup);

      // Register an ActionEvent handler for the flowerRadio.


      // Register an event handler for the sunsetRadio.


      // Add the RadioButtons to a VBox.
      VBox radioVBox = new VBox(10, flowerRadio, sunsetRadio);
      // Give the radioVBox some padding.
      radioVBox.setPadding(new Insets(30));
      // Add everything to a VBox.
      VBox mainVBox = new VBox(20, imageHBox, radioVBox);
      // Create a Scene with the HBox as its root node.
      Scene scene = new Scene(mainVBox);
      // Add the Scene to the Stage.
      primaryStage.setScene(scene);
      // Show the window.
      primaryStage.show();
   }
}