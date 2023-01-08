import java.util.Random;

public class Teacher extends Candidate {
    private int teacherID ;
    private int primaryMarks ;
    public Teacher(ExamController examController, int teacherID,String name) {
        super(examController) ;
        this.teacherID = teacherID ;
        this.name = name ;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setPrimaryMarks(int primaryMarks) {
        this.primaryMarks = primaryMarks;
    }

    public int getPrimaryMarks() {
        return primaryMarks;
    }

    @Override
    public void send() {
        //Random Number Generator
        Random random = new Random() ;
        int x = random.nextInt(100) ;

        examController.send(this , x);
    }

    @Override
    public void notify(String msg) {
        System.out.println(msg) ;
    }
}
