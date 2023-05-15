import java.util.Scanner;

public class FactorialMethodTwo {

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
		
		factorialCalculator(factorial);
		

	}
	
	public static void factorialCalculator(int factorial){
		
		int total = 1;
		
		for(int counter=factorial;counter>0;) {
			total *= counter--;
		}
		
		System.out.println("The factorial of "+factorial+" is "+total);
				
	}
	


}