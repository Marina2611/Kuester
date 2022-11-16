package uebung4.laura;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class IncreaseView implements ActionListener{
	private StudentController controller;



	JFrame controlFrame;
	JPanel controlPanel;
	JButton increaseButton;


	public IncreaseView(StudentController scontroller)
	{
		controller = scontroller;
		createControlElements();
	}
	

	public void createControlElements()
	{
		controlPanel = new JPanel(new GridLayout(1,2));
		increaseButton = new JButton("Increase");
		increaseButton.addActionListener(this);
		controlPanel.add(increaseButton);
		controlFrame = new JFrame("Control Panel");
		controlFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		controlFrame.getContentPane().add(controlPanel,BorderLayout.CENTER);
		controlFrame.pack();
		controlFrame.setVisible(true);
		controlFrame.setLocation(200,0);
	}
	
	/**
	 * Diese Methode wird vom Model aufgerufen,
	 * wenn sich das Model ver�ndert hat.
	 * 
	 */


	@Override
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == increaseButton)
		{
			controller.increase();
		}
		
	}
}