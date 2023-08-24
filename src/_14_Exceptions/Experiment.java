package _14_Exceptions;

public class Experiment {
	
	public static void main(String[] args) {
		
		System.out.println("I will order cocktail!");
		makeMeCocktail();
		System.out.println("A cocktail was made for me!");
	}

	private static void makeMeCocktail() {
		System.out.println("A cocktail is started.");
		try {
			tryMakeCocktail();
//			System.exit(0);
		}
		catch(SecurityException | NullPointerException | ArithmeticException e) { // Java 7+
			System.out.println("Sorry, I tried making a cocktail, it did not work!");
			return;
		}
		finally {
			System.out.println("In the finally block");
		}
		
		
//		System.out.println("Here is the cocktail");
	}

	private static void tryMakeCocktail() {
		
		System.out.println("Start the cocktail!");
//		String k = null;
//		System.out.println(k.length());
//		int x = 8;
//		
//		x = x / 0;
//		
		System.out.println("Done!");
		
	}
}
