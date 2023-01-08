package Subject;

import Observers.State;
import Observers.User;

import java.util.List;


abstract public class Server {
    protected State prev = null ;
    protected State cur = null ;
    protected List<User> userList = null ;
    protected List<User>regularDEFuser = null ;
    public void register(User user) {
        System.out.println(user.getName()+" Registerd to Server");
        userList.add(user) ;
    }
    public void remove(User user){
        userList.remove(user) ;
    }
    public void update(User user) {
        //
    }
    public boolean find(User user) {
        return false ;
    }
    public void setState(int stat) {
        prev = cur ;
        if(stat == 1) {
            cur = State.PARTIALLY_DOWN ;
        }
        else if(stat == 2){
            cur = State.FULLY_DOWN ;
        }
        else if(stat == 0) {
            cur = State.OPERATIONAL ;
        }
    }
    //

    abstract public void notifyAllUsers() ;

}
