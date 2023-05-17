import java.util.Scanner;

public class TraditionalFizzBuzz {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
		int tracker=0;
		
		for (int i=0;i>=0;i++) {
			
			if(number==tracker) {
				System.out.println("TRADITION!!");
				break;
			}
			
			if(i%3==0 && i%5==0 && i!=0) {
				System.out.println("fizz buzz");
				tracker++;
			}
			else if(i%3==0 && i!=0) {
				System.out.println("fizz");
				tracker++;
			}
			else if(i%5==0 && i!=0) {
				System.out.println("buzz");
				tracker++;
			}
			else {
				System.out.println(i);
				
			}
		}

	}

}
