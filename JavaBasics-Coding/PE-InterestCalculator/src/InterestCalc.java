import java.text.DecimalFormat;
import java.util.Scanner;

public class InterestCalc {

	private static final DecimalFormat df = new DecimalFormat("0.00");
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How much do you want to invest?");
		double initial = scanner.nextInt();
		
		System.out.println("How many years are you investing? ");
		int years = scanner.nextInt();
		
		System.out.println("What is the anual interest rate % growth?");
		double interest = scanner.nextInt();
		
		interestCalc(initial, years, interest);

	}
	
	public static int compoundType() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Select type of compound from list(1-3): ");
		System.out.println("1-Quarterly");
		System.out.println("2-Monthly");
		System.out.println("3-Daily");
		
		while (true) {
			int select = scanner.nextInt();
			switch (select) {
			case 1: {
				return 4;
			}
			case 2:{
				return 12;
			}
			case 3:{
				return 365;
			}
			default:
				System.out.println("Selection not available. Try again.");;
			}
		}
	}
	
	public static void interestCalc(double initial,int years, double interest) {
		int type = compoundType();
		
		for (int i=1;i<=years;i++) {
			
			double factor = ((interest/type)/100) +1;
			double end = initial*(Math.pow(factor, type));
			double earned = end-initial;
			
			System.out.println("\nYear "+i+":");
			System.out.println("Began with: £"+df.format(initial));
			System.out.println("Earned: £"+df.format(earned));
			System.out.println("Ended with: £"+df.format(end));
			
			initial = end;
		}
	}

}

