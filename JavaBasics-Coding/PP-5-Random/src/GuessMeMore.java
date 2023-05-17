import java.util.Random;
import java.util.Scanner;

public class GuessMeMore {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random r = new Random();
		
		int number = r.nextInt(200)-100;
		
		for (int counter=0;counter<2;counter++) {
			
			System.out.println("Pick a number: ");
			int userNumber = scanner.nextInt();
			
			if (userNumber == number) {
				System.out.println("Wow, nice guess! That was it!");
				break;
			}
			else if (userNumber<number) {
				System.out.println("Ha, nice try - too low!");
			}
			else {
				System.out.println("Too bad, way too high!");
			}
			
			
		}
		System.out.println("My choice was: "+number);
		
		
		

	}

}
