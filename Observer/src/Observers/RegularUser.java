package Observers;

import Subject.Server;
import Subject.ABcServer ;

import java.util.Scanner;

public class RegularUser extends User{
    //private int id ;
    public RegularUser(int id, String name, Server server) {
        this.name = name ;
        this.id = id ;
        this.server = server ;
        server.register(this);
    }
    @Override
    public void notify(State prev , State cur ) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("You are a regular user of ABC Server");
        //System.out.println(str) ;
        //chk using states
        String str ;
        if(prev == null && cur == State.OPERATIONAL) {
            System.out.println(name+" ,You are a regular user of ABC Server");
        }

        else if(prev == State.OPERATIONAL && cur == State.PARTIALLY_DOWN) {
            System.out.println("####For Regular User#####");
            System.out.println("1. Do you want to Limited Funtionality?\n2. Pay $20 to upgrade to 1 hour premium");
            System.out.println("OPtion <1>");
            System.out.println("Option <2>");

            System.out.println("choice(1/2): ");
            int input1 = scanner.nextInt();
            String input2 = scanner.nextLine();
            if(input1 == 2) {
                server.update(this);
                System.out.println("ABC & DEF server Running\nYou are Using the premium DEF server Service for One hour\n");
            }
            else {
                System.out.println("ABC Server running Partially\n");
            }
        }

        else if(prev == State.OPERATIONAL && cur == State.FULLY_DOWN) {
            System.out.println("####For Regular User#####");
            System.out.println("1. Pay $20 to upgrade to 1 hour premium");
            System.out.println("<1---YES>");
            System.out.println("<2---NO>");

            System.out.println("choice(1/2): ");
            int input1 = scanner.nextInt();
            String input2 = scanner.nextLine();

            if(input1 == 1) {
                System.out.println("Only DEF server Running\nYou are Using the premium DEF server Service for One hour\n");
                server.update(this);
            }
            else {
                System.out.println("ABC Server Not running\n");
            }
        }
        else if(prev == State.FULLY_DOWN && cur == State.OPERATIONAL) {
            if(server.find(this)) {
                System.out.println("####For Regular User#####");
                System.out.println("Pay 200 Tk for So far\n");
            }
        }

        else if(prev == State.PARTIALLY_DOWN && cur == State.OPERATIONAL) {
            if(server.find(this)) {
                System.out.println("####For Regular User#####");
                System.out.println("Pay 200 Tk for So far\n");
            }
        }
        else if(prev == State.FULLY_DOWN && cur == State.PARTIALLY_DOWN) {
            System.out.println("####For Regular User#####");
            System.out.println("Server Died\n");
        }
        else if(prev == State.PARTIALLY_DOWN && cur == State.FULLY_DOWN) {

        }
    }
}
