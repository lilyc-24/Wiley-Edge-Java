package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class FieldDay {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your last name?");
		String name = scanner.next();
		
				
		
		if (name.compareToIgnoreCase("Baggins")<0) {
			System.out.println("Team Red Dragons");
		}
		else if (name.compareTo("Baggins")>=0 && name.compareToIgnoreCase("Dresden")<0) {
			System.out.println("Team Dark Wizards");
		}
		else if (name.compareTo("Dresden")>=0 && name.compareToIgnoreCase("Howl")<0) {
			System.out.println("Team Moving Castles");
		}
		else if (name.compareTo("Howl")>=0 && name.compareToIgnoreCase("Potter")<0) {
			System.out.println("Team Golden Snitches");
		}
		else if (name.compareTo("Potter")>=0 && name.compareToIgnoreCase("Vimes")<0) {
			System.out.println("Team Night Guards");
		}
		else {
			System.out.println("Team Blakc Holes");
		}
	}
		

}
