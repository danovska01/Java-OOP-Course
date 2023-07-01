package _07_Inheritance_And_Abstraction.BorderControl;

public class Robot implements Identifiable{
    private String model;
    private String id;

    public Robot(String model, String id) {
        this.model = model;
        this.id = id;
    }
    public String getModel(){
        return this.model;
    }
    @Override
    public String getId() {
        return this.id;
    }
}