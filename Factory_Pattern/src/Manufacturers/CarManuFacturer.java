package Manufacturers;

import Components.CarColor;
import Components.DriveTrainSystem;
import Components.Engine;

abstract public class CarManuFacturer {
    protected String country ;
    protected Engine engine ;
    protected DriveTrainSystem dtSystem;
    protected CarColor color ;
    public Engine getEngine() {
        return engine ;
    }
    public abstract void setEngine() ;
    public abstract void setCountry() ;
    public String getCountry() {
        return country ;
    }
    public CarColor getColor() {
        return color ;
    }
    public abstract void setColor() ;
    public abstract void setDtSystem() ;
    public DriveTrainSystem getDtSystem() {
        return dtSystem ;
    }

    @Override
    public String toString() {
        return  "Car Manufacturer : "+getClass().getName()+'\n'
                +"Color : "+color.primaryColor()+'\n'
                +"Engine : "+engine.getTypeName()+'\n'
                +"Drive Train System : "+dtSystem.getTypeName() ;
    }


}
