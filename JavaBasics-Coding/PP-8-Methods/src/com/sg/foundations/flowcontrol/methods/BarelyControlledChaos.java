package com.sg.foundations.flowcontrol.methods;

import java.util.Random;

public class BarelyControlledChaos {

	public static void main(String[] args) {
		
		String color = colourRandom(); // call color method here
        String animal = animalRandom(); // call animal method again here
        String colorAgain = colourRandom(); // call color method again here
        int weight = numberRandom(5, 200); // call number method,
            // with a range between 5 - 200
        int distance = numberRandom(10, 20); // call number method,
            // with a range between 10 - 20
        int number = numberRandom(10000, 20000); // call number method,
            // with a range between 10000 - 20000
        int time = numberRandom(2, 6); // call number method,
            // with a range between 2 - 6            

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
            + weight + "lb " + " miniature " + animal
            + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
            + number + " " + colorAgain + " poppies for nearly "
            + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
            + "let me tell you!");

	}
	
	public static String colourRandom() {
		Random r = new Random();
		
		String[] colours = new String[] {"red","green","blue","purple","orange"};
		int randomIndex = r.nextInt(colours.length);
		String randomColour = colours[randomIndex];
		return randomColour;
		
		
	}
	
	public static String animalRandom() {
		Random r = new Random();
		
		String[] animals = new String[] {"lion","turtle","dog","cat","bird"};
		int randomIndex = r.nextInt(animals.length);
		String randomAnimal = animals[randomIndex];
		return randomAnimal;
	}
	
	public static int numberRandom(int no1, int no2) {
		Random r = new Random();
		
		int randomNumber = r.nextInt(no1, (no2+1));
		return randomNumber;
		
	}

}
