import java.util.Scanner;

public class TheCount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Provide a start value: ");
		int start = scanner.nextInt();
		
		System.out.println("Provide an end value: ");
		int end = scanner.nextInt();
		
		System.out.println("Provide an incriment amount: ");
		int inc = scanner.nextInt();
		
		for(int i = 1;start<end;start+=inc,i++) {
			
			if(i%3==0) {
				System.out.print(start+" - Ah ah ah!");
				System.out.println("");
			}else {
				System.out.print(start +" ");
			}
		}

	}

}
