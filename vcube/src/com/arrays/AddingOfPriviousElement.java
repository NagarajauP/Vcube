package com.arrays;

import java.util.Arrays;

public class AddingOfPriviousElement {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60 };
		int arr2[]=new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				arr2[i] = arr[i] + arr[i + 1];
			} else if (i == arr.length - 1) {
				arr2[i] = arr[i-1] + arr[i];

			}else {
				arr2[i] = arr[i-1]+arr[i+1];
			}
		}
		System.out.println(Arrays.toString(arr2));
	}

}
