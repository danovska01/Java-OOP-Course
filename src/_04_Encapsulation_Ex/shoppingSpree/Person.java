package _04_Encapsulation_Ex.shoppingSpree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {


    private final List<Product> products;
    private String name;
    private double money;

    public Person(String name, double money) {
        setMoney(money);
        setName(name);
        this.products = new ArrayList<>();
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public void buyProduct(Product p) {
        if (this.money < p.getCost()) {
            throw new IllegalArgumentException(String.format("%s can't afford %s", this.name, p.getName()));
        }
        this.money -= p.getCost();
        this.products.add(p);
        System.out.printf("%s bought %s\n", this.name, p.getName());
    }

    public List<Product> getProducts() {
        return Collections.unmodifiableList(products);
    }



}
