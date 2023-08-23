package _15_DesignPatterns.builder;

public class Wine extends Alcohol{
    private int degree;
    private String fruit;

    @Override
    Alcohol setDegree(int degree) {
        if (degree > 0) {
            this.degree = degree;
        }
        return this;
    }

    @Override
    Alcohol setFruit(String fruit) {
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
        return "Wine{" +
                "degree=" + degree +
                ", fruit='" + fruit + '\'' +
                '}';
    }
}
