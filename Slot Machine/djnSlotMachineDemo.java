/*
   Program: djnSlotMachineDemo
   Name: David J Nelson
   Date: 3/31/23
   Purpose: A GUI to play a slot machine game.
   1/6
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
import javafx.geometry.Pos;
import java.util.Random;


public class djnSlotMachineDemo extends Application
{
   TextField amountText;
   Label outputLabel;
   String name = "";
   ImageView c1ImageView;
   ImageView o1ImageView;
   ImageView a1ImageView;
   ImageView w1ImageView;
   ImageView p1ImageView;
   ImageView slot1;
   ImageView slot2;
   ImageView slot3;
   Image cherryImage;
   Image orangeImage;
   Image appleImage;
   Image watermelonImage;
   Image pearImage;
   double balance = 100;
   double amount;
   djnSlotMachine slotMachine;
   String holder1;


   public static void main(String[] args)
   {
   // Launch the application.
      launch(args);
   }   
   
   @Override
   public void start(Stage primaryStage)
   {      
      // Create the labels.
      Label amountLabel = new Label("How much would you like to bet:  ");
      outputLabel = new Label();
      
      // Create the textfields.
      amountText = new TextField();
      
      // Create an Image object.
      cherryImage = new Image("file:cherry.jpg");
      orangeImage = new Image("file:orange.jpg");
      appleImage = new Image("file:apple.jpg");
      watermelonImage = new Image("file:watermelon.jpg");
      pearImage = new Image("file:pear.jpg");
            
      // Create an ImageView object.
      c1ImageView = new ImageView(cherryImage);
      o1ImageView = new ImageView(orangeImage);
      a1ImageView = new ImageView(appleImage);
      w1ImageView = new ImageView(watermelonImage);
      p1ImageView = new ImageView(pearImage);
      slot1 = new ImageView(cherryImage);
      slot2 = new ImageView(cherryImage);
      slot3 = new ImageView(cherryImage);
      
      //Set height and width of ImageView
      c1ImageView.setFitHeight(200);
      c1ImageView.setFitWidth(200);
      o1ImageView.setFitHeight(200);
      o1ImageView.setFitWidth(200);
      a1ImageView.setFitHeight(200);
      a1ImageView.setFitWidth(200);
      w1ImageView.setFitHeight(200);
      w1ImageView.setFitWidth(200);
      p1ImageView.setFitHeight(200);
      p1ImageView.setFitWidth(200);
      slot1.setFitHeight(200);
      slot1.setFitWidth(200);
      slot2.setFitHeight(200);
      slot2.setFitWidth(200);
      slot3.setFitHeight(200);
      slot3.setFitWidth(200);
      
      // Set width of text boxes.
      amountText.setPrefWidth(200);
      
      // Button to update information.
      Button spinButton = new Button("Spin");
      
      // Register event handler.
      spinButton.setOnAction(new spinButtonHandler());
      
      // Create the GridPane.
      GridPane gridpane = new GridPane();
      
      // Add the ImageViews to the GridPane.
      gridpane.add(slot1, 0, 0);    // Col 0, Row 0
      gridpane.add(slot2, 1, 0);     // Col 1, Row 0
      gridpane.add(slot3, 2, 0);
      gridpane.add(amountLabel, 0, 1);    // Col 0, Row 1
      gridpane.add(amountText, 1, 1);     // Col 1, Row 1
      gridpane.add(outputLabel, 0, 2);    // Col 0, Row 2
      gridpane.add(spinButton, 0, 3);     // Col 1, Row 3

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
      primaryStage.setTitle("Slot Machine");
      
      // Show the window.
      primaryStage.show();
   }


   class spinButtonHandler implements EventHandler<ActionEvent>
   {
	   @Override
	   public void handle(ActionEvent event)
	   {       
         // Total amount bet        
         amount = Double.parseDouble(amountText.getText());
         
         // Setting default constructors
         slotMachine = new djnSlotMachine(balance, amount);
         
         // Exception
         try
         {
            slotMachine.djnTest();
            
            Random rand = new Random();
            int upperbound = 5;
            int random1 = rand.nextInt(upperbound);
            int random2 = rand.nextInt(upperbound);
            int random3 = rand.nextInt(upperbound);
          
            if (random1 == 0)
            {
               slot1.setImage(cherryImage);
            }
            else if (random1 == 1)
            {
               slot1.setImage(orangeImage);
            }
            else if (random1 == 2)
            {
               slot1.setImage(appleImage);
            }
            else if (random1 == 3)
            {
               slot1.setImage(watermelonImage);
            }
            else if (random1 == 4)
            {
               slot1.setImage(pearImage);
            }
         
            if (random2 == 0)
            {
               slot2.setImage(cherryImage);
            }
            else if (random2 == 1)
            {
               slot2.setImage(orangeImage);
            }
            else if (random2 == 2)
            {
               slot2.setImage(appleImage);
            }
            else if (random2 == 3)
            {
               slot2.setImage(watermelonImage);
            }
            else if (random2 == 4)
            {
               slot2.setImage(pearImage);
            }
         
            if (random3 == 0)
            {
               slot3.setImage(cherryImage);
            }
            else if (random3 == 1)
            {
            slot3.setImage(orangeImage);
            }
            else if (random3 == 2)
            {
               slot3.setImage(appleImage);
            }
            else if (random3 == 3)
            {
               slot3.setImage(watermelonImage);
            }
            else if (random3 == 4)
            {
               slot3.setImage(pearImage);
            }
            
            if (random1 == random2 || random1 == random3 || random2 == random3)
               balance = balance + (amount * 2);
            else if (random1 == random2 && random1 == random3)
               balance = balance + (amount * 3);
            
               balance = balance - amount;
               holder1 = "";
         }
         catch (djnAmountIssue n)
         {
            holder1 = n.getMessage();
         }
         
         // Converts the balance to a string
         String output = Double.toString(balance);
         	               
         // Update the output label.
         outputLabel.setText("Total amount won: " + output + "\n" + holder1);
      }
   }
}