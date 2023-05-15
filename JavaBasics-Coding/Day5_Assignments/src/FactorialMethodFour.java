import java.util.Scanner;

public class FactorialMethodFour {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int factorial =0;
		
		do {
			System.out.println("Enter the number for the factorial: ");
			factorial = scanner.nextInt();
			
			if (factorial<=0) {
				System.out.println("Please enter a positive value \n");
			}
		} while (factorial<=0);
		
		int result = factorialCalculator(factorial);
		System.out.println("The factorial is: "+result);
		

	}
	
	public static int factorialCalculator(int factorial){
		
		int total = 1;
		
		for(int counter=factorial;counter>0;) {
			total *= counter--;
		}
		
		return total;
				
	}
	


}