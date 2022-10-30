package uebung3.solution;
import com.example.csvadapter.*;

import java.util.Vector;
import java.util.stream.Collectors;

public class CSVLeserAdapterImpl extends CSVLeserAdapter {
    private final CSVLeser csvLeser;

    public CSVLeserAdapterImpl(String file) {
        super(file);
        csvLeser = new CSVLeser();
    }

    @Override
    public Vector<Person> lesePersonen() {
        return csvLeser.lesePersonenDatei(file)
                .stream()
                .map(arr -> new Person(arr[0], arr[1]))
                .collect(Collectors.toCollection(Vector::new));
    }
}
