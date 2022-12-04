import PCBuilders.*;
import Product.PersonalComputer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Order{
    private List<PersonalComputer>orderList = new ArrayList<>() ;
    public void add(PersonalComputer pc) {
        orderList.add(pc) ;
    }
    public List<PersonalComputer> getPcList() {
        return orderList ;
    }

    public void printOrder() {
        int x = 0 ;
        for(PersonalComputer pc : orderList) {
            x++ ;
            System.out.println("#Personal Computer "+x);
            pc.printInfo();
        }
    }

}

public class Main {
    public static void main(String []args) {

        Scanner scanner = new Scanner(System.in);

        Director director = new Director();
        PCBuilder ryzenBuilder = new GamingPcBuilder();
        PCBuilder rg1Builder = new RegularPCBuilder1();
        PCBuilder rg2Builder = new RegularPCBuilder2();
        PCBuilder rg3Builder = new RegularPCBuilder3();

        int cnt  = 0 ;

        while(true) {
            cnt++ ;
            Order order = new Order() ;

            System.out.println("Welcome To TechLand PC" + '\n'
                    + "Press O to create an order");
            String msg = "You have to Complete an order\n";
            while (true) {
                String enter = scanner.nextLine();
                if (enter.equalsIgnoreCase("O")) {
                    System.out.println("Order #"+cnt+" created") ;
                    break;
                }
            }

            while (true) {
                String pcType;

                while (true) {
                    System.out.println("Select a PC type \nGaming PC" + '\n' +
                            "Regular PC with i5 Processor\n" +
                            "Regular PC with i7 Processor\n" +
                            "Regular PC with i9 Processor");
                    pcType = scanner.nextLine();
                    if (pcType.equalsIgnoreCase("Gaming PC")) {
                        director.setPcBuilder(ryzenBuilder);
                        break;
                    } else if (pcType.equalsIgnoreCase("i5 PC")) {
                        director.setPcBuilder(rg1Builder);
                        break;
                    } else if (pcType.equalsIgnoreCase("i7 PC")) {
                        director.setPcBuilder(rg2Builder);
                        break;
                    } else if (pcType.equalsIgnoreCase("i9 PC")) {
                        director.setPcBuilder(rg3Builder);
                        break;
                    } else {
                        System.out.println("Enter Exact PC Type\n\n");
                    }
                }
                while (true) {
                    while (true) {
                        System.out.print("\nAdd DDR4 8GB Ram\nEnter No Ram to not select Ram\n## 2666 MHz\n##3200 MHz\nEnter RamType : ");
                        String ramType = scanner.nextLine();
                        if (ramType.equalsIgnoreCase("ramType1") || ramType.equalsIgnoreCase("ramType2")) {
                            director.createRamOrder(ramType);
                            break;
                        } else if (ramType.equalsIgnoreCase("No Ram")) break;
                        else System.out.println("Enter Exact Ram Type\n");
                    }
                    while (true) {
                        System.out.print("\nAdd NVIDIA GPU\nEnter No GPU to not select GPU\n## 2GB MHz\n##4 GB \nEnter GPU type : ");
                        String gpuType = scanner.nextLine();
                        if (gpuType.equalsIgnoreCase("gpuType1") || gpuType.equalsIgnoreCase("gpuType2")) {
                            director.createGPUOrder(gpuType);
                            break;
                        } else if (gpuType.equalsIgnoreCase("No GPU")) {
                            break;
                        } else System.out.println("Enter Exact Gpu Memory\n");
                    }
                    System.out.println("Press 1 to include ram or gpu\nPress 2 to finalize !!");
                    int press;
                    while (true) {
                        press = scanner.nextInt();
                        if (press == 2) {
                            PersonalComputer pc = director.createPC();
                            order.add(pc);
                            //order.printOrder();
                            press = -1;
                            break;
                        } else if (press == 1) {
                            break;
                        } else System.out.println("Press 1 or 2\n");
                    }
                    if (press == -1) break;
                }
                scanner.nextLine() ;
                System.out.println("Press A to Build another PC\nPress E to Close and print Order");
                String pres = scanner.nextLine();
                if (pres.equalsIgnoreCase("E")) {
                    order.printOrder() ;
                    System.out.println("\n #"+cnt+" Done") ;
                    break;
                } else if (pres.equalsIgnoreCase("A")) {
                    //
                }
            }
        }

    }
}
