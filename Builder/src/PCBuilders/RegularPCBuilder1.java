package PCBuilders;

import Component.Cooler;
import Component.Processor;

public class RegularPCBuilder1 extends PCBuilder{
    @Override
    public void addProcessor() {
        componentList.add(new Processor("i5",20000));
        addCooler();
    }

    @Override
    public void addCooler() {
        componentList.add(new Cooler("CPU Cooler",36000)) ;
    }

    @Override
    public void addDvdDrive() {
        return ;
    }
}
