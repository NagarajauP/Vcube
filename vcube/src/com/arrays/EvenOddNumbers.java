package com.arrays;

import java.util.Arrays;

public class EvenOddNumbers {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 5, 22, 458, 657, 98, 33, 37, 223 };
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==1) {
				System.out.println(arr[i]);
			}
		}
//		for (int a :arr) {
//			if (a %2 == 0) {
//				System.out.println(a);
//			}
//		}
		
	}

}
