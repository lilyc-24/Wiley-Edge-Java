import java.util.Scanner;

public class WindowMaster {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the cost of thw window per square foot: ");
		float areaCost = scanner.nextFloat();
		
		System.out.println("Enter the cost of the window trim per foot: ");
		float perimeterCost = scanner.nextFloat();
	
		System.out.println("Enter the height of the window in feet: ");
		float height = scanner.nextFloat();
		
		System.out.println("Enter the width of the window in feet: ");
		float width = scanner.nextFloat();
		
		System.out.println("How many windows of this size do you need?");
		int noWindows = scanner.nextInt();
		
		float area = height*width;
		float perimeter = (height*2)+(width*2);
		
		float total = ((area*areaCost)+(perimeter*perimeterCost))*noWindows;
		
		System.out.println("The total cost of the window is £"+total);
		

	}

}
