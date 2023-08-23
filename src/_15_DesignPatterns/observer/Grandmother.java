package _15_DesignPatterns.observer;

public class Grandmother {
	private Tray tray;

	public Grandmother(Tray tray) {
		this.tray = tray;
	}
	
	void cook() {
		System.out.println("GrandMa starts cooking the meatballs! ");
		tray.addMeatballs();
	}
}
