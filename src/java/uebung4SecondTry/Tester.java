package uebung4SecondTry;
import java.util.Vector;


public class Tester {

	public static void main(String[] args)
	{
		StudentModel studentModel = new StudentModel("Meier", "432843", 3);
		StudentController studentController = new StudentController(studentModel);
		
		StudentView studentView = new StudentView(studentModel);
		IncreaseView increaseView = new IncreaseView(studentController);
		TeacherView teacherView = new TeacherView(studentModel);

		
		
	}
}
