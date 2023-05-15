import java.util.Scanner;

public class FactorialMethod {

	public static void main(String[] args) {
		factorialCalculator();
		

	}
	
	public static void factorialCalculator(){
		Scanner scanner = new Scanner(System.in);
		
		int total = 1;
		int factorial =0;
		
		do {
			System.out.println("Enter the number for the factorial: ");
			factorial = scanner.nextInt();
			
			if (factorial<=0) {
				System.out.println("Enter a positive value");
			}
		} while (factorial<=0);
	
		
		for(int counter=factorial;counter>0;) {
			total *= counter--;
		}
		
		System.out.println("The factorial of "+factorial+" is "+total);
				
	}
	


}
