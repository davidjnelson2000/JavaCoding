/*
   Program: Computer Price
   Name: David J Nelson
   Date: 2/13/23
   Purpose: Class that stores the data for price.
   3/4
*/

import java.text.DecimalFormat;

public class djnComputerPrice
{
   DecimalFormat twoDec = new DecimalFormat("0.00");
   private double priceCPU = 0;
   private double priceGPU = 0;
   private double priceRAM = 0;
   
   /**
      This constructor initializes the the CPU, GPU, and RAM.
      @param compCPU The CPU.
      @param compGPU The GPU.
      @param compRAM The RAM
   */
   
   public djnComputerPrice(double priCPU, double priGPU, double priRAM)
   {
      priceCPU = priCPU;
      priceGPU = priGPU;
      priceRAM = priRAM;
   }
   
   /**
      The copy constructor initializes the object as a copy of another djnComputerHardware object.
      @param object The object to copy.
   */
   
   public djnComputerPrice(djnComputerPrice object)
   {
      priceCPU = object.priceCPU;
      priceGPU = object.priceGPU;
      priceRAM = object.priceRAM;
   }
   
   /**
      The set method sets a value for each field.
      @param compGPU The GPU in a computer.
      @param compCPU The CPU in a computer.
      @param compRAM The RAM in a computer.
   */  
   
   public void set(double priCPU, double priGPU, double priRAM)
   {
      priceCPU = priCPU;
      priceGPU = priGPU;
      priceRAM = priRAM;
   }
   
   /**
      toString method
      @return A string containing information on the computers specs.
   */
   
   public String toString()
   {
      // Create a string representing the object.
      String price = "The computer's central processing units cost is $" + priceCPU + "." + 
                     "\nThe computer's graphical processing units cost is $" + priceGPU + "." +
                     "\nThe computer's random access memory cost is $" + priceRAM + ".";
      
      return price;
   }

}