package _14_Exceptions;

import java.io.IOException;

public class Experiment {
	
	public static void main(String[] args) {
		
		System.out.println("Shte si porycham bomba");
		napraviMiBomba();
		System.out.println("Napravih mi bomba, ura!");
	}

	private static void napraviMiBomba() {
		System.out.println("Ei sega shte ti napravq 1 golqma bomba");
		try {
			shteSeOpitamDaNapravqBomba();
//			System.exit(0);
		}
		catch(SecurityException | NullPointerException | ArithmeticException e) { // Java 7+
			System.out.println("Batko probvah da ti q napravq ama ne stana");
			return;
		}
		finally {
			System.out.println("Vsichko svyrshi!");
		}
		
		
//		System.out.println("Napravih ti q, chestito!");
	}

	private static void shteSeOpitamDaNapravqBomba() {
		
		System.out.println("Pochvam da q pravq!");
//		String k = null;
//		System.out.println(k.length());
//		int x = 8;
//		
//		x = x / 0;
//		
		System.out.println("Gotova e rabotata!");
		
	}
}
