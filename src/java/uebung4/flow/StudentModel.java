package uebung4.flow;


import java.util.ArrayList;
import java.util.Collection;

public class StudentModel implements IModel {
    private String name;
    private int number;
    private int semester;

    private final Collection<IView> views = new ArrayList<>();

    public StudentModel(String sname, int snumber, int ssemester) {
        name = sname;
        number = snumber;
        semester = ssemester;
    }

    public void increaseSemester() {
        semester++;
        benachrichtigen();
    }

    public void anmelden(IView view) {
        this.views.add(view);
    }

    @Override
    public void abmelden(IView view) {
        this.views.remove(view);

    }


    private void benachrichtigen() {
        views.forEach(iView -> iView.aktualisieren(this));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public int getSemester() {
        return semester;
    }
}