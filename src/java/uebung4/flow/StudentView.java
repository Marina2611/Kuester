package uebung4.flow;

import javax.swing.*;
import java.awt.*;


public class StudentView extends ANameSemesterView {


	public StudentView(StudentModel smodel)
	{
		super(smodel);
		this.viewFrame.setTitle("Student View");
		this.viewFrame.setLocation(0,0);
	}

}