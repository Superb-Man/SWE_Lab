package Components;

abstract public class DriveTrainSystem {
    private String typeName ;
    public DriveTrainSystem(String typeName) {
        this.typeName = typeName ;
    }

    public String getTypeName() {
        return typeName;
    }
}
