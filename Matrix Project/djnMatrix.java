import javax.swing.JOptionPane;

public class djnMatrix
{
   public static void main(String[] args)
   {
   final int MAX = 6;   //Max rows and columns
   String strRows, strColumns, strArrayValue, strLoop; // String input values
   int rows,         // Row Values
       columns,      // Column Values
       arrayValue;   // Entered numbers       
   int indexRow = 0, indexCol = 0, colInc = 0;  //Data for for loops
   int answerR1 = 0, answerR2 = 0, answerR3 = 0, answerR4 = 0, answerR5 = 0;  // Row answers
   int answerC1 = 0, answerC2 = 0, answerC3 = 0, answerC4 = 0, answerC5 = 0;  // Col answers
   int final1 = 0, final2 = 0, final3 = 0, final4 = 0, final5 = 0;   // Printed answers
   int[][] matrix; // Matrix array
   
   strRows = JOptionPane.showInputDialog("Enter the number of rows under 6: ");
   rows = Integer.parseInt(strRows);
   strColumns = JOptionPane.showInputDialog("Enter the number of columns under 6: ");
   columns = Integer.parseInt(strColumns);
   
   // Setting rows and columns
   while (rows >= MAX || columns >= MAX)
   {
      strRows = JOptionPane.showInputDialog("Enter a number of rows below 6 please: ");
      rows = Integer.parseInt(strRows);
      strColumns = JOptionPane.showInputDialog("Enter a number of columns below 6 please: ");
      columns = Integer.parseInt(strColumns);
   }
   
   matrix = new int[rows][columns];
   
   // Setting array values 
   for (int row = 0; row < matrix.length; row++)
   {
      for (int col = 0; col < matrix[row].length; col++)
      {
         strArrayValue = JOptionPane.showInputDialog("Enter a number: ");
         arrayValue = Integer.parseInt(strArrayValue);
         matrix[row][col] = arrayValue;
      }
   } 
   // Finding largest row values
   for (int i = 0; i < matrix.length; i++)
      {
         int largestRow = matrix[i][0];
         for (int colI = 1; colI < matrix[i].length; colI++)
         {
            if (largestRow < matrix[i][colI])
            {
               largestRow = matrix[i][colI];
            }
            else if (largestRow == matrix[i][colI])
               {
                  largestRow = 0;
               }
            else
               {}
          }
         if (i == 0)
            answerR1 = largestRow;
         else if (i == 1)
            answerR2 = largestRow;
         else if (i == 2)
            answerR3 = largestRow;
         else if (i == 3)
            answerR4 = largestRow;
         else if (i == 4)
            answerR5 = largestRow;
         else
             {} 
       }
       
    // Finding Highest column values
    for (int j = 0; j < matrix[0].length; j++)
      {
         int largestCol = matrix[0][j];
          
         for (int rowsI = 1; rowsI < matrix.length; rowsI++)
            {
               if (largestCol < matrix[rowsI][j])
               {
                  largestCol = matrix[rowsI][j];
               }
               else if (largestCol == matrix[rowsI][j])
                  {
                     largestCol = 0;
                  }
               else
                  {

                  }
                  
               }            
            
         if (j == 0)
            answerC1 = largestCol;
         else if (j == 1)
            answerC2 = largestCol;
         else if (j == 2)
            answerC3 = largestCol;
         else if (j == 3)
            answerC4 = largestCol;
         else if (j == 4)
            answerC5 = largestCol;
         else
             {} 

         
         }
      // Moving the answers to new variable
      if (answerR1 == answerC1)
         final1 = answerR1;         
      else if (answerR2 == answerC1)
         final1 = answerR2;
      else if (answerR3 == answerC1)
         final1 = answerR3;  
      else if (answerR4 == answerC1)
         final1 = answerR4;
      else if (answerR5 == answerC1)
         final1 = answerR5;
      else
         final1 = 0;
      
      if (answerR1 == answerC2)
         final2 = answerR1;         
      else if (answerR2 == answerC2)
         final2 = answerR2;
      else if (answerR3 == answerC2)
         final2 = answerR3;  
      else if (answerR4 == answerC2)
         final2 = answerR4;
      else if (answerR5 == answerC2)
         final2 = answerR5;
      else 
         final2 = 0;
      
      if (answerR1 == answerC3)
         final3 = answerR1;         
      else if (answerR2 == answerC3)
         final3 = answerR2;
      else if (answerR3 == answerC3)
         final3 = answerR3;  
      else if (answerR4 == answerC3)
         final3 = answerR4;
      else if (answerR5 == answerC3)
         final3 = answerR5;
      else
         final3 = 0;
      
      if (answerR1 == answerC4)
         final4 = answerR1;         
      else if (answerR2 == answerC4)
         final4 = answerR2;
      else if (answerR3 == answerC4)
         final4 = answerR3;  
      else if (answerR4 == answerC4)
         final4 = answerR4;
      else if (answerR5 == answerC4)
         final4 = answerR5;
      else
         final4 = 0;
      
      if (answerR1 == answerC5)
         final5 = answerR1;         
      else if (answerR2 == answerC5)
         final5 = answerR2;
      else if (answerR3 == answerC5)
         final5 = answerR3;  
      else if (answerR4 == answerC5)
         final5 = answerR4;
      else if (answerR5 == answerC5)
         final5 = answerR5;
      else
         final5 = 0;
         
      // Printing values
      if (final1 != 0)
         JOptionPane.showMessageDialog(null, "An answer: " + final1);
      
      if (final2 != 0 && final2 != final1)
         JOptionPane.showMessageDialog(null, "An answer: " + final2);
      
      if (final3 != 0 && final3 != final1 && final3 != final2)
         JOptionPane.showMessageDialog(null, "An answer: " + final3);
         
      if (final4 != 0 && final4 != final1 && final4 != final2 && final4 != final3)
         JOptionPane.showMessageDialog(null, "An answer: " + final4);
         
      if (final5 != 0 && final5 != final1 && final5 != final2 && final5 != final3 && final5 != final4)
         JOptionPane.showMessageDialog(null, "An answer: " + final5);
         
      if (final1 == 0 && final2 == 0 && final3 == 0 && final4 == 0 && final5 == 0) 
         JOptionPane.showMessageDialog(null, "none");
   }
}