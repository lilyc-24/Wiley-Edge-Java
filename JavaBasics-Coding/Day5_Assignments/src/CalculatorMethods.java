import java.util.Scanner;

public class CalculatorMethods {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("Calculator: ");
			//put menu display into its own module and then go into calculator and add the number options there
			//can put the choices in if loop to check if required in calculator section eg if choice is between choice values ask otherwise dont
			
			int noOne = readValue("Enter number one: ");
			int noTwo = readValue("Enter number two: ");
			int choice = readValue("Calculation to complete (1-5): \n1-Multiply \n2-Divide \n3-Addition \n4-Subtraction \n5-Exit");
			
			calculator(choice, noOne, noTwo);
		}
			
		
		
		}
	
	//might just remove this as it is causing issues in terms of allowing the input of floats
	public static int readValue(String prompt) {
		Scanner scanner = new Scanner(System.in);	
		System.out.println(prompt);
		int value = scanner.nextInt();
		return value;
	}
	
	
	public static void calculator(int choice, int noOne,int noTwo) {
		
		switch (choice) {
		case 1: {
			float result = noOne*noTwo;
			System.out.println(result);
			break;
		}
		case 2: {
			float result = noOne/noTwo;
			System.out.println(result);
			break;
		}
		case 3: {
			float result = noOne+noTwo;
			System.out.println(result);
			break;
		}
		case 4: {
			float result = noOne-noTwo;
			System.out.println(result);
			break;
		}
		case 5: {
			System.out.println("Goodbye");
			System.exit(0);
		}
		default:
			System.out.println("Not a valid option.");
		}
	
	
		
	}

}
