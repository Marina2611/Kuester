package uebung4SecondTry;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class StudentView implements IView{
	private StudentModel model;
	
	JFrame viewFrame;
	JPanel viewPanel;
	JLabel semesterLabel;
	JLabel studentLabel;
	


	
	public StudentView(StudentModel smodel)
	{
		model = smodel;
		model.anmelden(this);
		createElements();
	}
	
	public void createElements()
	{
		viewPanel = new JPanel(new GridLayout(1,2));
		studentLabel = new JLabel(model.getName());
		semesterLabel = new JLabel(model.getSemester());
		viewPanel.add(studentLabel);
		viewPanel.add(semesterLabel);
		viewFrame = new JFrame("Student View");
		viewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		viewFrame.getContentPane().add(viewPanel,BorderLayout.CENTER);
		viewFrame.pack();
		viewFrame.setVisible(true);
		
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