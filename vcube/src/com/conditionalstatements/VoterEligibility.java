package com.conditionalstatements;

import java.util.Scanner;

public class VoterEligibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your Name :");
		String Name = sc.nextLine();
		
		System.out.println("Enter your Age  :");
		int age = sc.nextInt();
		if(age >=18) {
			System.out.println("Your eligible for Voting ");
			
			System.out.println("Do you Have citizenship :");
			String citizen = sc.next();
			if(citizen.equalsIgnoreCase("YES")) {
				System.out.println("You are Eligible to Apply vote ");
				
				System.out.println("Do you have Voter Id :");
				 String voterid = sc.next();
				if(voterid.equalsIgnoreCase("Yes")) {
					System.out.println("Your Voter Id was Verified !! Your Eligible");
				}else {
					System.out.println("Voter Id was not verified !! Your not Eligibilre");
				}
				
				
			}else {
				System.out.println("you con't apply !! Because your are not member of member of indian citizen ship ");
			}
		}else {
			System.out.println("Oh Now !! Your are not eligibile ");
		}
	}

}
