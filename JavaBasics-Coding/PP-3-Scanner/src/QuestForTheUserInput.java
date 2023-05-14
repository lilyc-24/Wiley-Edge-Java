import java.util.Scanner;

public class QuestForTheUserInput {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("What is your name?");
		String yourName = scanner.nextLine();
		
		System.out.println("What is your quest?");
		String yourQuest = scanner.nextLine();
		
		System.out.println("What is the airspeed velocity of an unladen swallow?");
		double velocityOfSwallow = scanner.nextDouble();
		
		System.out.println("How do you know "+velocityOfSwallow+" is correct "+yourName+"?");
		
		

	}

}
