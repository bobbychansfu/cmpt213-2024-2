package ca.cmpt213.topic6.a;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *  An Image Demo
 */

public class ImageDemo extends Application
{
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Create an Image component.
      Image image = new Image("http://www.sfu.ca/~bobbyc/cmpt165/image.jpg");
      
      // Create an ImageView control.
      ImageView imageView = new ImageView(image);
      imageView.setFitWidth(300);
      imageView.setPreserveRatio(true);
      
      // Put the ImageView in an HBox.
      HBox hbox = new HBox(imageView);
      

      // Create a Scene with the HBox as its root node.
      Scene scene = new Scene(hbox);
      
      // Add the Scene to the Stage.
      primaryStage.setScene(scene);
      
      // Set the stage title.
      primaryStage.setTitle("Baby");
      
      // Show the window.
      primaryStage.show();
   }
}