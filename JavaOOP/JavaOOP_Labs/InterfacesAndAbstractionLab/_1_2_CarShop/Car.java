package JavaOOP.JavaOOP_Labs.InterfacesAndAbstractionLab._1_2_CarShop;

import java.io.Serializable;

public interface Car extends Serializable {
    Integer TIRES = 4;

    String getModel();
    String getColor();
    Integer getHorsePower();
    String countryProduced();
}
