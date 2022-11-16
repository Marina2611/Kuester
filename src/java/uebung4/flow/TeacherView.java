package uebung4.flow;

import javax.swing.*;
import java.awt.*;


public class TeacherView extends ANameSemesterView {


    public TeacherView(StudentModel smodel) {
        super(smodel);
        var numberLabel = new JLabel(model.getNumber() + "");
        viewFrame.getContentPane().add(numberLabel,0);
        viewFrame.setTitle("Teacher View");
        viewFrame.setLocation(0, 100);
    }

}