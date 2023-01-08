package States;

import Context.VendingMachine;

public class IdleState extends State {
    public IdleState(VendingMachine vm) {
        this.vm = vm ;
    }
    public void choose() {
        if(vm.getItemCount() > 0) {
            vm.setState(new ProcessingState(vm));
            vm.insert();
        }
        else if (vm.getItemCount() ==0 ){
            System.out.println("Out of Stock!! Machine e kono jinish nai");
            vm.setState(new RefillState(vm)) ;
        }
    }

    public void insert() {
        //do nothing
    }

    public void sold(int coin) {
        //do nothing
    }

    public void refill() {
        //do nothing
    }
}
