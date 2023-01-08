package Context;

import States.*;

public class VendingMachine {
    private State state ;
    private int itemCount = 3 ;
    private int itemPrice = 50 ;

    public VendingMachine() {
        this.state = new IdleState(this) ;
    }

    public void setState(State state) {
        this.state = state ;
        //state.setVm(this) ;
    }

    public int getItemCount() {
        return itemCount;
    }
    public void setItemCount(int cnt) {
        itemCount = cnt ;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void run() {
        state.choose();
        state.insert();
        state.sold(0);
        state.refill();
    }

    public void choose() {
        state.choose() ;
    }

    public void insert() {
        state.insert() ;
    }

    public void sold(int coin) {
        state.sold(coin) ;
    }

    public void refill() {
        state = new RefillState(this) ;
        state.refill() ;
    }
}
