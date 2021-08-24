package com.bridgelabz.junittestingprograms;

import java.util.Scanner;

public class Binary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c;
		int countOnes = 0;
		System.out.print("Enter any number: ");
		Integer number = sc.nextInt();
		String numberString = Integer.toBinaryString(number);
		String newNumberString = String.format("%8s", numberString).replace(' ', '0');
		System.out.println("Before Converting: "+newNumberString);

		newNumberString = String.format("%4s%4s", newNumberString.substring(4, 8), newNumberString.substring(0, 4));
		System.out.println("After Converting:  "+newNumberString);
		int x = Integer.parseInt(newNumberString, 2);
		if (x != 0 && ((x & (x - 1)) == 0)) {
			System.out.println("Converted number " + x + " is power of 2");
		} else {
			System.out.println("Converted number " + x + " is not a power of 2");
		}
		sc.close();
	}
}
