package Observers;

import Subject.Server;

import java.util.Scanner;

public class PremiumUser extends User {
    private int option ;
    public PremiumUser(int id,String name,Server server) {
        this.id = id ;
        this.name = name ;
        this.server = server ;
        server.register(this);
    }

    public void use(int option) {
        this.option = option ;
    }

    private int getOption() {
        return option;
    }

    @Override
    public void notify(State prev , State cur) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println(str) ;
        //chk using states
        String str ;
        if(prev == null && cur == State.OPERATIONAL) {
            System.out.println(name+" ,You are a premium user of ABC Server\n");
        }

        else if(prev == State.OPERATIONAL && cur == State.PARTIALLY_DOWN) {
            System.out.println("####For Premium User#####");
            System.out.println("1. Use Two Server Partially\n2. Use Only DEF Server\nEnter :");
            int input1 = scanner.nextInt();
            String input2 = scanner.nextLine();
            if(input1 == 1) {
                use(1);
                System.out.println("You are using Two server Partially\n");
            }
            else {
                use(2) ;
                System.out.println("You are using only DEF server\n");
            }
        }

        else if(prev == State.OPERATIONAL && cur == State.FULLY_DOWN) {
            System.out.println("####For Premium User#####");
            System.out.println("All Your Services are provided by DEF server");
        }
        else if(prev == State.FULLY_DOWN && cur == State.OPERATIONAL) {
            //-----
        }

        else if(prev == State.PARTIALLY_DOWN && cur == State.OPERATIONAL) {
            //-----
        }
        else if(prev == State.FULLY_DOWN && cur == State.PARTIALLY_DOWN) {
            System.out.println("####For Premium User#####");
            System.out.println("Server Died\n") ;
        }
        else if(prev == State.PARTIALLY_DOWN && cur == State.FULLY_DOWN) {
            if(option == 2) {
                System.out.println("####For Premium User#####");
                System.out.println("All of your services are shifted to DEF Server\n");
            }
            else {
                //do nothing
            }
        }
    }
}
