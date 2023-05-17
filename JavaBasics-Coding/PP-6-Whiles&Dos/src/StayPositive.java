import java.util.Scanner;

public class StayPositive {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int counter;
		
		while (true) {
			System.out.println("What are we starting the countdown from?");
			counter =scanner.nextInt();
			
			if (counter>0) {
				break;
			}
			else {
				System.out.println("Please enter a posiitve integer");
			}
		}
		
		
		System.out.println("Counting down... \n");
		
		while(counter>=0) {
			

			if (counter%10==0) {
				System.out.print(counter+" ");
				System.out.println("");
				counter--;
				}
			else {
				System.out.print(counter+ " ");
				counter--;
				}
	
			
		}
		System.out.println("\nBlast off!!");
	}

}
