package Subject;

import Observers.RegularUser;
import Observers.State;
import Observers.User;

import java.util.ArrayList;
import java.util.List;

public class ABcServer extends Server{
    public ABcServer() {
        userList = new ArrayList<>() ;
        regularDEFuser = new ArrayList<>() ;
        cur = State.OPERATIONAL ;
    }

    public void update(User user) {
        System.out.println(user.getName()+" Added for 1 hour");
        regularDEFuser.add(user) ;
    }

    public boolean find(User user) {
        for(User user1 : regularDEFuser) {
            if(user == user1) {
                regularDEFuser.remove(user) ;
                return true ;
            }
        }
        return false ;
    }

    @Override
    public void notifyAllUsers() {
        for(User user : userList) {
            user.notify(prev,cur);
        }

    }
}
