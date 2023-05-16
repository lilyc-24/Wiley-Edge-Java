import java.util.Scanner;

public class CircularCheck {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("Enter a number: ");
			int number = scanner.nextInt();
			
			if (checkValid(number)==false) {
				System.out.println("This is not a valid number");
			}
			else {
				checkCircular(number);
				System.exit(0);
			}
		}
		
		
	}
		
		
	
	public static boolean checkValid(int number) {
		if (number<=0) {
			return(false);
		}
		else {
			return(true);
		}
		
	}
	
	public static void checkCircular(int number) {
		
		int lastNumber= number%10;
		int firstNumber = 0;
		int checkNumber = number*lastNumber;
		
		for(;checkNumber!=0;checkNumber /= 10) {
			firstNumber = checkNumber%10;
		}
		
		if (firstNumber == lastNumber) {
			System.out.println("This is a circular number!");
		}
		else {
			System.out.println("This is not a circular number.");
		}
		
		
	}

}
