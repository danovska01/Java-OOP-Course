package _15_DesignPatterns.observer;

import java.util.HashSet;
import java.util.Set;

public class Tray {
	private int numberMeatballs = 0;
	
	// observer pattern
	private Set<IHungry> allHungry = new HashSet<>();
	
	public void addObserver(IHungry hungryThing) {
		allHungry.add(hungryThing);
	}
	
	public void removeObserver(IHungry hungryThing) {
		allHungry.remove(hungryThing);
	}	
	
	
	public void addMeatballs() {
		System.out.print("Meatballs added! ");
		numberMeatballs += (int)(Math.random() * 20);
		System.out.println("Number meatballs of meatballs : " + numberMeatballs);
		// notify all observers
		for (IHungry h : allHungry) {
			h.comeAndTake(this);
		}
		
	}
	
	public void getMeatBall() {
		if (numberMeatballs > 0) {
			System.out.print("Someone took a meatball.");
			numberMeatballs--;
			System.out.println("Number meatballs left after taking is: " + numberMeatballs);
		} else {
			System.out.println("Someone wants a meatball, but the meatballs in the tray have finished!");
		}
	}
}
