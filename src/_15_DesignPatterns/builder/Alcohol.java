package _15_DesignPatterns.builder;


public abstract class Alcohol {
	static Alcohol sellMeAlcohol(String type) {
		switch (type.toLowerCase()) {
			case "rakiq":
				return new Rakiq();
			case "beer":
				return new Beer();
			case "wine":
				return new Wine();
			default:
				return new Beer();
		}
	}

	abstract Alcohol setDegree(int degree);

	abstract Alcohol setFruit(String fruit);

	abstract Alcohol build();
}
