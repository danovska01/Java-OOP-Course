package _15_DesignPatterns.factory;

public class Teraflu implements IMedicine {

	Teraflu() {
	} 
	
	public Teraflu getPowder(boolean IsWithvitaminC) {
		if (IsWithvitaminC) {
			return new TerafluSVitaminC();
		}
		return new Teraflu();
	}
	
	@Override
	public String toString() {
		return "Powder []";
	}

	@Override
	public void heal() {
		Teraflu p = getPowder(true);
		System.out.println("Prescribed powder:" + p);
	}

}
