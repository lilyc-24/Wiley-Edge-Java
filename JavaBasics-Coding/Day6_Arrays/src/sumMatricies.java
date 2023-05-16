import java.lang.reflect.Array;
import java.util.Scanner;

public class sumMatricies {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the no. of rows in a matrix: ");
		int rows = scanner.nextInt();
		System.out.println("Enter the no. of columns in a matrix: ");
		int cols = scanner.nextInt();
		
		System.out.println("Enter values for arrray one: ");
		int array1[][] = createArray(rows,cols);
		
		System.out.println("Enter values for array two: ");
		int array2[][] = createArray(rows,cols);
		
		int sumArray[][] = sumArrays(array1, array2,rows,cols);
		
		System.out.println("Array one");
		displayArray(array1,rows,cols);
		
		System.out.println("Array two");
		displayArray(array2,rows,cols);
		
		System.out.println("Array sum");
		displayArray(sumArray,rows,cols);

	}
	
	public static int[][] createArray(int rows, int cols) {
		Scanner scanner = new Scanner(System.in);
		
		int matrix[][];
		
		matrix = new int[rows][cols];
		
		for (int row = 0; row<rows;row++) {
			for(int col = 0;col<cols;col++) {
				System.out.println("Enter element at location :["+row+"]["+col+"]: ");
				matrix[row][col]=scanner.nextInt();
			}
		}
		return matrix;
	}
	
	public static void displayArray(int[][] array,int rows, int cols) {
		
		for(int row=0;row<rows;row++) {
			for(int col=0;col<cols;col++) {
				System.out.print(array[row][col]+"\t");
			}
			System.out.println("");
		}
	
	}
	
	public static int[][] sumArrays(int[][] array1, int[][] array2,int rows,int cols) {
		
		int sumArray[][] = new int[rows][cols];
		
		for(int row=0;row<rows;row++) {
			for (int col=0;col<cols;col++) {
				int sum = array1[row][col] + array2[row][col];
				sumArray[row][col] = sum;
			}
		}
		return sumArray;
	}
}
