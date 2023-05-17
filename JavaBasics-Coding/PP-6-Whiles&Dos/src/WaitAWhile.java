
public class WaitAWhile {

	public static void main(String[] args) {
		
		int timeNow= 11;
		int bedTime = 10;
		
		while(timeNow<bedTime) {
			System.out.println("Its only "+timeNow+" o'clock!");
			System.out.println("Stay up reading a little looonger.....");
			timeNow++;
		}
		
		System.out.println("Oh its "+timeNow+" o'clock..");
		System.out.println("Bedtime i guess....");
	}

}
