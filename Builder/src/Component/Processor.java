package Component;

public class Processor extends Component {
    public Processor(String name , int price) {
        this.name = name ;
        this.price = price ;
    }
    @Override
    public String getName() {
        return name+" Processor " ;
    }
}


