package _15_DesignPatterns.observer;

public class Child implements IHungry {

	private String name;
	
	public Child(String name) {
		this.name = name;
	}

	@Override
	public void comeAndTake(Tray tray) {
		System.out.println("I am "+ this.name+" and I am very hungry.");
		tray.getMeatBall();
	}

}
