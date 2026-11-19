package com.arrays;

import java.util.Arrays;

public class TestArrDemo9 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 1, 3, 1, 2, 3, 4, 5, 6, 1, 4, 2 };
		boolean[] flag = new boolean[arr.length];
		int count = 1;
		for (int i = 0; i < arr.length; i++) {
			count=0;
			if (flag[i]) {
				continue;
			}
			for (int j = i; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					flag[j] = true;
				}

			}
			System.out.println(arr[i] +" -> "+count);
		}
		
	}

}
