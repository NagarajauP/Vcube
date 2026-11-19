package com.arrays;

import java.util.Arrays;

public class TestArrDemo5 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, };
		int[] b = { 10, 20, 30, 40, 50, 70, 80 };
		int[] c = new int[b.length];

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i] + b[i];
		}
		for(int i=a.length;i<b.length;i++) {
			c[i]=b[i];
			
		}

		System.out.println(Arrays.toString(c));
	}

}
