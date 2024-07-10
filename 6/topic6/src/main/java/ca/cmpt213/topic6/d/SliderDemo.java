package ca.cmpt213.topic6.d;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Orientation;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class SliderDemo extends Application
{
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Slider constants
      final double MIN = -50.0, MAX = 50.0, INITIAL = 0.0;
      final double MAJOR_TICK_UNIT = 10.0;
      final int MINOR_TICK_COUNT = 3;
      final double SLIDER_WIDTH = 800.0;

      // Miscellaneous constants
      final double LABEL_WIDTH = 50.0;
      final double SPACING = 10.0;

      // Create the Fahrenheit controls.
      Label fDescriptor = new Label("Fahrenheit: ");
      Label fLabel = new Label("32.0");
      fLabel.setPrefWidth(LABEL_WIDTH);
      HBox fHBox = new HBox(SPACING, fDescriptor, fLabel);
      fHBox.setAlignment(Pos.CENTER);

      // Create the Celsius controls.
      Label cDescriptor = new Label("Celsius: ");
      Label cLabel = new Label("0.0");
      cLabel.setPrefWidth(LABEL_WIDTH);
      HBox cHBox = new HBox(SPACING, cDescriptor, cLabel);
      cHBox.setAlignment(Pos.CENTER);
        
      // Make the Slider.
      Slider slider = new Slider(MIN, MAX, INITIAL);
      slider.setShowTickMarks(true);
      slider.setMajorTickUnit(MAJOR_TICK_UNIT);
      slider.setMinorTickCount(MINOR_TICK_COUNT);
      slider.setShowTickLabels(true);
      slider.setSnapToTicks(true);
      slider.setPrefWidth(SLIDER_WIDTH);
      slider.setOrientation(Orientation.HORIZONTAL);
      
      // Register an event handler for the Slider.




      
      // Add the controls to an VBox.
      VBox vbox = new VBox(10, fHBox, cHBox, slider);
      vbox.setAlignment(Pos.CENTER);
      vbox.setPadding(new Insets(SPACING));
               
      // Create a Scene and display it.
      Scene scene = new Scene(vbox);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}