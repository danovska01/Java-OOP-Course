package _15_DesignPatterns.factory;

public class Pharmacy {
	// factory method
	public IMedicine giveMe(boolean ifHeadHurts, int kg, int age, boolean ifStomachHurts) {
		if (ifHeadHurts) {
			if ((kg > 50) && (age > 10))
				return new Teraflu();
			if ((kg <= 50) && (age <= 10))
				return new TerafluSVitaminC();
			if (!ifStomachHurts)
				return new Aspirin();
			return new Injections();
		} else {
			return new Syrop();
		}
	}
}
