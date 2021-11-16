package org.generation.italy;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// input variables
		double numberOfKilometers;
		int age;
		
		System.out.print("Insert number of kilometers: ");
		numberOfKilometers = scanner.nextDouble();
		System.out.print("Insert age: ");
		age = scanner.nextInt();
		
		double ticketPrice = 0.21 * numberOfKilometers;
		double minorsDiscount = ticketPrice - (ticketPrice / 100 * 20);
		double seniorDiscount = ticketPrice - (ticketPrice / 100 * 40);
		
		if(age < 18) {
			System.out.print("The ticket costs: " + minorsDiscount + "€");
		} else if(age > 65) {
			System.out.print("The ticket costs: " + seniorDiscount + "€");
		} else {
			System.out.print("The ticket costs: " + ticketPrice + "€");
		}
		

		scanner.close();
	}

}
