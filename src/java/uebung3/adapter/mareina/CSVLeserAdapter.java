package uebung3.adapter.mareina;


import uebung3.adapter.CSVLeser;
import uebung3.adapter.IPersonenLeser;
import uebung3.adapter.Person;

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
        CSVLeser csvLeser = new CSVLeser();
        Vector<String[]> personenDatei = csvLeser.lesePersonenDatei(file);
        for (String[] strings :  csvLeser.lesePersonenDatei(file)) {
            String nachname = strings[0];
            String vorname = strings[1];
            Person person = new Person(nachname, vorname);
            vector.add(person);
        }
        return vector;
    }

}

// Association, Aggregation

