/*
   Program: Computer Hardware
   Name: David J Nelson
   Date: 2/13/23
   Purpose: Class that stores the data for hardware.
   2/4
*/

public class djnComputerHardware
{
   private String CPU;
   private String GPU;
   private String RAM;
   
   /**
      This constructor initializes the the CPU, GPU, and RAM.
      @param compCPU The CPU.
      @param compGPU The GPU.
      @param compRAM The RAM
   */
   
   public djnComputerHardware(String compCPU, String compGPU, String compRAM)
   {
      CPU = compCPU;
      GPU = compGPU;
      RAM = compRAM;
   }
   
   /**
      The copy constructor initializes the object as a copy of another djnComputerHardware object.
      @param object The object to copy.
   */
   
   public djnComputerHardware(djnComputerHardware object)
   {
      CPU = object.CPU;
      GPU = object.GPU;
      RAM = object.RAM;
   }
   
   /**
      The set method sets a value for each field.
      @param compGPU The GPU in a computer.
      @param compCPU The CPU in a computer.
      @param compRAM The RAM in a computer.
   */  
   
   public void set(String compCPU, String compGPU, String compRAM)
   {
      CPU = compCPU;
      GPU = compGPU;
      RAM = compRAM;
   }
   
   /**
      toString method
      @return A string containing information on the computers specs.
   */
   
   public String toString()
   {
      // Create a string representing the object.
      String hardware = "The computer's central processing unit is " + CPU + "." + 
                        "\nThe computer's graphical processing unit is " + GPU + "." +
                        "\nThe computer's random access memory is " + RAM + ".\n";
      
      return hardware;
   }
   
}