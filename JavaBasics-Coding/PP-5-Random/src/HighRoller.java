import java.util.Random;
import java.util.Scanner;

public class HighRoller {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many sides does the dice have?");
		int diceSides = scanner.nextInt();
		
		int rollResult = r.nextInt(diceSides)+1; //this will do the roll 0-5 and add one
		
		System.out.println("Roll time!!!");
		System.out.println("I rolled a "+rollResult);
		
		if (rollResult==1) {
			System.out.println("Critical failure...");
		}
		if (rollResult==diceSides) {
			System.out.println("You rolled a critical! Nice job!");
		}

	}

}
