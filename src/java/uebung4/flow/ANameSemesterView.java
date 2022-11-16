package uebung4.flow;

import javax.swing.*;
import java.awt.*;

public abstract class ANameSemesterView implements IView {
    protected StudentModel model;
    protected JFrame viewFrame;
    JLabel semesterLabel;

    protected ANameSemesterView(StudentModel smodel) {
        model = smodel;
        model.anmelden(this);
        createElements();
    }

    public void createElements() {
        var studentLabel = new JLabel(model.getName());
        semesterLabel = new JLabel(model.getSemester()+"");
        viewFrame = new JFrame();
        viewFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container contentPane = viewFrame.getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.add(studentLabel, BorderLayout.CENTER);
        contentPane.add(semesterLabel, BorderLayout.CENTER);
        viewFrame.pack();
        viewFrame.setVisible(true);

    }

    /**
     * Diese Methode wird vom Model aufgerufen,
     * wenn sich das Model ver�ndert hat.
     */
    public void aktualisieren(IModel model) {
        semesterLabel.setText(model.getSemester()+"");
    }
}
