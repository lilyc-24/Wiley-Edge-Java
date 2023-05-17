import java.util.Random;

public class ALittleChaos {

	public static void main(String[] args) {
		Random r = new Random();
		
		System.out.println("Random can make integers: "+r.nextInt());
		System.out.println("Or a double: "+r.nextDouble());
		System.out.println("Or a boolean: "+r.nextBoolean());
		
		int num = r.nextInt(100);
		
		System.out.println("You can store a randomised result: "+num);
		System.out.println("And use it over and over again: "+ num +","+num);
		
		System.out.println("Or keep gereating new values");
		System.out.println("Random numbers between 0-100:");
		
		System.out.println(r.nextInt(51)+50);
		System.out.println(r.nextInt(51)+50);
		System.out.println(r.nextInt(51)+50);
		System.out.println(r.nextInt(51)+50);
		System.out.println(r.nextInt(51)+50);
		
		int sum = r.nextInt(11)+r.nextInt(11);
		System.out.println(sum);
		
		

	}

}
