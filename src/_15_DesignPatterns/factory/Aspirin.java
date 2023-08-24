package _15_DesignPatterns.factory;

public class Aspirin implements IMedicine {
	public void heal() {
		System.out.println("Aspirin prescribed.");
	}

	@Override
	public String toString() {
		return "Aspirin []";
	}
}
