import java.text.DecimalFormat;
import java.util.Scanner;

//go through and edit to include it in a loop and don't use arrays and reading the pair of values but just do it into a loop and include total retail price
public class shopAssignment {
	
	private static final DecimalFormat df = new DecimalFormat("0.00");
	
	final static double product1 = 22.5;
	final static double product2 = 44.5;
	final static double product3 = 9.98;

	public static void main(String[] args) {
		int shopList[] = userShop();
		readData(shopList);
	}
	
	//edit this in order to put in a loop- so add module for getProductNo = check in there for validity and output the price - need to let user ask for product number
	//want to make it easier to increase the product number
	public static int[] userShop() {
		Scanner scanner = new Scanner(System.in);
		int productList[] = new int[6];
		
		System.out.println("Welcome to the shop: \n");
		System.out.println("How much of each product do you wish to buy? \n");
		System.out.println("Product 1 - £"+product1);
		productList[0] = 1;
		productList[1] = scanner.nextInt();
		System.out.println("Product 2 - £"+product2);
		productList[2] = 2;
		productList[3] = scanner.nextInt();
		System.out.println("Product 3 - £"+product3);
		productList[4] = 3;
		productList[5] = scanner.nextInt();
		
		return productList;
	}
	
	//add input here that takes the productNo and quantity and then can output the total of that and make a new module for running total (global variable)
	public static void readData(int[] numbers) {
		double productTotal = 0;
		
		for (int i=0;i<numbers.length -1; i +=2) {
			
			int productNo = numbers[i];
			int quantitySold = numbers[i+1];
			
			switch (productNo) {
			case 1: {
				productTotal += (product1*quantitySold);
				break;
			}
			case 2: {
				productTotal += (product2*quantitySold);
				break;
			}
			case 3: {
				productTotal += (product3*quantitySold);
				break;
			}
			default:
				System.out.println("The pair beginning at "+i+" contains an incorrect product number");
			}
		}
		
		System.out.println("\nThe total cost of products sold is £"+ df.format(productTotal));
	}
	

}
