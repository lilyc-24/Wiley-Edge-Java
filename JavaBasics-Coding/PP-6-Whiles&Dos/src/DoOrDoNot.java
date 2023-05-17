import java.util.Scanner;

public class DoOrDoNot {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Should i do it? (y/n");
		boolean doIt;
		
		if(scanner.next().equalsIgnoreCase("y")) {
			doIt = true;
		}
		else {
			doIt = false;
		}
		
		boolean iDidIt = false;
		
		do {
			iDidIt = true;
			break;
		}while(doIt);
		
		if(doIt && iDidIt) {
			System.out.println("I did it!");
		}
		else if(!doIt && iDidIt) {
			System.out.println("I know you said not to but i did it...");
		}
		else {
			System.out.println("I didn't do anything");
		}
		
		

	}

}
