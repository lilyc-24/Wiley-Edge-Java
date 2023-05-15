import java.util.Scanner;

public class FactorialMethodThree {

	public static void main(String[] args) {
		
		int total = factorialCalculator();
		System.out.println("The factorial is "+total);
		

	}
	
	public static int factorialCalculator(){
		Scanner scanner = new Scanner(System.in);
		
		int total = 1;
		int factorial =0;
		
		do {
			System.out.println("Enter the number for the factorial: ");
			factorial = scanner.nextInt();
			
			if (factorial<=0) {
				System.out.println("Enter a positive value \n");
			}
		} while (factorial<=0);
	
		
		for(int counter=factorial;counter>0;) {
			total *= counter--;
		}
		
		return total;
				
	}
	


}
