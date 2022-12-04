package Component;

public abstract class Component {
    protected String name ;
    protected int price ;
    abstract public String getName() ;
    public int getPrice() {
        return price ;
    }

}
