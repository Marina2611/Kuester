package uebung3.mareina;

import uebung3.CSVLeser;
import uebung3.IPersonenLeser;
import uebung3.Person;

import java.util.Vector;


public class CSVLeserAdapter implements IPersonenLeser {
    private final String file;

    /**
     * Datei wird dem Konstruktor übergeben und gespeichert.
     *
     * @param file Dateipfad
     */
    public CSVLeserAdapter(String file) {
        this.file = file;
    }

    @Override
    public Vector<Person> lesePersonen() {
        Vector<Person> vector = new Vector<>();
        for (String[] strings :  new CSVLeser().lesePersonenDatei(file)) {
            String nachname = strings[0];
            String vorname = strings[1];
            Person person = new Person(nachname, vorname);
            vector.add(person);
        }
        return vector;
    }

}
