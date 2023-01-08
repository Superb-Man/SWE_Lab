abstract public class Candidate {
    protected String name ;
    public String getName() {
        return name ;
    }
    protected ExamController examController ;
    public Candidate(ExamController examController) {
        this.examController = examController ;
    }

    abstract public void send() ;
    abstract public void notify(String msg) ;
}
