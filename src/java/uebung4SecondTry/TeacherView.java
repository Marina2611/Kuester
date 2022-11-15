package uebung4SecondTry;

import javax.swing.*;
import java.awt.*;


public class TeacherView implements IView{
	private StudentModel model;

	JFrame viewFrame;
	JPanel viewPanel;
	JLabel semesterLabel;
	JLabel studentLabel;
	JLabel numberLabel;




	public TeacherView(StudentModel smodel)
	{
		model = smodel;
		model.anmelden(this);
		createElements();
	}
	
	public void createElements()
	{
		viewPanel = new JPanel(new GridLayout(1,3));
		studentLabel = new JLabel(model.getName());
		semesterLabel = new JLabel(model.getSemester());
		numberLabel = new JLabel(model.getNumber());
		viewPanel.add(numberLabel);
		viewPanel.add(new JLabel(""));
		viewPanel.add(studentLabel);
		viewPanel.add(semesterLabel);
		viewFrame = new JFrame("Teacher View");
		viewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		viewFrame.getContentPane().add(viewPanel,BorderLayout.CENTER);
		viewFrame.pack();
		viewFrame.setVisible(true);
		viewFrame.setLocation(0,100);
	}

	/**
	 * Diese Methode wird vom Model aufgerufen,
	 * wenn sich das Model ver�ndert hat.
	 * 
	 */
	public void aktualisieren(IModel model)
	{

		String semester = model.getSemester();
		semesterLabel.setText(semester);
		
	}

	}