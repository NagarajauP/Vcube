package com.arrays;

import java.util.Arrays;

public class TestArrDemo4 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, };
		int[] b = { 10, 20, 30, 40, 50,};
		int[] c = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i] + b[i];
		}
		
		System.out.println(Arrays.toString(c));
	}

}
