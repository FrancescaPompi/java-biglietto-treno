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
		double totalPrice;
		
		if(age < 18) {
			totalPrice = ticketPrice - (ticketPrice / 100 * 20);
		} else if(age > 65) {
			totalPrice = ticketPrice - (ticketPrice / 100 * 40);
		} else {
			totalPrice = 0.21 * numberOfKilometers;
		}
		
		System.out.print("The ticket costs: " + totalPrice + " €");
		

		scanner.close();

	}

}
