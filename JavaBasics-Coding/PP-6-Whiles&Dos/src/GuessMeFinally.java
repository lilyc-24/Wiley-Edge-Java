import java.util.Random;
import java.util.Scanner;

public class GuessMeFinally {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random r = new Random();
		
		int number = r.nextInt(200)-100;
		
		while(true) {
			
			System.out.println("Pick a number: ");
			int userNumber = scanner.nextInt();
			
			if (userNumber == number) {
				System.out.println("Finally it's about time you got it!");
				break;
			}
			else if (userNumber<number) {
				System.out.println("Ha, nice try - too low!");
			}
			else {
				System.out.println("Too bad, way too high!");
			}
			
				
		}
	}
}
		
	
		