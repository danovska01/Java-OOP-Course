package _15_DesignPatterns.builder;

public class Beer extends Alcohol {

	private int degree;

	@Override
	Alcohol build() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	Alcohol setDegree(int degree) {
		if (degree > 0) {
			this.degree = degree;
		}
		return this;
	}

	@Override
	Alcohol setFruit(String fruit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "Beer{" +
				"degree=" + degree +
				'}';
	}
}
