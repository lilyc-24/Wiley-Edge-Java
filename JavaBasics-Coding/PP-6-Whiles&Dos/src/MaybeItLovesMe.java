import java.util.Scanner;

public class MaybeItLovesMe {

	public static void main(String[] args) {
		
		int petals = petalNumber();
		int petalMsg=0;
		int counter=1;
		
		while(counter<=petals) {
			
			if(counter%2==0) {
				System.out.println("It loves me!");
				counter++;
				petalMsg=1;
			}
			else {
				System.out.println("It loves me NOT!");
				counter++;
				petalMsg=2;
			}
		}
		
		if (petalMsg==1) {
			System.out.println("I knew it loved me");
		}
		else {
			System.out.println("Aww bummer!");
		}

	}

	
	public static int petalNumber() {
		Scanner scanner= new Scanner(System.in);
		
		while (true) {
			System.out.println("How many petals does yout flower have? (13-89)");
			int petals = scanner.nextInt();
			if (petals>=13 && petals<=89) {
				return petals;
			}
			else {
				System.out.println("Invalid amount. Try again");
			}
		}
		
		
	}

}
