package Manufacturers;

import Components.ColorBlackPrimary;
import Components.ElectricEngine;
import Components.FuelEngine;
import Components.RearWheelSystem;

public class BMWManufacturer extends CarManuFacturer {
    @Override
    public void setColor() {
        this.color = new ColorBlackPrimary() ;
    }

    @Override
    public void setCountry() {
        this.country = "Germamny" ;
    }

    @Override
    public void setDtSystem() {
        this.dtSystem = new RearWheelSystem() ;
    }

    @Override
    public void setEngine() {
        this.engine = new ElectricEngine() ;
    }
}
