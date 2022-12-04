package Components;

abstract public class Engine {
    private String typeName ;
    public Engine(String typeName) {
        this.typeName = typeName ;
    }

    public String getTypeName() {
        return typeName;
    }
}
