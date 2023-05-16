package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class YourLifeInMovies {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What's your name?");
		String name = scanner.next();
		
		System.out.println("Hi "+name+"! What year were you born?");
		int year = scanner.nextInt();
		
		if (year<2005) {
			System.out.println("Pixar's 'Up' came out over a decade ago.");
		}
		if (year<1995) {
			System.out.println("the first Harry Potter came out over 15 years ago.");
		}
		if (year<1985) {
			System.out.println("Space Jam came out not last decade, but the one before THAT.");
		}
		if (year<1975) {
			System.out.println("the original Jurassic Park release is closer to the first lunar landing than it is to today.");
		}
		if (year<1965) {
			System.out.println("the MASH TV series has been around for almost half a century!");
		}

	}

}
