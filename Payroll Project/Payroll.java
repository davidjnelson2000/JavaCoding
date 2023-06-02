/*
   Class: Payroll
   Purpose: Class with methods and exceptions
   2/6
*/

public class Payroll
{
   private String name;          // Employee name
   private int idNumber;         // ID number
   private double payRate;       // Hourly pay rate
   private double hoursWorked;   // Number of hours worked

   /**
   	The constructor initializes an object with the
		employee's name and ID number.
		@param n The employee's name.
		@param i The employee's ID number.
   */

   public Payroll(String n, int i)
   {
      name = n;
      idNumber = i;
   }

   /**
   	The setName sets the employee's name.
		@param n The employee's name.
      @exception djnEmptyName When n is empty.
   */

   public void setName(String n) throws djnEmptyName
   {
      if (n.isEmpty())
         throw new djnEmptyName(n);
      
      name = n;
   }

   /**
   	The setIdNumber sets the employee's ID number.
		@param i The employee's ID number.
      @exception djnIDInvalid When i is less than or equal to 0.
   */
	
   public void setIDNumber(int i) throws djnIDInvalid
   {
      if (i <= 0)
         throw new djnIDInvalid(i);
   
      idNumber = i;
   }

   /**
   	The setPayRate sets the employee's pay rate.
		@param p The employee's pay rate.
      @exception djnInvalidRate When p is negative or greater than 70.
   */
	
   public void setPayRate(double p) throws djnInvalidRate
   {
      if (p < 0 || p > 70)
         throw new djnInvalidRate(p);
      
      payRate = p;
   }

   /**
   	The setHoursWorked sets the number of hours worked.
		@param h The number of hours worked.
      @exception djnHoursWorked When h is negative or greater than 100.
   */

   public void setHoursWorked(double h) throws djnInvalidHours
   {
      if (h < 0 || h > 100)
         throw new djnInvalidHours(h);
   
      hoursWorked = h;
   }

   /**
   	The getName returns the employee's name.
		@return The employee's name.
   */

   public String getName()
   {
      return name;
   }

   /**
   	The getIdNumber returns the employee's ID number.
		@return The employee's ID number.
   */
	
   public int getIdNumber()
   {
      return idNumber;
   }

   /**
   	The getPayRate returns the employee's pay rate.
		@return The employee's pay rate.
   */

   public double getPayRate()
   {
      return payRate;
   }

   /**
   	The getHoursWorked returns the hours worked by the
		employee.
		@return The hours worked.
   */


   public double getHoursWorked()
   {
      return hoursWorked;
   }

   /**
   	The getGrossPay returns the employee's gross pay.
		@return The employee's gross pay.
   */

   public double getGrossPay()
   {
      return hoursWorked * payRate;
   }
   
   public String toString()
   {
      // Create a string representing the object.
      String output = "Name: " + name + "\nID Number: " + idNumber + 
                      "\nPay Rate: " + payRate + "\nHours worked: " + hoursWorked + "\n";
      
      return output;
   }
}