package _15_DesignPatterns.multiton;
import java.util.ArrayList;
import java.util.List;

public class Sun {
	private static final int MAX_SUNS = 5;
	
	private int temperature;
//	private static Sun theOnlyOneSun = null;
	private static List<Sun> sun = new ArrayList<Sun>();
	
	private Sun() {
		temperature = (int)(Math.random() * 2000) + 6000;
	}
	
	static Sun getInstance() {
		if (sun.size() < MAX_SUNS) {
			Sun sun = new Sun();
			Sun.sun.add(sun);
			return sun;
		}
		return sun.get((int)(Math.random() * sun.size()));
	}

	@Override
	public String toString() {
		return "Sun [temperature=" + temperature + "]";
	}
}
