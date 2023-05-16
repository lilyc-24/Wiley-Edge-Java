import java.util.Scanner;

public class sumArray {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		double numberArray[] = new double[8];
		double total = 0;
		
		for (int index = 0;index<8;index++) {
			System.out.print("Enter number "+(index+1)+": ");
			numberArray[index]= scanner.nextDouble();
			total += numberArray[index];
		}
		
		System.out.println("\nThe sum of entered values is: "+total);
		

	}
	
}
