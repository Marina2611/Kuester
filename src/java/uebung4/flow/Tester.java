package uebung4.flow;


public class Tester {

    public static void main(String[] args) {
        StudentModel studentModel = new StudentModel("Meier", 432843, 3);
        StudentController studentController = new StudentController(studentModel);

        new StudentView(studentModel);
        new IncreaseView(studentController);
        new TeacherView(studentModel);
        new SetStudentNumberView(studentController, studentModel);
    }
}
