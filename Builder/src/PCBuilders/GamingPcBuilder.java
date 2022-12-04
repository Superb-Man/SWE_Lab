package PCBuilders;

import Component.Cooler;
import Component.Processor;

public class GamingPcBuilder extends PCBuilder {
    @Override
    public void addProcessor() {
        componentList.add(new Processor("AMD Ryzen 5700 X",28000)) ;
    }

    @Override
    public void addCooler() {
        return ;
    }

    @Override
    public void addDvdDrive() {
        return ;
    }
}
