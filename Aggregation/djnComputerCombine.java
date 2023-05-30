/*
   Program: Computer Combine
   Name: David J Nelson
   Date: 2/13/23
   Purpose: Class that stores the data for hardware and price together.
   3/4
*/

public class djnComputerCombine
{
   private djnComputerHardware computerHardware;
   private djnComputerPrice computerPrice;
   
   /**
      This constructor initializes the computerHardware and computerPrice.
      @param computerHardware A djnComputerHardware object.
      @param computerPrice A djnComputerPrice object.
   */
   
   public djnComputerCombine(djnComputerHardware hardware, djnComputerPrice price)
   {
      // Create a new object passing hardware as an argument.
      computerHardware = new djnComputerHardware(hardware);
      
      // Create a new object passing price as an argument.
      computerPrice = new djnComputerPrice(price);
   }
   
   /**
      getHardware method
      @return A reference to a copy of this course's djnComputerHardware object.
   */
   
   public djnComputerHardware getHardware()
   {
      // Return a copy of the computerHardware object.
      return new djnComputerHardware(computerHardware);
   }
   
   /**
      getPrice method
      @return A reference to a copy of this course's djnComputerPrice object.   
   */
   
   public djnComputerPrice getPrice()
   {
      // Return a copy of the computerHardware object.
      return new djnComputerPrice(computerPrice);
   }
   
   /**
      toString method
      @return A string containing information on the computers.
   */
   
   public String toString()
   {
      // Create a string representing the object.
      String combine = "The computer specs are:\n" + computerHardware+ "\n\n" + 
                       "The price of the components is:\n" + computerPrice;
      
      return combine;
   }

}