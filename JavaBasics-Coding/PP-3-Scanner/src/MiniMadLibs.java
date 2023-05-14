import java.util.Scanner;

public class MiniMadLibs {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Were going to play mad libs! Please input the following words: ");
		
		System.out.println("Noun: ");
		String noun = scanner.next();
		
		System.out.println("Adjective: ");
		String adjective = scanner.next();
		
		System.out.println("Noun: ");
		String nounTwo = scanner.next();
		
		System.out.println("Number: ");
		String number = scanner.next();
		
		System.out.println("Adjective: ");
		String adjectiveTwo = scanner.next();
		
		System.out.println("Plural noun: ");
		String pluralNounOne = scanner.next();
		
		System.out.println("Plural noun: ");
		String pluralNounTwo = scanner.next();
		
		System.out.println("Plural noun: ");
		String pluralNounThree = scanner.next();
		
		System.out.println("Verb present tense: ");
		String verb = scanner.next();
		
		System.out.println("Same verb but past tense: ");
		String verbTwo = scanner.next();
		
		System.out.print(noun+":the "+adjective+" frontier. These are the voyages of the starship "+nounTwo);
		System.out.print(".Its "+number+" year mission: to explore strange "+adjective+pluralNounOne+", to seek out ");
		System.out.print(adjective+pluralNounTwo+" and "+adjective+pluralNounThree+",to boldly "+verb+" where no one has "+verbTwo+" before.");

	}

}
