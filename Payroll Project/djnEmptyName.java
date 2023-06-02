/**
   Class: djnEmptyName
   djnEmptyName exceptions are thrown by the Payroll class
   when a the name is empty when passed to setName.
   3/6
*/

public class djnEmptyName extends Exception
{
   /**
       This constructor uses a generic
       error message.
   */

   public djnEmptyName()
   {
      super("Error: You did not input anything for the name");
   }

   /**
      This constructor specifies that nothing was inputted causing the error message.
      @param The empty string.
   */

   public djnEmptyName(String empty)
   {
      super("\nError: You did not input anything for the name " + empty + "\n");
   }
}