/*
   Program: djnPayrollDemo
   Name: David J Nelson
   Date: 3/21/23
   Purpose: A GUI to show the name, ID, pay rate, and hours.
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

public class djnPayrollDemo extends Application
{
   TextField nameText;
   TextField IDText;
   TextField payRateText;
   TextField hoursWorkedText;
   Label outputLabel;
   String name = "";
	int ID = 0;
   double rate = 0;
   double hours = 0; 
   Payroll payroll;
   String holder1, holder2, holder3, holder4;

   
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }   
   
   @Override
   public void start(Stage primaryStage)
   {      
      // Create the labels.
      Label nameLabel = new Label("Name:  ");
      Label IDLabel = new Label("ID #: ");
      Label payRateLabel = new Label("Pay Rate: ");
      Label hoursWorkedLabel = new Label("Hours worked: ");
      outputLabel = new Label();
      
      // Create the textfields.
      nameText = new TextField();
      IDText = new TextField();
      payRateText = new TextField();
      hoursWorkedText = new TextField();
      
      // Set width of text boxes.
      nameText.setPrefWidth(300);
      IDText.setPrefWidth(300);
      payRateText.setPrefWidth(300);
      hoursWorkedText.setPrefWidth(300);
      
      // Button to update information.
      Button updateButton = new Button("Update");
      
      // Register event handler.
      updateButton.setOnAction(new updateButtonHandler());
      
      // Create the GridPane.
      GridPane gridpane = new GridPane();
      
      // Add the ImageViews to the GridPane.
      gridpane.add(nameLabel, 0, 0);    // Col 0, Row 0
      gridpane.add(nameText, 1, 0);     // Col 1, Row 0
      gridpane.add(IDLabel, 0, 1);    // Col 0, Row 1
      gridpane.add(IDText, 1, 1);     // Col 1, Row 1
      gridpane.add(payRateLabel, 0, 2);    // Col 0, Row 2
      gridpane.add(payRateText, 1, 2);     // Col 1, Row 2
      gridpane.add(hoursWorkedLabel, 0, 3);    // Col 0, Row 3
      gridpane.add(hoursWorkedText, 1, 3);     // Col 1, Row 3
      gridpane.add(updateButton, 1, 4);
      gridpane.add(outputLabel, 1, 5);      // Col 1, Row 5

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
      primaryStage.setTitle("Payroll");
      
      // Show the window.
      primaryStage.show();
   }


   class updateButtonHandler implements EventHandler<ActionEvent>
   {
	   @Override
	   public void handle(ActionEvent event)
	   {         
	      //Get the name.
	      name = nameText.getText();
      
         //Get the ID.
	      ID = Integer.parseInt(IDText.getText());
      
         //Get the rate.
	      rate = Double.parseDouble(payRateText.getText());

	      //Get the hours.
		   hours = Double.parseDouble(hoursWorkedText.getText());
         
         //Pass values to payroll
         payroll = new Payroll(name, ID);
         
         //Check if the name field is empty
         try
         {
            payroll.setName(name);
            holder1 = "";
         }
         catch(djnEmptyName m)
         {
            holder1 = m.getMessage();
         }
         
         //Check if the ID is negative or 0
         try
         {
            payroll.setIDNumber(ID);
            holder2 = "";
         }
         catch(djnIDInvalid n)
         {
            holder2 = n.getMessage();
         }
         
         //Check if the rate is negative or greater then 70
         try
         {
            payroll.setPayRate(rate);
            holder3 = "";
         }
         catch(djnInvalidRate o)
         {
            holder3 = o.getMessage();
         }
         
         //Check if the hours is negative or greater then 100
         try
         {
            payroll.setHoursWorked(hours);
            holder4 = "";
         }
         catch(djnInvalidHours p)
         {
            holder4 = p.getMessage();
         }
	               
         // Update the output label.
         outputLabel.setText(payroll.toString() + holder1 + holder2 + holder3 + holder4);
      }
      	   
   }
   
}
