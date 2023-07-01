package _07_Inheritance_And_Abstraction.carShop;

import java.io.Serializable;

public interface Car extends Serializable {
     int TIRES = 4;
     String getModel ();
     String getColor();
     Integer getHorsePower();
     String countryProduced();


}
