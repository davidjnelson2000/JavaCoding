/*
Program: djn Methods Review Methods
Name: David J Nelson
Date: 1/20/23
Purpose: Holds the methods for finding the hypotenuse and area
Part: 2/2
*/

import java.lang.Math;

public class djnMethodsReviewMethods
{
   double triLen1,      //Holds the first side of the triangle
          triLen2;      //Holds the second side of the triangle
   
   /**
      Constructor
      @param tri1 and tri2 sets triLen1 and triLen2 to the sides of the triangle.
   */
   
   public djnMethodsReviewMethods(double tri1, double tri2)
   {
      triLen1 = tri1;   
      triLen2 = tri2;
   }
   
   /**
      The getHypotenuse method calculates the hypotenuse of the triangle.
      @return The hypotenuse of the right triangle.
   */
   
   public double getHypotenuse()
   {
      double total;
      total = Math.sqrt((triLen1*triLen1) + (triLen2 *triLen2));
      return total;
   }
   
   /**
      The getArea method calculates the area of the triangle.
      @return The area of the right triangle.
   */
   
   public double getArea()
   {
      double total;
      total = (triLen1 * triLen2) / 2;
      return total;
   }

}