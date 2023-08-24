package _14_Exceptions;

public class Hand {
	
	public void write() throws handBecomesTired, HandBroken {
		System.out.println("There is no sound when a hand is writing, though ... We are in the write method");
		if (Math.random() > 0.5) {
			System.out.println("Im some cases a hand becomes tired! 50% is the chance and an exception is thrown");
			throw new handBecomesTired();
		}
	}
}
