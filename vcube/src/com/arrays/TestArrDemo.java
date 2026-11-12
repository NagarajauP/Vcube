package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TestArrDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the of the size of the array :");
		int  size = sc.nextInt();
		System.out.println("Enter the elements :"); 
		String [] name= new String[size];
		for(int i=0;i<size;i++) {
			name[i]=sc.next();
		}
		System.out.println(Arrays.toString(name));
	}

}
