package com.conditionalstatements;

import java.util.Scanner;

public class DoWhileDemo {
	static Scanner sc = new Scanner(System.in);
	static int tokenNo = 0;

	public static void main(String[] args) {

		double bill = 0;
		int quantity = 0;
		double total_Price = 0;
		String yn = "";
		System.out.println("Well come to Andhra Spicy Ruchulu ");
		System.out.println("select your dish by selecting the below list ");
		System.out.println(" 1 ->Pizza -200 \n 2 ->Burger -120 \n 3 -> Briyani -180 \n 4 -> Noodles -100");

		do {

			System.out.println("Enter Item :");
			String option = sc.next();

			
			switch (option) {
			case "1" -> {
				System.out.println("Enter the quantity :");
				quantity = sc.nextInt();
				total_Price += 200 * quantity;
			}
			case "2" -> {
				System.out.println("Enter the quantity :");
				quantity = sc.nextInt();
				total_Price += 120 * quantity;

			}
			case "3" -> {
				System.out.println("Enter the quantity :");
				quantity = sc.nextInt();
				total_Price += 180 * quantity;
			}
			case "4" -> {
				System.out.println("Enter the quantity :");
				quantity = sc.nextInt();
				total_Price += 100 * quantity;

			}
			default -> System.out.println("Item is Invailed");
			}
			System.out.println("do you want to continue : Y for Yes and n for no");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("y"));

		System.out.println("Bill:" + total_Price);

	}

}
