package com.loops;

import java.util.Random;
import java.util.Scanner;

public class RandamVariables {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rs = new Random();
		String yn = "";
		do {
			int rvg = rs.nextInt(86);
			System.out.println(rvg);
			boolean win = false;
			for (int i = 0; i < 3; i++) {
				System.out.println("Guess the Number ");
				int guss = sc.nextInt();
				if (guss < rvg) {
					System.out.println("Entered number is too low");
				} else if (guss > rvg) {
					System.out.println("Entered nuumer is too heigh");
				} else if (guss == rvg) {
					System.out.println("You gussed correctly");
					win = true;
					break;
				}
			}
			if (!win) {
				System.out.println("Game over !!");
			}System.out.println("Do you want to continue then click y for Yes N for No");
			yn=sc.next();
		}while(yn.equalsIgnoreCase("y"));
	}

}
