package PCBuilders;

import Component.Cooler;
import Component.Drive;
import Component.Processor;

public class RegularPCBuilder2 extends PCBuilder{
    @Override
    public void addProcessor() {
        componentList.add(new Processor("i7", 37000));
        addCooler();
    }

    @Override
    public void addCooler() {
        componentList.add(new Cooler("Liquid Cooler",17000)) ;
    }

    @Override
    public void addDvdDrive() {
        return ;
    }
}
