package com.bridgelabz.junittestingprograms;

import java.util.Scanner;

public class TemperatureConversion {
	public static void temperaturConversion() {

		System.out.print(
				"Enter\n1) To convert from Celsius to Fahrenheit\n2) To convert Fahrenheit to Celsius\nYour Option: ");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		System.out.print("Enter temperature value: ");
		double inputTemperature = scanner.nextDouble();

		switch (input) {

		case 1:
			double toFahrenheit = ((inputTemperature * 9) / 5) + 32;
			System.out.println("Fahrenheit equivalent of " + inputTemperature + " is " + toFahrenheit);

			break;

		case 2:
			double toCelsius = ((inputTemperature - 32) * 5) / 9;
			System.out.println("Celsius equivalent of " + inputTemperature + " is " + toCelsius);

			break;
		}
		scanner.close();
	}

	public static void main(String[] args) {
		temperaturConversion();
	}
}
