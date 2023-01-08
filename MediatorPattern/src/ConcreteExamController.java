import java.util.Random;

public class ConcreteExamController extends ExamController {
    private Student student ;
    private Teacher teacher ;
    public void setStudent(Student student) {
        this.student = student ;
    }
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher ;
    }

    @Override
    public void send(Candidate candidate, int x) {
        if(candidate == student) {
            String msg = null ;
            msg = "Student ID : "+ x + "["+student.getName()+ "] has requested to re-examine" ;
            System.out.println(msg+"\n\n") ;
            msg+=" and It has reached to Teacher ID : "+teacher.getTeacherID() +" ["+teacher.getName()+"]" ;
            teacher.notify(msg);
        }

        else if(candidate == teacher) {
            Random random = new Random() ;
            int y = random.nextInt(100);
            if(x%2 != y%2) {
                System.out.println("previously got : "+ x+ " marks ");
                System.out.println("Marks Corrected for Student " + student.getStudentID()+" in Controller office teacher id : " +teacher.getTeacherID()+ " ["+teacher.getName()+"]");
                x = y;
            }
            String msg = null ;
            msg = "Student " +student.getStudentID() + "["+student.getName() +"] has got "+x+" marks\n\n" ;
            student.setAssignedMarks(x);
            student.notify(msg) ;
        }
    }
}
