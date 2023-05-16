import java.util.Scanner;

public class NameArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String nameArray[];
		
		System.out.println("Enter the number of names you wish to store: ");
		int total = scanner.nextInt();
		
		nameArray=new String[total];
		
		for (int index=0;index<total;index++) {
			System.out.print("Enter name "+(index+1)+": ");
			nameArray[index] = scanner.next();
		}
		
		for (int index = 0;index<total;index++) {
			System.out.println("Name "+(index+1)+": "+nameArray[index]);
		}

	}

}
