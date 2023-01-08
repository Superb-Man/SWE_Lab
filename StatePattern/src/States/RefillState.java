package States;

import Context.VendingMachine;

import java.util.Scanner;

public class RefillState extends State {
    public RefillState(VendingMachine vm) {
        this.vm = vm ;
    }
    public void choose() {
        //
    }

    public void insert() {
        //do nothing
    }

    public void sold(int coin) {
        //do nothing
    }

    public void refill() {
        Scanner scanner = new Scanner(System.in) ;
        String str ;
        int cnt = 0 ;
        System.out.println("How many items do you need ? ");
        cnt = scanner.nextInt() ;
        str = scanner.nextLine() ;
        vm.setItemCount(cnt) ;
        vm.setState(new IdleState(vm));
        vm.choose();
    }




}
