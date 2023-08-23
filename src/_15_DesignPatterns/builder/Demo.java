package _15_DesignPatterns.builder;

public class Demo {
	public static void main(String[] args) {
		Alcohol alcohol1 = Alcohol
				.sellMeAlcohol("rakiq")
				.setDegree(20)
				.setFruit("Grozde")
				.build();
		System.out.println(alcohol1);

		Alcohol alcohol2 = Alcohol
				.sellMeAlcohol("wine")
				.setDegree(33)
				.setFruit("grapes")
				.build();
		System.out.println(alcohol2);

		Alcohol alcohol3 = Alcohol
				.sellMeAlcohol("beer")
				.setDegree(12)
				.build();
		System.out.println(alcohol3);
	}
}
