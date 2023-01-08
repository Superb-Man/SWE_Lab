import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        ConcreteExamController examController = new ConcreteExamController() ;
        Teacher teacher = new Teacher(examController,1,"Tanvir Saad") ;
        List<Student>students = new ArrayList<>() ;
        String names[] = {"Lara Khan","Jarif Ahsan","Toriqe","Auntor Muhtasim","Rashid Mayesha"} ;
        for(int i = 0 ; i < 5 ; i++) {
            students.add(new Student(examController,i+1,names[i])) ;
        }
        examController.setTeacher(teacher) ;
        for(int i = 0 ; i< 5 ; i++) {
            examController.setStudent(students.get(i));
            teacher.send();
        }
        Scanner scanner = new Scanner(System.in) ;
        while(true) {
            System.out.println("Do you want to re-examine ? Enter your ID :");
            int x = scanner.nextInt() ;
            String str = scanner.nextLine() ;
            Student s = students.get(x-1) ;
            examController.setStudent(s) ;
            s.send();
            teacher.send();
        }
    }
}
