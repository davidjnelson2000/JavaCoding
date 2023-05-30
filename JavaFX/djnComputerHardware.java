/*
   Project: djnComputerHardware
   About: JFX project to select computer parts and then gives the final price.
   Name: David Nelson
*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import java.text.DecimalFormat;

public class djnComputerHardware extends Application
{
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }

   @Override
   public void start(Stage primaryStage)
   {
      // Create a ComboBox.
      ComboBox<String> comboBox = new ComboBox<>();
      comboBox.getItems().addAll("i7-7700K - $138.99", "i7-13700KF - $391.99", "i9-13900K - $569.98", "i9-12900k - $426.99");
      
      // Create two ListViews of Strings.
      ListView<String> listView1 = new ListView<>();
      ListView<String> listView2 = new ListView<>();
      listView1.setPrefSize(150, 100);
      listView1.getItems().addAll("3070 TI - $618.52", "GTX 1080 TI - $549.99", "GTX 1650 - $188.33", "GTX 960 - $159.99");
      listView2.setPrefSize(160, 100);
      listView2.getItems().addAll("DDR4 16GB - $30.99", "DDR4 32GB - $67.99", "RGB DDR4 32GB x2 - $84.99", "DDR4 16GB - $52.99");

      // Create Labels.
      Label outputLabel1 = new Label("Select a CPU");
      Label outputLabel2 = new Label("Select RAM");
      Label selectedNameLabel = new Label("Select a graphics card");
      Label finalOutput = new Label("Price Total");

      // Create a Button.
      Button button = new Button("Get Selection");
      
      // Event when button is pressed
      button.setOnAction(event ->
      {
         // Sets decimal points
         DecimalFormat df = new DecimalFormat("0.00");
         
         // Variables to show the total
         double value1 = 0, value2 = 0, value3 = 0, total = 0;
         String text;
         
         outputLabel1.setText(comboBox.getValue());
         
         // Get the selected name.
         String selected = listView1.getSelectionModel().getSelectedItem();

         // Display the selected name in the Label.
         selectedNameLabel.setText(selected);
         
         // Get the selected name.
         String selected1 = listView2.getSelectionModel().getSelectedItem();

         // Display the selected name in the Label.
         outputLabel2.setText(selected1);
         
         // Setting values of each selection
         if (comboBox.getValue() == "i7-7700K - $138.99")
            value1 = 138.99;
         else if (comboBox.getValue() == "i7-13700KF - $391.99")
            value1 = 391.99;
         else if (comboBox.getValue() == "i9-13900K - $569.98")
            value1 = 569.98;
         else if (comboBox.getValue() == "i9-12900k - $426.99")
            value1 = 426.99;
            
         if (listView1.getSelectionModel().getSelectedItem() == "3070 TI - $618.52")
            value2 = 618.52;
         else if (listView1.getSelectionModel().getSelectedItem() == "GTX 1080 TI - $549.99")
            value2 = 549.99;
         else if (listView1.getSelectionModel().getSelectedItem() == "GTX 1650 - $188.33")
            value2 = 188.33;
         else if (listView1.getSelectionModel().getSelectedItem() == "GTX 960 - $159.99")
            value2 = 159.99;
            
         if (listView2.getSelectionModel().getSelectedItem() == "DDR4 16GB - $30.99")
            value3 = 30.99;
         else if (listView2.getSelectionModel().getSelectedItem() == "DDR4 32GB - $67.99")
            value3 = 67.99;
         else if (listView2.getSelectionModel().getSelectedItem() == "RGB DDR4 32GB x2 - $84.99")
            value3 = 84.99;
         else if (listView2.getSelectionModel().getSelectedItem() == "DDR4 16GB - $52.99")
            value3 = 52.99;
            
         // Calculating the total
         total = value1 + value2 + value3;
         total = total + (total * 0.07);
         text = String.valueOf(df.format(total));
         
         finalOutput.setText("$" + text);
      });
      
      // Create the GridPane
      GridPane gridpane = new GridPane();
            
      // Create the layout
      gridpane.add(outputLabel1, 0, 0);   
      gridpane.add(comboBox, 1, 0);      
      gridpane.add(selectedNameLabel, 0, 1);   
      gridpane.add(listView1, 1, 1);    
      gridpane.add(outputLabel2, 0, 2);   
      gridpane.add(listView2, 1, 2); 
      gridpane.add(finalOutput, 1, 3);  
      gridpane.add(button, 2, 3);
      
      // Set the size of the gridpane
      gridpane.setPrefWidth(500);
      gridpane.setPrefHeight(300);

      // Create a Scene and display it.
      Scene scene = new Scene(gridpane);
      
      // Set the title
      primaryStage.setTitle("Computer Hardware");
      
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}