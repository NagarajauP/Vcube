package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TestArrDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size ");
		int size = sc.nextInt();
		int [] number = new int [size];
		 
		System.out.println("Enter the Elements");
		for(int i =0;i<size;i++) {
			number[i]= sc.nextInt();
			
		}
		System.out.println(Arrays.toString(number));
	}

}
