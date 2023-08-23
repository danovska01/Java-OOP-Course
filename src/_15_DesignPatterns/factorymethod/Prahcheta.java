package _15_DesignPatterns.factorymethod;

public class Prahcheta implements ILekarstvo {

	Prahcheta() {
	} 
	
	public Prahcheta getPrahcheta(boolean vitaminCDaImaLi) {
		if (vitaminCDaImaLi) {
			return new PrahchetaSVitaminC();
		}
		return new Prahcheta();
	}
	
	@Override
	public String toString() {
		return "Prahcheta []";
	}

	@Override
	public void lekuvai() {
		Prahcheta p = getPrahcheta(true);
		System.out.println("Na magiq lekuvat tiq prahcheta");
	}

}
