package _15_DesignPatterns.factorymethod;

public class Aspirin implements ILekarstvo {
	public void lekuvai() {
		System.out.println("Lekuvam kato aspirin - demek vsichko");
	}

	@Override
	public String toString() {
		return "Aspirin []";
	}
}
