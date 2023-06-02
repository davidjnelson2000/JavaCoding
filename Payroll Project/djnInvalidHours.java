/**
   Class: djnInvalidHours
   djnInvalidHours exceptions are thrown by the Payroll class
   when a negative or number greater than 100 is inputted into the setHoursWorked.
   5/6
*/

public class djnInvalidHours extends Exception
{
   /**
       This constructor uses a generic
       error message.
   */

   public djnInvalidHours()
   {
      super("Error: Invalid hour value: ");
   }

   /**
      This constructor specifies the user input an invalid hour shown in the error message.
      @param The hours needs to be between 0 and 100.
   */

   public djnInvalidHours(double value)
   {
      super("\nError: Invalid hour value: " + value + "\n");
   }
}