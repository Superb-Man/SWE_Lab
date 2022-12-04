package Manufacturers;

import Components.*;

public class TeslaManufacturer extends CarManuFacturer {
    @Override
    public void setEngine() {
        this.engine = new ElectricEngine() ;
    }

    @Override
    public void setDtSystem() {
        dtSystem = new AllWheelSystem() ;
    }

    @Override
    public void setCountry() {
        this.country = "USA" ;
    }

    @Override
    public void setColor() {
        this.color = new ColorRedPrimary() ;
    }
}
