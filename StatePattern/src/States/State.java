package States;

import Context.VendingMachine;

abstract public class State {
    protected VendingMachine vm ;
    /*public void setVm(VendingMachine vm) {
        this.vm  = vm ;
    }*/
    abstract public void choose() ;
    abstract public void insert() ;
    abstract public void refill() ;
    abstract public void sold(int coin) ;
}
