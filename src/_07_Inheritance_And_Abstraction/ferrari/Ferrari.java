package _07_Inheritance_And_Abstraction.ferrari;

public class Ferrari implements Car{

    private String driverName;
    private static final String model = "488-Spider";

    public Ferrari(String driverName) {
        this.driverName = driverName;
    }


    @Override
    public String brakes() {
        return "Brakes!";
    }

    @Override
    public String gas() {
        return "brum-brum-brum-brrrrr";
    }

    public String toString (){
        //{model}/{brakes}/{gas}/{driver's name}
        StringBuilder sb = new StringBuilder();
        sb.append(model).append("/").append(brakes()).append("/").append(gas()).append("/").append(driverName);


        return sb.toString();
    }
}
