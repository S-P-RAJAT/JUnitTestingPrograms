package com.bridgelabz.junittestingprograms;

import java.util.Arrays;
import java.util.Scanner;

public class VendingMachine {
	public static int remainingChange = 0;

	public static int notes[] = { 1000, 500, 100, 50, 10, 5, 2, 1 };

	public static int minimumNotes(int totalChange, int index) {
		if (totalChange == 0)
			return 0;

		else if (totalChange >= notes[index]) {
			remainingChange = totalChange - notes[index];
			System.out.print(" " + notes[index]);
			return 1 + minimumNotes(remainingChange, index);
		} else {
			return 0 + minimumNotes(totalChange, index + 1);
		}

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter change to be returned by Vending Machine: ");
		int change = scanner.nextInt();

		System.out.println("List of Rs notes given in change :");
		System.out.println("\nMinimum notes required to give change back is: " + minimumNotes(change, 0));

		scanner.close();

	}
}
