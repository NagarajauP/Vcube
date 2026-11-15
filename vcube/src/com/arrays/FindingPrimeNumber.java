package com.arrays;

import java.util.Scanner;

public class FindingPrimeNumber {
	static boolean isPrime(int n) {
		boolean status = true;
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i <n/ 2; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}

		}
		return status;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the array :");
		int size = sc.nextInt();
		int [] number = new int[size];
		System.out.println("Enter the elements : ");

		for (int i = 0; i < size; i++) {
			number[i] = sc.nextInt();
		}
		for (int n : number) {
			if (isPrime(n)) {
				System.out.print(n + " ");
			}
		}

	}

}
