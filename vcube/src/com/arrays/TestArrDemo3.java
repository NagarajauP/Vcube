package com.arrays;

import java.util.Scanner;

public class TestArrDemo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] number = new int[5];
		System.out.println("Enter the elements ");
		for (int i = 0; i < number.length; i++) {
			number[i] = sc.nextInt();
		}
		for (int i = 0; i < number.length; i++) {
			String n = String.valueOf(number[i]);
			if (n.startsWith("3") || n.endsWith("4")) {
				System.out.println(number[i]);
			}
		}
	}

}
