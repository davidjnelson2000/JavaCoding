import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;

public class TextMenu extends Application
{
   // Fields for the menu components
   private MenuBar menuBar;
   private Menu fileMenu;
   private Menu textMenu;
   private Menu textMenuSize;
   private Menu textMenuFormat;
   private MenuItem exitItem;
   private RadioMenuItem blackItem;
   private RadioMenuItem redItem;
   private RadioMenuItem greenItem;
   private RadioMenuItem blueItem;
   private CheckMenuItem visibleItem;
   private RadioMenuItem smallFont;
   private RadioMenuItem mediumFont;
   private RadioMenuItem largeFont;
   private int sizeChoice;
   private String colorChoice;
   
   private RadioMenuItem textBold;
   private RadioMenuItem textItalic;
   private RadioMenuItem textUnderline;
   
   
   // Field for the text
   private Label outputLabel;
   
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Constants for the scene dimensions
      final double WIDTH = 300.0, HEIGHT = 200.0;
      
      // Create the Label control.
      outputLabel = new Label("Hello World");
      
      // Create the menu bar.
      menuBar = new MenuBar();
 
      // Create the File menu.
      buildFileMenu(primaryStage);
            
      // Create the Text menu.
      buildTextMenu();
      
      // Size menu
      buildSizeMenu();
      
      // Format menu
      buildFormatMenu();
      
      updateTextStyle();
      
      // Add the File & Text menus to the menu bar.
      menuBar.getMenus().add(fileMenu);
      menuBar.getMenus().add(textMenu);
      menuBar.getMenus().add(textMenuSize);
      menuBar.getMenus().add(textMenuFormat);
      
      // Add the controls to a BorderPane.
      BorderPane borderPane = new BorderPane();
      borderPane.setTop(menuBar);
      borderPane.setCenter(outputLabel);
               
      // Create a Scene and display it.
      Scene scene = new Scene(borderPane, WIDTH, HEIGHT);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
   
   /**
    * This method builds the File menu.
    */
    
   private void buildFileMenu(Stage primaryStage)
   {
      // Create the File Menu object.
      fileMenu = new Menu("File");
      
      // Create the Exit MenuItem object.
      exitItem = new MenuItem("Exit");
      
      // Register an event handler for the Exit item.
      exitItem.setOnAction(event ->
      {
         primaryStage.close();
      });
      
      // Add the Exit item to the File menu.
      fileMenu.getItems().add(exitItem);
   }

   /**
    * This method builds the Text menu.
    */
   
   private void buildTextMenu()
   {
      // Create the Text Menu object.
      textMenu = new Menu("Text");
      
      // Create the menu items for the Text menu.
      blackItem = new RadioMenuItem("Black");
      redItem = new RadioMenuItem("Red");
      greenItem = new RadioMenuItem("Green");
      blueItem = new RadioMenuItem("Blue");
      visibleItem = new CheckMenuItem("Visible");
      
      // Select the Black and Visible menu items.
      blackItem.setSelected(true);
      visibleItem.setSelected(true);
      
      // Add the RadioMenuItems to a ToggleGroup.
      ToggleGroup textToggleGroup = new ToggleGroup();
      blackItem.setToggleGroup(textToggleGroup);
      redItem.setToggleGroup(textToggleGroup);
      greenItem.setToggleGroup(textToggleGroup);
      blueItem.setToggleGroup(textToggleGroup);
      
      // Register event handlers for the menu items.
      blackItem.setOnAction(event ->
      {
         //outputLabel.setStyle("-fx-text-fill: black");
         colorChoice = "black";
         updateTextStyle();
      });
      
      redItem.setOnAction(event ->
      {
         //outputLabel.setStyle("-fx-text-fill: red");
         colorChoice = "red";
         updateTextStyle();
      });
      
      greenItem.setOnAction(event ->
      {
         //outputLabel.setStyle("-fx-text-fill: green");
         colorChoice = "green";
         updateTextStyle();
      });
      
      blueItem.setOnAction(event ->
      {
         //outputLabel.setStyle("-fx-text-fill: blue");
         colorChoice = "blue";
         updateTextStyle();
      });
      
      visibleItem.setOnAction(event ->
      {
         if (outputLabel.isVisible())
            outputLabel.setVisible(false);
         else
            outputLabel.setVisible(true);
      });
      
      // Add the menu items to the Text menu.
      textMenu.getItems().add(blackItem);
      textMenu.getItems().add(redItem);
      textMenu.getItems().add(greenItem);
      textMenu.getItems().add(blueItem);
      textMenu.getItems().add(new SeparatorMenuItem());
      textMenu.getItems().add(visibleItem);
   }
   
   private void buildSizeMenu(){
   
      textMenuSize = new Menu("Size");
      
      //Menu items for Size
      smallFont = new RadioMenuItem("Small Font: 8pt");
      mediumFont = new RadioMenuItem("Medium Font: 10pt");
      largeFont = new RadioMenuItem("Large Font: 12pt");
      
      //Size toggle group
      ToggleGroup textToggleGroupSize = new ToggleGroup();
      smallFont.setToggleGroup(textToggleGroupSize);
      mediumFont.setToggleGroup(textToggleGroupSize);
      largeFont.setToggleGroup(textToggleGroupSize);
      
      smallFont.setOnAction(event ->
      {
         //outputLabel.setStyle("-fx-font-size: 8pt");
         sizeChoice = 8;
         updateTextStyle();
      });
      
      mediumFont.setOnAction(event ->
      {
         //outputLabel.setStyle("-fx-font-size: 10pt");
         sizeChoice = 10;
         updateTextStyle();
      });
      
      largeFont.setOnAction(event ->
      {
         //outputLabel.setStyle("-fx-font-size: 12pt");
         sizeChoice = 12;
         updateTextStyle();
      });
      
      //Add to size menu
      textMenuSize.getItems().add(smallFont);
      textMenuSize.getItems().add(mediumFont);
      textMenuSize.getItems().add(largeFont);
      
      
   }
   
   private void buildFormatMenu(){
   
      textMenuFormat = new Menu("Format");
      
      //Menu items for Size
      textBold = new RadioMenuItem("Bold");
      textItalic = new RadioMenuItem("Italic");
      textUnderline = new RadioMenuItem("Underline");
      
      textBold.setOnAction(event ->
      {
         //outputLabel.setStyle("-fx-font-weight: bold");
         updateTextStyle();
      });
      
      textItalic.setOnAction(event ->
      {
         //outputLabel.setStyle("-fx-font-style: italic");
         updateTextStyle();
      });
      
      textUnderline.setOnAction(event ->
      {
         //outputLabel.setStyle("-fx-underline: true");
         updateTextStyle();
      });
      
      //Add to size menu
      textMenuFormat.getItems().add(textBold);
      textMenuFormat.getItems().add(textItalic);
      textMenuFormat.getItems().add(textUnderline);
   }
   
   private void updateTextStyle(){
      String style = "-fx-text-fill: " + colorChoice + ";" +  "-fx-font-size: " + sizeChoice + ";";
      if(textBold.isSelected()){
         style += "-fx-font-weight:bold;";
      } else {
         style += "-fx-font-weight: normal;";
      }
      
      if(textItalic.isSelected()){
         style += "-fx-font-style:italic;";
      } else {
         style += "-fx-font-style:normal;";
      }
      
      if(textUnderline.isSelected()){
         style += "-fx-underline:true;";
      } else {
         style += "-fx-underline:false;";
      }
      
      outputLabel.setStyle(style);
   }
}