package Component;

public class Cooler extends Component {
    public Cooler(String name , int price) {
        this.name = name ;
        this.price = price ;
    }


    @Override
    public String getName() {
        return name ;
    }
}
