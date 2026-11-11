package com.arrays;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	

	int[] a = { 22, 23, -45, 12, -6,-66 };
	int pos = 0;
	int neg = 0;
	for(int i = 0;i<a.length;i++){
		if (a[i]<0) {
			pos++;
		} else {
			neg++;
		}
	}System.out.println("Print Positive values :"+pos);
	System.out.println("Print Negative values : " +neg);
}

}

