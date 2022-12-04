package PCBuilders;

import Component.* ;
import Product.PersonalComputer;

import java.util.*;

public abstract class PCBuilder {
    protected List<Component>componentList = new ArrayList<Component>() ;

    public List<Component> getComponentList() {
        return componentList;
    }

    public void addRam(String s) {
        if(s.equalsIgnoreCase("ramType1")) {
            componentList.add(new Ram("DDR4",2620,8,2666));
        }
        else if(s.equalsIgnoreCase("ramType2")) {
            componentList.add(new Ram("DDR4",2950,8,3200)) ;
        }
    }
    public void addGraphics(String s){
        if(s.equalsIgnoreCase("gpuType1")) {
            componentList.add(new GraphicsCard("GPU",6500,2));
        }
        else if(s.equalsIgnoreCase("gpuType2")) {
            componentList.add(new GraphicsCard("GPU",7600,4)) ;
        }
    }

    public PersonalComputer build() {
        addProcessor();
        List<Component>c = new ArrayList<Component>(componentList) ;
        componentList.clear();
        return new PersonalComputer(c) ;
    }


    public abstract void addProcessor() ;
    public abstract void addCooler() ;
    public abstract void addDvdDrive() ;
}
