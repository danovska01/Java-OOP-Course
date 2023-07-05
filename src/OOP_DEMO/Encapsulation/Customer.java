package OOP_DEMO.Encapsulation;

//Bundling of data and operations to be performed on that data into single unit is called as encapsulation.
// DEMO_OOP.Encapsulation in Java can be achieved by including both variables (data) and methods (operations) which act upon those variables into a single unit called class.
//DEMO_OOP.Encapsulation is often used to hide important information from outside the world. It is called data hiding. This can be achieved by declaring all
// important variables as private and providing public getter and setter methods.

public class Customer {
    private int custID;
    private String name;
    private String address;

    //Getter and setter for custID

    public int getCustID()
    {
        return custID;
    }

    public void setCustID(int custID)
    {
        this.custID = custID;
    }

    //Getter and setter for name

    public String getName() {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    //Getter and setter for address

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }
}
