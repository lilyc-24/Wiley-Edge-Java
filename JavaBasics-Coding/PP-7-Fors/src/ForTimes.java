import java.util.Scanner;

public class ForTimes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What times table do you want to see?");
		int timesTable = scanner.nextInt();
		
		for(int i=1;i<=15;i++) {
			System.out.println(i+" x "+timesTable+" = "+(i*timesTable));
		}

	}

}
