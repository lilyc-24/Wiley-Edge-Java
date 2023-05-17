import java.util.Scanner;

public class ForTimesFor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What times table do you want to practice?");
		int timesTable = scanner.nextInt();
		int userScore = 0;
		
		for(int i=1;i<=15;i++) {
			
			int answer = i*timesTable;
			System.out.print(i+" x "+timesTable+" = ");
			int userAnswer = scanner.nextInt();
			
			if (answer==userAnswer) {
				System.out.println("Correct!");
				userScore++;
			}else {
				System.out.println("Sorry no, the answer is "+answer);
			}
		}
		
		System.out.println("Your score was: "+userScore);
		double percent = userScore/15;
		
		if(percent<=0.5) {
			System.out.println("Study harder");
		}else if(percent >=0.9) {
			System.out.println("Well done! You did great!");
		}
		

	}

}
