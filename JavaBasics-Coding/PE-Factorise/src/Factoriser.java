import java.util.Scanner;

public class Factoriser {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
		int sumFactors =0;
		int noFactors = 0;
		int factors[];
		
		System.out.print("\nThe factors of "+number+" are: ");
		
		for(int i=1;i<=number;i++) {
			
			if(i==number) {
				System.out.println(i);
				break;
			}else if(number%i==0) {
				System.out.print(i+" ");
				sumFactors += i;
				noFactors++;
			}
		}
		
		System.out.println("\n"+number+" has "+(noFactors+1)+" factors");
		
		if (sumFactors==number) {
			System.out.println(number+" is a perfect number");
		}else {
			System.out.println(number+" is not a perfect number");
		}
		if (sumFactors==1) {
			System.out.println(number+" is a prime number");
		}else {
			System.out.println(number+" is not a prime number");
		}
	
	

}
}
