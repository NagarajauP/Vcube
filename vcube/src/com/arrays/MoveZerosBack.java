package com.arrays;

import java.util.Arrays;

public class MoveZerosBack {

	public static void main(String[] args) {
		int a[] = { 0,9, 0, 1, 3, 6, 0, 9, 7 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				for (int j = i; j <a.length-1; j++) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}
			}

		}
		System.out.println(Arrays.toString(a));
	}

}
