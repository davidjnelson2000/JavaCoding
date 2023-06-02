/**
   Class: djnIDInvalid
   djnIDInvalid exceptions are thrown by the Payroll class
   when a negative or 0 is inputted into the setIDNumber.
   4/6
*/

public class djnIDInvalid extends Exception
{
   /**
       This constructor uses a generic
       error message.
   */

   public djnIDInvalid()
   {
      super("Error: Please enter a positive integer");
   }

   /**
      This constructor specifies the ID being invalid in the error message.
      @param The ID needs to be a positive integer.
   */

   public djnIDInvalid(int invalid)
   {
      super("\nError: Please enter a positive integer: " + invalid + "\n");
   }
}