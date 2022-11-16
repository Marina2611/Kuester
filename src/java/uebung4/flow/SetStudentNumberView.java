package uebung4.flow;

import javax.swing.*;
import java.awt.*;


public class SetStudentNumberView implements IView {
    private final StudentController controller;
    private final StudentModel model;
    private JTextField textField;
    private JLabel errorLabel;
    private JFrame jFrame;


    public SetStudentNumberView(StudentController scontroller, StudentModel model) {
        controller = scontroller;
        this.model = model;
        model.anmelden(this);
        createControlElements();
    }


    public void createControlElements() {
        var saveButton = new JButton("Save");
        saveButton.addActionListener(e -> onClick());
        jFrame = new JFrame("Control Panel");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        textField = new JTextField(model.getNumber() + "");
        errorLabel = new JLabel();

        Container contentPane = jFrame.getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.add(textField, BorderLayout.CENTER);
        contentPane.add(errorLabel, BorderLayout.CENTER);
        contentPane.add(saveButton, BorderLayout.CENTER);

        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setLocation(200, 100);
    }

    private void onClick() {
        try {
            controller.saveStudentNumber(readIntFromTextField());
            errorLabel.setText("");
        } catch (NumberFormatException numberFormatException) {
            numberFormatException.printStackTrace();
            errorLabel.setText(numberFormatException.getLocalizedMessage());
        }
        jFrame.pack();
    }

    private int readIntFromTextField() {
        return Integer.parseInt(textField.getText());
    }

    @Override
    public void aktualisieren(IModel model) {
        this.textField.setText(model.getNumber() + "");
    }
}