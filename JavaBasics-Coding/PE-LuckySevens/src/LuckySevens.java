import java.util.Random;
import java.util.Scanner;

public class LuckySevens {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How much money do you have to play? ");
		int money = scanner.nextInt();
		
		gamePlay(money);

	}
	
	public static int diceResult() {
		Random r = new Random();
		
		int sumDice = (r.nextInt(6)+1)+(r.nextInt(6)+1);
		return sumDice;
		
	}
	
	public static void gamePlay(int initialMoney) {
		
		int totalRolls=0;
		int highestMoney=initialMoney;
		int rollsHighest=0;
		int money = initialMoney;
		
		while (money>0) {
			int result = diceResult();
			
			if (result==7) {
				money +=4;
				totalRolls++;
			}else {
				money -= 1;
				totalRolls++;
			}
			
			if(money>=initialMoney) {
				highestMoney=money;
				rollsHighest = totalRolls;
			}
		
		}
		System.out.println("You are broke after "+totalRolls+" rolls.");
		System.out.println("You should have quit after "+rollsHighest+" rolls when you had "+highestMoney);

	}
}