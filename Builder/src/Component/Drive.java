package Component;

public class Drive extends Component{
    public Drive(String name , int price) {
        this.name = name ;
        this.price = price ;
    }

    @Override
    public String getName() {
        return name ;
    }
}
