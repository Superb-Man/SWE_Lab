package Observers;

import Subject.Server;

abstract public class User {
    protected Server server ;
    protected String name ;
    protected int id ;
    public String getName(){
        return name ;
    }
    abstract public void notify(State prev , State cur) ;
    public int getId() {
        return id;
    }
}
