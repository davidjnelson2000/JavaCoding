/**
   Class: djnInvalidRate
   djnInvalidRate exceptions are thrown by the Payroll class
   when a negative or number greater than 70 is inputted into the setInvalidRate.
   6/6
*/

public class djnInvalidRate extends Exception
{
   /**
       This constructor uses a generic
       error message.
   */

   public djnInvalidRate()
   {
      super("Error: Invalid rate");
   }

   /**
      This constructor specifies the user input an invalid rate shown in the error message.
      @param The rate needs to be between 0 and 70.
   */

   public djnInvalidRate(double rates)
   {
      super("\nError: Invalid rate: " + rates + "\n");
   }
}