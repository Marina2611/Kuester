package uebung3.nina;

import uebung3.CSVLeser;
import uebung3.IPersonenLeser;
import uebung3.Person;

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
