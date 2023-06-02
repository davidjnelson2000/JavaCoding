/*
   Class: djnSlotMachine
   Purpose: Class with methods and exceptions
   2/3
*/

import java.util.Random;

public class djnSlotMachine
{
   double total;
   double wager;

   /**
   	The constructor initializes an object with the
		total and amount bet.
		@param tot The total.
		@param amount The bet wager.
   */

   public djnSlotMachine(double tot, double amount)
   {
      total = tot;
      wager = amount;
   }
   
   /**
   	The djnTest tests for an exception.
      @exception djnAmountIssue tests for negative or greater than total.
   */
   
   public void djnTest () throws djnAmountIssue
   {
         if (wager > total || wager < 0)
            throw new djnAmountIssue(wager);
   }
}