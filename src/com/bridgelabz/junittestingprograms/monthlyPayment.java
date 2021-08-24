package com.bridgelabz.junittestingprograms;

public class monthlyPayment {
	public static void main(String[] args)
	{
		double principal = Double.parseDouble(args[0]);
        double years = Double.parseDouble(args[1]);
        double rate = Double.parseDouble(args[2]);
	
        double n = 12 * years;  
        double r = rate/(12*100);

		 double monthlyPayment  = (principal * r) / (1 - Math.pow(1+r, -n));
		 System.out.println("Monthly payments = " + monthlyPayment);
	}
}
