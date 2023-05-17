import java.util.Random;

public class LazyTeenager {

	public static void main(String[] args) {
		Random r = new Random();
		
		int cleanRoom = 1;
		double chance = 0.1;
		boolean roomClean = false;
		
		do {
			
			System.out.println("Clean your room!! (x"+cleanRoom+")");
			
			if (cleanRoom ==7) {
				System.out.println("You're grounded and I'm taking the x-box");
				break;
			}
			
			double cleanChance = r.nextDouble();
			
			if (cleanChance<=chance) {
				System.out.println("Fine I'll clean my room!");
				break;
			}
			
			chance += 0.1;
			cleanRoom ++;
			
			
		}while(!roomClean);

	}

}
