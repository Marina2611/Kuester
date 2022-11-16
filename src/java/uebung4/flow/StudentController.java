package uebung4.flow;

public class StudentController {
    private final StudentModel model;

    public StudentController(StudentModel smodel) {
        model = smodel;
    }

    /**
     * Der Button wurde gedr�ckt und ver�ndert.
     */
    public void increase() {
        model.increaseSemester();
    }

    public void saveStudentNumber(int text) {
        model.setNumber(text);
    }
}