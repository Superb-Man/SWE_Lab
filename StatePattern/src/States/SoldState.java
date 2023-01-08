package States;

import Context.VendingMachine;

public class SoldState extends State {
    private int givenCoin ;
    public SoldState(VendingMachine vm , int coin) {
        this.vm = vm ;
        givenCoin = coin ;
    }
    public void choose() {
        //do nothing
    }

    public void insert() {
        //
    }
    public void refill() {
        //do nothing
    }

    public void sold(int coin) {
        System.out.println("Thanks For Using me! Here's your chocolate <~>") ;
        System.out.println("You will get "+ (coin - vm.getItemPrice())  +" from the machine") ;
        int item = vm.getItemCount()  - 1;
        if(item <=0) item = 0 ;

        vm.setItemCount(item);

        vm.setState(new IdleState(vm)) ;
        vm.choose() ;
    }

}
