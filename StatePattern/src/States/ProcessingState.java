package States;

import Context.VendingMachine;

import java.util.Scanner;

public class ProcessingState extends State {
    private int cur = 0 ;
    public ProcessingState(VendingMachine vm) {
        this.vm = vm ;
    }
    public void choose() {
        //do nothing
    }

    public void insert() {
        Scanner scanner = new Scanner(System.in) ;
        String str ;
        int coin = 0 ;
        System.out.println("Pay " + vm.getItemPrice() + " money to buy the product");
        while(true) {
            coin = scanner.nextInt() ;
            str = scanner.nextLine() ;

            cur+= coin ;
            if (cur < vm.getItemPrice()) {
                showPrompt();
            } else {
                vm.setState(new SoldState(vm, cur));
                vm.sold(cur);
                cur = 0;
                break ;
            }
        }

    }
    public void refill() {
        //do nothing
    }

    public void sold(int coin) {
        //
    }

    private void showPrompt() {
        int x = vm.getItemPrice() - cur ;
        System.out.println("You still need to pay "+ x +" taka to buy it") ;
    }
}
