import PCBuilders.PCBuilder;
import Product.PersonalComputer;

public class Director {
    private PCBuilder pcBuilder ;

    public Director() {
        pcBuilder = null ;
    }

    public void setPcBuilder(PCBuilder pcBuilder) {
        this.pcBuilder = pcBuilder ;
    }

    public void createRamOrder(String ram) {
        if (ram != null) {
            pcBuilder.addRam(ram);
        }
    }
    public void createGPUOrder(String gpu){
        if(gpu !=null) {
            pcBuilder.addGraphics(gpu) ;
        }
    }
    public PersonalComputer createPC(){
        return pcBuilder.build();
    }
}
