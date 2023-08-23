package _15_DesignPatterns.factorymethod;

public class Apteka {
	// factory method
	public ILekarstvo daiMi(boolean glavaBoliLi, int kg, int age, boolean stomahaBoliLiTe) {
		if (glavaBoliLi) {
			if ((kg > 50) && (age > 10))
				return new Prahcheta();
			
			if (!stomahaBoliLiTe)
				return new Aspirin();
			
			return new Rakiq();
		} else {
			return new Rakiq();
		}
	}
}
