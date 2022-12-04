package Component;

public class GraphicsCard extends Component {
    private int memorySize ;
    public GraphicsCard(String name , int price , int memorySize) {
        this.name = name ;
        this.price = price ;
        setMemorySize(memorySize);
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize ;
    }
    @Override
    public String getName() {
        return name + " "+ memorySize ;
    }
}
