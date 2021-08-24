package com.bridgelabz.junittestingprograms;

import java.util.Scanner;

public class SquareRoot {
public static void main(String[] args) {
	double c;
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a number to get its Square Root: ");
	c = scanner.nextDouble();

	double t = c;
	double epsilon = 1.0e-15;
	while (Math.abs(t - c / t) > epsilon * t) 
	{
		t = (c / t + t) / 2.0;
	}

	System.out.println("Square Root of " + c + " is " + t);
     
	scanner.close();
}
}
