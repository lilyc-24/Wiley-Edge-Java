import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//while loop so game will continue until user wishes to stop
		while(true) {
			
			System.out.println("Welcome to Rock Paper Scissors!");
			
			//number of rounds user wishes to play and check if valid amount entered
			System.out.println("Enter the number of rounds you wish to play (1-10): ");
			int rounds = scanner.nextInt();
			
			if (checkValid(1, 10, rounds)==false) {
				System.out.println("This is an invalid amount of rounds.");
				System.exit(0);
			}
				
			//going through the number of rounds and declaring results
			int results[] = playGame(rounds);
			
			int tie = results[0];
			int compWin = results[1];
			int userWin = results[2];
			
			//display final results
			if(compWin==userWin) {
				System.out.println("It was a tie at "+tie);
			}
			else if(compWin>userWin) {
				System.out.println("Computer wins "+compWin+" to "+userWin);
			}
			else {
				System.out.println("User wins "+userWin+" to "+compWin);
			}
			
			//ask if user wishes to play again
			playAgain();
			
		}
		
	}
  
	//check validity of number input based on max and min values
	public static boolean checkValid(int minValue,int maxValue,int value) {
		return value>=minValue && value<=maxValue;
	}
	
	//display menu for user choices and takes and checks input
	public static int menu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Select your choice: ");
		System.out.println("1- Rock");
		System.out.println("2- Paper");
		System.out.println("3- Scissors");
		int choice;
		
		while(true) {
			choice = scanner.nextInt();
			if (checkValid(1, 3, choice)) {
				break;
			}else {
				System.out.println("You have entered an invalid option. Try again.");
			}
		}
		return choice;
	}
	
	//generate computer answer
	public static int compAnswer() {
		Random r = new Random();
		int compAnswer = r.nextInt(1, 4);
		return compAnswer;
	}
	
	//display the scores
	public static void displayScores(int compWin,int userWin,int tie,int compChoice) {
		System.out.println("Computer choice was "+compChoice);
		System.out.println("Current scores - Comp:"+compWin+" User:"+userWin+" Ties:"+tie);
	}
	
	//provide option to play again or exit the system
	public static void playAgain() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Would you like to play again (y/n)?");
		
		while(true) {
			String playChoice = scanner.next();
			if (playChoice.equalsIgnoreCase("y")) {
				break;
			}
			else if (playChoice.equalsIgnoreCase("n")) {
				System.out.println("Thank you for playing!");
				System.exit(0);
			}
			else {
				System.out.println("You have not entered a valid option. Try again.");
			}
				
		}
	}
	
	//play rock paper scissors for the specified amount of rounds
	public static int[] playGame(int rounds) {
		
		//declare variables
		int tie =0,compWin=0,userWin=0;
		
		//play game - display menu and get user and computer answers every round and display results
		for(int counter=0;counter<rounds;counter++) {
			int choice = menu();
			int compChoice = compAnswer();
			
			if (choice==compChoice) {
				tie += 1;
				displayScores(compWin, userWin, tie, compChoice);
			}
			else if ((compChoice==1 && choice==3)||(compChoice==2 && choice==1)||(compChoice==3 && choice==2)) {
				compWin +=1;
				displayScores(compWin, userWin, tie, compChoice);
			}
			else { //((choice==1 && compChoice==3)||(choice==2 && compChoice==1)||(choice==3 && compChoice==2))
				userWin +=1;
				displayScores(compWin, userWin, tie, compChoice);
			}
		}
		
		//return the results of the overall game for the number of rounds
		int results[] = {tie,compWin,userWin};
		return results;
	
	
		
	}}
