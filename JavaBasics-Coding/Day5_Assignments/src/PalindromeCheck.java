import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//user input - may want to check if positive number too
		System.out.println("Enter the number you wish to reverse: ");
		int number = scanner.nextInt();
		
		//call isPalindrome function and print if is a palindrome or not
		boolean palindrome = isPalindrome(number);
		
		if (palindrome==true) {
			System.out.println("This is a palindrome!");
		}
		else {
			System.out.println("This is not a palindrome!");
		}
	}
	
	public static int reverseNumber(int number) {
		int remainder, reverseNumber=0;
		
		for(;number!=0;number=number/10) {
			remainder = number%10;
			reverseNumber = reverseNumber*10 + remainder;
		}
		
		return reverseNumber;

	}
	
	public static boolean isPalindrome (int number) {
		int reverseNo = reverseNumber(number);
		
		if (number == reverseNo) {
			return true;
		}
		else {
			return false;
		}
	}

}
