package com.arrays;

public class MinAndMaxValue {

	public static void main(String[] args) {
		int [] number = {22,33,4,3,88,6,555,4545};
		int min= number[0];
		int max= number[0];
		
		for(int i =0;i<number.length;i++) {
			if(number[i]<min) {
				min=number[i];
			}
			if(number[i]>max) {
				max=number[i];
			}
		}
		System.out.println("the minimum number is :"+min); 
		System.out.println("The  maximum number is :"+max);
	}

}
