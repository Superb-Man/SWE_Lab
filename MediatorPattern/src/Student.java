public class Student extends Candidate {
    private int studentID ;
    private int assignedMarks ;
    public Student(ExamController examController, int studentID,String name) {
        super(examController) ;
        this.studentID = studentID ;
        this.name = name ;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setAssignedMarks(int assignedMarks) {
        this.assignedMarks = assignedMarks;
    }

    public int getAssignedMarks() {
        return assignedMarks;
    }

    @Override
    public void send() {
        //
        examController.send(this,studentID);
    }

    @Override
    public void notify(String msg) {
        System.out.println(msg);
    }
}
