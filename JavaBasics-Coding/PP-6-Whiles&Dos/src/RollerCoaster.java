import java.util.Scanner;

public class RollerCoaster {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("We're going to go on a roller coaster...");
		System.out.println("Let me know when you want to get off...");
		
		String keepRiding = "y";
		int loopsLooped = 0;
		while (keepRiding.contentEquals("y")) {
			System.out.println("WHEEEEEEEEEEEEE.........!!!!!!");
			
//			keepRiding = userInput.nextLine();
			
			while(true) {
				System.out.println("Want to keep going?");
				String input = userInput.nextLine();
				if (input.equalsIgnoreCase("y")) {
					loopsLooped++;
					break;
				}
				else if (input.equalsIgnoreCase("n")){
					System.out.println("That was fun!!!");
					System.out.println("We looped that loop "+loopsLooped+" times!!");
					System.exit(0);
				}
				else{
					System.out.println("Entered an invalid input");
				}
			}
			
			
		}
		
		
		

	}

}
