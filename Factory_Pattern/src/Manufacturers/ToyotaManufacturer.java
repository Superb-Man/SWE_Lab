package Manufacturers;

import Components.ColorRedPrimary;
import Components.ColorWhitePrimary;
import Components.FuelEngine;
import Components.RearWheelSystem;

public class ToyotaManufacturer extends CarManuFacturer {
    @Override
    public void setEngine() {
        this.engine = new FuelEngine() ;
    }

    @Override
    public void setDtSystem() {
        this.dtSystem = new RearWheelSystem() ;
    }

    @Override
    public void setCountry() {
        this.country = "Japan" ;
    }

    @Override
    public void setColor() {
        this.color = new ColorWhitePrimary() ;
    }
}
