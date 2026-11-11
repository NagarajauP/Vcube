package com.arrays;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = { 22, 23, 45, 12, 6 };
		int even = 0;
		int odd = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("Print Even values :" + even);
		System.out.println("Print odd values : " + odd);
	}

}
