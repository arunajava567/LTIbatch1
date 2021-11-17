package com.staging;
public class MathApplication {
	   private CalculatorService calcService;

	   public void setCalculatorService(CalculatorService calcService){
	      this.calcService = calcService;
	   }
	   //7 ,8 15    30,20 -ve , 
	   public double add(double input1, double input2) throws ArithmeticException{
	      return calcService.add(input1, input2);
	   }
	   
	   public double subtract(double input1, double input2){
	      return calcService.subtract(input1, input2);
	   }
	   
	   public double multiply(double input1, double input2){
	      return calcService.multiply(input1, input2);
	   }
	   
	   public double divide(double input1, double input2){
	      return calcService.divide(input1, input2);
	   }
	}