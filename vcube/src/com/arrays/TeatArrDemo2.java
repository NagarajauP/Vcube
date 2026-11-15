package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TeatArrDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[5];
		System.out.println("Enter the elements ");
		for(int i=0;i<name.length;i++) {
			name[i]=sc.next();
		}
		for(int i=0;i<name.length;i++) {
			if(name[i].startsWith("R") || name[i].endsWith("i")) {
				System.out.println(name[i]);
			}
		}
	}

}
