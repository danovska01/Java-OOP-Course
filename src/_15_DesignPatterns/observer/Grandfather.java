package _15_DesignPatterns.observer;

public class Grandfather implements IHungry {
	
	@Override
	public void comeAndTake(Tray tray) {
		System.out.println("I am the grandpa and I have to take 5 pieces of meatballs!");
		tray.getMeatBall();
		tray.getMeatBall();
		tray.getMeatBall();
		tray.getMeatBall();
		tray.getMeatBall();
	}
}
