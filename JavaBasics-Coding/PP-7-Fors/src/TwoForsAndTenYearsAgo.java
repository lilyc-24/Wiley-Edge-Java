import java.util.Scanner;

public class TwoForsAndTenYearsAgo {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("What year count back from?");
		int year = userInput.nextInt();
		
		for (int i=0;i<=10;i++) {
			System.out.println(i+" years ago would be "+(year-i));
		}
		
		System.out.println("\nCan count back a different way too!");
		
		for (int i=year;i>=year-20;i--) {
			System.out.println((year-i)+" years ago it would be "+i);
		}

	}

}
