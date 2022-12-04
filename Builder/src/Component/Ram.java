package Component;

public class Ram extends Component{
    private int memorySize ;
    private int frequency ;
    public Ram(String name , int price, int memorySize, int frequency) {
        this.name = name ;
        this.price  = price ;
        this.memorySize = memorySize ;
        this.frequency = frequency ;
    }

    public int getMemorySize() {
        return memorySize ;
    }
    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize ;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getFrequency() {
        return frequency;
    }


    @Override
    public String getName() {
        return name + " " + memorySize +" GB " +frequency + " MHz" ;
    }
}
