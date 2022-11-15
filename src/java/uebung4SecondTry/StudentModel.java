package uebung4SecondTry;


import java.util.ArrayList;
import java.util.Collection;

public class StudentModel implements IModel {
    private String name;
    private String number;
    private int semester = 0;

    private Collection<IView> view = new ArrayList<>();

    public StudentModel(String sname, String snumber, int ssemester) {
        name = sname;
        number = snumber;
        semester = ssemester;
    }

    public void increaseSemester() {
        semester++;
        benachrichtigen();

    }

    public void anmelden(IView view) {
        this.view.add(view);
    }

    @Override
    public void abmelden(IView view) {
        this.view.remove(view);

    }


    private void benachrichtigen() {
        for (IView view1 : view
        ) {
            view1.aktualisieren(this);

        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


    public String getSemester() {
        return semester + "";
    }


}