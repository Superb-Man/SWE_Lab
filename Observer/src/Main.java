import Observers.PremiumUser;
import Observers.RegularUser;
import Observers.User;
import Subject.ABcServer;
import Subject.Server;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in) ;
        int stat = 0 ;
        String st ;
        Server abc = new ABcServer() ;
        User premium = new PremiumUser(1,"Fabiha",abc) ;
        User regular = new RegularUser(2,"Toriqe",abc) ;
        abc.notifyAllUsers();

        while (true) {
            stat = scanner.nextInt() ;
            st = scanner.nextLine() ;
            if(stat == -1) {
                return ;
            }
            abc.setState(stat) ;
            abc.notifyAllUsers();
        }



    }
}
