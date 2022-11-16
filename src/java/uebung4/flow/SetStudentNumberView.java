package uebung4.flow;

import javax.swing.*;
import java.awt.*;


public class SetStudentNumberView implements IView{
    private final StudentController controller;
    private final StudentModel model;
    private JTextField textField;


    public SetStudentNumberView(StudentController scontroller, StudentModel model) {
        controller = scontroller;
        this.model = model;
        createControlElements();
    }


    public void createControlElements() {
        var saveButton = new JButton("Save");
        saveButton.addActionListener(e -> controller.saveStudentNumber(3));
        JFrame controlFrame = new JFrame("Control Panel");
        controlFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        textField = new JTextField(model.getNumber() + "");

        Container contentPane = controlFrame.getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.add(textField, BorderLayout.CENTER);
        contentPane.add(saveButton, BorderLayout.CENTER);
        controlFrame.pack();
        controlFrame.setVisible(true);
        controlFrame.setLocation(200, 100);
    }

    @Override
    public void aktualisieren(IModel model) {
        this.textField.setText(model.getNumber()+"");
    }
}