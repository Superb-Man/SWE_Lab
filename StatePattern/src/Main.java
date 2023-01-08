import Context.VendingMachine;
import States.*;

public class Main {
    public static void main(String []args) {
        VendingMachine vm = new VendingMachine() ;
        //State state = new IdleState(vm) ;
        while(true) {
            vm.run() ;
//            if(vm.getItemCount() == 0) {
//                vm.refill();
//            }
        }
    }
}
