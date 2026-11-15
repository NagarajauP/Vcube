package com.arrays;

import java.util.Scanner;

public class TestArrDemo6 {

	public static void main(String[] args) {
		int[] number = { 1, 2, 3, 4, 3, 34, 33, -3, -44, 6, 56, -45, 8, 7, 87 };
		Scanner sc = new Scanner(System.in);
		String yn = "";
		do {
			System.out.println("Enter the number to check weather it is their are not ");

			int key = sc.nextInt();
			boolean status = false;
			for (int i = 0; i < number.length; i++) {

				if (number[i] == key) {
					status = true;
					System.out.println("Given number is found from the array ");
					break;
				}

			}
			if (!status) {
				System.out.println("Givern number is not found from the array ");
			}
			System.out.println("Do you want to continue the searching than click the Y for yes N for no");
			yn = sc.next();

		} while (yn.equalsIgnoreCase("y"));

	}

}

//for (int n : number) {
//if (n == key) {
//	status = true;
//	System.out.println("Given number is found from the array ");
//	break;
//
//}
//}
//if (!status) {
//System.out.println("Givern number is not found from the array ");
//}