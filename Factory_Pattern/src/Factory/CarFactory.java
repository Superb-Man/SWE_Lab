package Factory;

import Manufacturers.BMWManufacturer;
import Manufacturers.CarManuFacturer;
import Manufacturers.TeslaManufacturer;
import Manufacturers.ToyotaManufacturer;

public class CarFactory {
    public CarManuFacturer getCarManufacturer(String location) {
        if(location == null) return null ;
        if(location.equalsIgnoreCase("Asia")){
            return new ToyotaManufacturer() ;
        }
        if(location.equalsIgnoreCase("America")){
            return new TeslaManufacturer() ;
        }
        if(location.equalsIgnoreCase("Europe")){
            return new BMWManufacturer();
        }

        return null ;

    }
}
