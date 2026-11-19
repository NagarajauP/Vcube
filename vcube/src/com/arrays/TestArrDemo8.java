package com.arrays;

import java.util.Arrays;

public class TestArrDemo8 {

	public static void main(String[] args) {
		int arr[] = { 99, 95, 71, 84, 81, 75, 60 };

		for (int i = 0; i < arr.length; i++) {
			arr[i] = ((arr[i] + 5 )/ 10) * 10;

		}
		System.out.println(Arrays.toString(arr));
	}

}
