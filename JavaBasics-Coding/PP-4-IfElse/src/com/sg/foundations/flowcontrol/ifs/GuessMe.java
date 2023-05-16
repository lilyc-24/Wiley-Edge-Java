package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class GuessMe {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int number = 5;
		
		System.out.println("Pick a number: ");
		int userNumber = scanner.nextInt();
		
		if (userNumber == number) {
			System.out.println("Wow, nice guess! That was it!");
		}
		else if (userNumber<number) {
			System.out.println("Ha, nice try - too low! I chose "+number);
		}
		else {
			System.out.println("Too bad, way too high. I chose "+number);
		}
		

	}

}
