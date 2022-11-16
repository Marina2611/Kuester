package uebung3.adapter.nina;

import uebung3.adapter.CSVLeser;
import uebung3.adapter.IPersonenLeser;
import uebung3.adapter.Person;

import java.util.Vector;

public class CSVLeserAdapter implements IPersonenLeser {
    String file;

    public CSVLeserAdapter(String pFile) {
        file = pFile;
    }

    @Override
    public Vector<Person> lesePersonen() {
        CSVLeser csvLeser = new CSVLeser();
        Vector <String[]> personenDatei = csvLeser.lesePersonenDatei(file);

        return new Vector<>();
    }
}
