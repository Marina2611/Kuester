package uebung4.flow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class IncreaseView {
    private final StudentController controller;


    public IncreaseView(StudentController scontroller) {
        controller = scontroller;
        createControlElements();
    }


    public void createControlElements() {
        var increaseButton = new JButton("Increase");
        increaseButton.addActionListener(e -> controller.increase());
        JFrame controlFrame = new JFrame("Control Panel");
        controlFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        controlFrame.getContentPane().add(increaseButton, BorderLayout.CENTER);
        controlFrame.pack();
        controlFrame.setVisible(true);
        controlFrame.setLocation(200, 0);
    }
}