package _15_DesignPatterns.builder;

public class Rakiq extends Alcohol {
	private int degree;
	private String fruit;
	
	Rakiq setDegree(int degree) {
		if (degree > 0) {
			this.degree = degree;
		}
		return this;
	}
	
	Rakiq setFruit(String fruit) {
		if (fruit != null) {
			this.fruit= fruit;
		}
		return this;
	}

	@Override
	Alcohol build() {
		return this;
	}

	@Override
	public String toString() {
		return "Rakiq{" +
				"degree=" + degree +
				", fruit='" + fruit + '\'' +
				'}';
	}


}
