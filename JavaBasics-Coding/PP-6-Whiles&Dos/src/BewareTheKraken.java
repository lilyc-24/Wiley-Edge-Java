import java.util.Random;
import java.util.Scanner;

public class BewareTheKraken {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("Already, get those flippers and wetsuit on - we're going diving!");
		System.out.println("Here we goooOOooOooo.....! *SPLASH*");
		
		int depthDivedInFt = 0;
		
		while(depthDivedInFt<36200) {
			System.out.println("So far, we've swum " + depthDivedInFt + " feet");
			
			if(depthDivedInFt >=20000) {
				System.out.println("Uhhh, I think I see a Kraken, guys ....");
				System.out.println("TIME TO GO!!!!");
				break;
			}
			
			System.out.println("Do you wnat to stop? (y/n)");
			String stop = scanner.next();
			if (stop.equalsIgnoreCase("y")) {
				break;
			}
			
			depthDivedInFt +=1000;
			
			String fishList[] = new String[] {"cod","salmon","tuna","clownfish","turtle","shark"};
			System.out.println("Look a " +fishList[r.nextInt(fishList.length)]);
		}
		
		System.out.println("");
		System.out.println("We ended up swimming " + depthDivedInFt + " feet down.");
        System.out.println("I bet we can do better next time!");

	}

}
