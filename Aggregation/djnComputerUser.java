/*
   Program: Computer User
   Name: David J Nelson
   Date: 2/13/23
   Purpose: A GUI that allows the user to input information about the computer and price.
   1/4
*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import java.text.DecimalFormat;

public class djnComputerUser extends Application
{
   TextField CPUText;
   TextField GPUText;
   TextField RAMText;
   TextField priceCPUText;
   TextField priceGPUText;
   TextField priceRAMText;
   Label outputLabel;
   String compCPU = "";
	String compGPU = "";
   String compRAM = "";
   double priCPU = 0;
   double priGPU = 0;
   double priRAM = 0; 
   String output2;
   djnComputerHardware compHardware;
   djnComputerPrice compPrice;
   djnComputerCombine compCombine;

   
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }   
   
   @Override
   public void start(Stage primaryStage)
   {      
      // Create the labels.
      Label CPULabel = new Label("Name of CPU: ");
      Label GPULabel = new Label("Name of GPU: ");
      Label RAMLabel = new Label("Name of RAM: ");
      Label CPUPriceLabel = new Label("Price of CPU: ");
      Label GPUPriceLabel = new Label("Price of GPU: ");
      Label RAMPriceLabel = new Label("Price of RAM: ");
      outputLabel = new Label();
      
      // Create the textfields.
      CPUText = new TextField();
      GPUText = new TextField();
      RAMText = new TextField();
      priceCPUText = new TextField();
      priceGPUText = new TextField();
      priceRAMText = new TextField();
      
      // Set width of text boxes.
      CPUText.setPrefWidth(300);
      GPUText.setPrefWidth(300);
      RAMText.setPrefWidth(300);
      priceCPUText.setPrefWidth(300);
      priceGPUText.setPrefWidth(300);
      priceRAMText.setPrefWidth(300);
      
      // Button to update information.
      Button updateButton = new Button("Update");
      
      // Register event handler.
      updateButton.setOnAction(new updateButtonHandler());
      
      // Create the GridPane.
      GridPane gridpane = new GridPane();
      
      // Add the ImageViews to the GridPane.
      gridpane.add(CPULabel, 0, 0);    // Col 0, Row 0
      gridpane.add(CPUText, 1, 0);     // Col 1, Row 0
      gridpane.add(GPULabel, 0, 1);    // Col 0, Row 1
      gridpane.add(GPUText, 1, 1);     // Col 1, Row 1
      gridpane.add(RAMLabel, 0, 2);    // Col 0, Row 2
      gridpane.add(RAMText, 1, 2);     // Col 1, Row 2
      gridpane.add(CPUPriceLabel, 0, 3);    // Col 0, Row 3
      gridpane.add(priceCPUText, 1, 3);     // Col 1, Row 3
      gridpane.add(GPUPriceLabel, 0, 4);    // Col 0, Row 4
      gridpane.add(priceGPUText, 1, 4);     // Col 1, Row 4
      gridpane.add(RAMPriceLabel, 0, 5);    // Col 0, Row 5
      gridpane.add(priceRAMText, 1, 5);     // Col 1, Row 5
      gridpane.add(updateButton, 0, 6);     // Col 0, Row 6
      gridpane.add(outputLabel, 1, 7);      // Col 0, Row 7

      // Set the grippane Width and Height.
      gridpane.setPrefWidth(800);
      gridpane.setPrefHeight(550);
      
      // Set the gap sizes.
      gridpane.setVgap(15);
      gridpane.setHgap(15);
      
      // Set the GridPane's padding.
      gridpane.setPadding(new Insets(30));
      
      // Create a Scene with the GridPane as its root node.
      Scene scene = new Scene(gridpane);
      
      // Add the Scene to the Stage.
      primaryStage.setScene(scene);
      
      //Set the Stage title.
      primaryStage.setTitle("Computer Hardware");
      
      // Show the window.
      primaryStage.show();
   }


   class updateButtonHandler implements EventHandler<ActionEvent>
   {
	   @Override
	   public void handle(ActionEvent event)
	   {         
	      //Get the name of CPU.
	      compCPU = CPUText.getText();
      
         //Get the name of GPU.
	      compGPU = GPUText.getText();
      
         //Get the name of RAM.
	      compRAM = RAMText.getText();

	      //Price of CPU.
		   priCPU = Double.parseDouble(priceCPUText.getText());
         
         //Price of GPU.
		   priGPU = Double.parseDouble(priceGPUText.getText());

         //Price of RAM.
		   priRAM = Double.parseDouble(priceRAMText.getText());
	      
         // Putting values in the djnComputerHardware.
         compHardware = new djnComputerHardware(compCPU, compGPU, compRAM);
         
         // Putting values in the djnComputerPrice.
         compPrice = new djnComputerPrice(priCPU, priGPU, priRAM);
         
         // Putting compHardware and compPrice in a class.
         compCombine = new djnComputerCombine(compHardware, compPrice);
         
         // Update the output label.
         outputLabel.setText(compCombine.toString());
      }
      	   
   }
   
   public String toString()
   {
      // Create a string representing the object.
      String output = "The computer information:\n" + compCombine;
      
      return output;
   }   
   
}
