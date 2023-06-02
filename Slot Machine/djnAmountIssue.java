/*
   Class: djnAmountIssue
   Purpose: Exception for being greater than total or negative.
   2/3
*/

public class djnAmountIssue extends Exception
{
   /**
       This constructor uses a generic
       error message.
   */

   public djnAmountIssue()
   {
      super("Error: Please enter a positive integer within the range.");
   }

   /**
      This constructor specifies the wager being invalid in the error message.
      @param The wager needs to be a positive integer under the total.
   */

   public djnAmountIssue(double invalid)
   {
      super("\nError: Please enter a positive integer within the range: " + invalid + "\n");
   }
}