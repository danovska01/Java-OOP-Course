package _15_DesignPatterns.observer;

public class Demo {
	public static void main(String[] args) {
		Tray tray = new Tray();
		Grandmother lenche = new Grandmother(tray);
		
		Child peshko = new Child("Peshko");
		Child goshko = new Child("Goshko");
		Child pepi = new Child("Pepi");
		Grandfather stavri = new Grandfather();
		
		tray.addObserver(pepi);
		tray.addObserver(peshko);
		tray.addObserver(goshko);
		tray.addObserver(stavri);
		
		lenche.cook();
		System.out.println();
		System.out.println("Gosho is no more hungry, he will no more participate in taking meatballs! ");
		tray.removeObserver(goshko);
		System.out.println("Peshko is no more hungry, he will no more participate in taking meatballs! ");
		tray.removeObserver(peshko);
		
		lenche.cook();
	}
}
