package Product;

import Component.Component;
import Component.Processor ;
import PCBuilders.PCBuilder;

import java.util.List;

public class PersonalComputer {
    private int basePrice ;
    private int additionalPrice ;
    private List<Component> componentList = null ;

    public PersonalComputer(List<Component>componentList) {
        basePrice = 70000 ;
        this.componentList = componentList ;
    }

    /*public void addComponent(Component component) {
        componentList.add(component) ;
    }*/

    public int getCost() {
        int totalPrice = 0 ;
        for(var li : componentList) {
            totalPrice+=li.getPrice() ;
        }

        return totalPrice ;
    }

    public void printInfo() {
        int p = basePrice ;
        System.out.println("\n## Base Part \n1 TB HDD and MotherBoard<-------->Price : 70000 Tk\n") ;
        System.out.println("\n## Added Part >>> ");
        for(Component c : componentList) {
            p+=c.getPrice() ;
            System.out.println(c.getName() + "<--------->" +"Price : "+c.getPrice()+" Tk \n");
        }
        System.out.println("\nTotal Cost is  : " + p) ;
        /*if(p > basePrice ) {
            System.out.println("You have added additional part !!");
        }*/


    }

    /*public void getInfo() {
        for(var li : componentList) {

        }
    }*/


}
