/*
Program: djn Methods Review
Name: David J Nelson
Date: 1/20/23
Purpose: The user inputs two sides of a right triangle and then the hypotenuse and area are outputted.
Part: 1/2
*/

import javax.swing.JOptionPane;

public class djnMethodsReview
{
   public static void main(String[] args)
   {
   
   String leg1,      //Holds string of the first leg of the right triangle
          leg2;      //Holds string of the second leg of the right triangle
   double side1,     //Double leg1 is held in
          side2;     //Double leg2 is held in
   
   //Dialog box for user to input leg1
   leg1 = JOptionPane.showInputDialog("Enter the length of the first leg of the triangle: ");
   side1 = Double.parseDouble(leg1);
   
   //Dialog box for user to input leg2
   leg2 = JOptionPane.showInputDialog("Enter the length of the second leg of the triangle: ");
   side2 = Double.parseDouble(leg2);
   
   //Passing side1 and side2 of the right triangle into djnMethodsReviewMethods
   djnMethodsReviewMethods content = new djnMethodsReviewMethods(side1, side2);
   
   //Returns a dialog box with the hypotenuse and area of the right triangle
   JOptionPane.showMessageDialog(null, "Hypotenuse: " + content.getHypotenuse() + " Area: " + content.getArea());
   }
}