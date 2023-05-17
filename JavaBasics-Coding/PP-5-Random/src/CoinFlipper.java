import java.util.Random;

public class CoinFlipper {

	public static void main(String[] args) {
		Random r = new Random();
		
		double flipResult = r.nextDouble();
		
		if(flipResult<0.5) {
			System.out.println("You rolled a heads!");
		}
		else {
			System.out.println("You rolles a tails!");
		}
		

	}

}
