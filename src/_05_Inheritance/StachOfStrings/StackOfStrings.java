package _05_Inheritance.StachOfStrings;

import java.util.ArrayList;

public class StackOfStrings {
    private ArrayList<String> data;

    public StackOfStrings() {
        data = new ArrayList<>();
    }

    public void push(String item) {
        data.add(item);
    }

    public String pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot perform pop operation.");
        }
        return data.remove(data.size() - 1);
    }

    public String peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot perform peek operation.");
        }
        return data.get(data.size() - 1);
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }
}
