package _15_DesignPatterns.factory;

public class Demo {
	public static void main(String[] args) {
		Pharmacy medeq = new Pharmacy();
		IMedicine medicine1 = medeq.giveMe(true, 9, 10, false);
		IMedicine medicine2 = medeq.giveMe(true, 9, 9, true);
		
		medicine1.heal();
		medicine2.heal();



	}
}
