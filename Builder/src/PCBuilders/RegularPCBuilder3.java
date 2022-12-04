package PCBuilders;

import Component.Drive;
import Component.Processor;

public class RegularPCBuilder3 extends PCBuilder {
    @Override
    public void addProcessor() {
        componentList.add(new Processor("i9",65000)) ;
        addDvdDrive();
    }

    @Override
    public void addCooler() {
        return ;
    }

    @Override
    public void addDvdDrive() {
        componentList.add(new Drive("DvD Drive",36000)) ;
    }
}
