
public class LovesMe {

	public static void main(String[] args) {
		int petals = 34;
		
		while(petals>0) {
			if (petals%2==0) {
				System.out.println("It loves me!");
				petals--;
			}
			else {
				System.out.println("It loves me NOT!");
				petals--;
			}
		}
		System.out.println("Its just a flower anyway...");

	}

}
