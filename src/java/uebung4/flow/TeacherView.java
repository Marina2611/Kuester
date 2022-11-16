package uebung4.flow;

import javax.swing.*;
import java.awt.*;


public class TeacherView extends ANameSemesterView {


    private final JLabel numberLabel;

    public TeacherView(StudentModel smodel) {
        super(smodel);
        numberLabel = new JLabel(model.getNumber() + "");
        viewFrame.getContentPane().add(numberLabel,0);
        viewFrame.setTitle("Teacher View");
        viewFrame.setLocation(0, 100);
    }

    @Override
    public void aktualisieren(IModel model) {
        semesterLabel.setText(model.getSemester()+"");
        numberLabel.setText(model.getNumber()+"");
    }

}