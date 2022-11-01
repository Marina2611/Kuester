package uebung3.laura;

import uebung3.CSVLeser;
import uebung3.IPersonenLeser;
import uebung3.Person;

import java.util.Vector;


public class CSVLeserAdapter implements IPersonenLeser {
    protected String file;

    public CSVLeserAdapter(String file) {
        this.file = file;
    }

    @Override
    public Vector<Person> lesePersonen() {
        CSVLeser csvLeser = new CSVLeser();
        Vector<String[]> vector = csvLeser.lesePersonenDatei(file);
        Vector<Person> people = new Vector<>();
        for (String[] arr : vector) {
            people.add(new Person(arr[0], arr[1]));
        }
        return people;
    }

}
