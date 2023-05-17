import java.util.Random;

public class FortuneCookie {

	public static void main(String[] args) {
		Random r = new Random();
		
		String quotes[] = new String[] {"hello","what is happening","I'm confused",
				"let me out you crazy person","helpppppp"};
		
		System.out.println(quotes[r.nextInt(quotes.length)]);
		
		}

	}


