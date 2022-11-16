package uebung3.adapter.solution;

import com.example.csvadapter.IPersonenLeser;
import com.example.csvadapter.Person;

public class Main {
    public static void main(String[] args) {
        IPersonenLeser leser = new CSVLeserAdapterImpl("src/resources/com/example/csvadapter/person.csv");
        leser.lesePersonen().forEach(Person::print);
    }
}
