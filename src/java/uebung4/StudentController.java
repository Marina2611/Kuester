package uebung4;
public class StudentController {
	private StudentModel model;
	private StudentView view;
	
	public StudentController(StudentModel smodel)
	{
		model = smodel;
		
	}
	
	
	/**
	 * Der Button wurde gedr�ckt und ver�ndert.
	 * 
	 */
	public void increase() {
		
		model.increaseSemester();
		
		
	}
}