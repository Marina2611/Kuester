package uebung3.mareina;

import uebung3.CSVLeser;
import uebung3.IPersonenLeser;
import uebung3.Person;

import java.util.Vector;


public class CSVLeserAdapter implements IPersonenLeser {
    private String file;

    public CSVLeserAdapter(String file2) {
        file = file2;
    }


    @Override
    public Vector<Person> lesePersonen() {
        Vector<Person> vector = new Vector<>();
        CSVLeser csvLeser = new CSVLeser();
        Vector<String[]> personenDatei = csvLeser.lesePersonenDatei(file);
        for (String[] strings : personenDatei) {
            String eintrag1 = strings[0];
            String eintrag2 = strings[1];
            Person person = new Person(eintrag1, eintrag2);
            vector.add(person);
        }
        return vector;

    }

}
