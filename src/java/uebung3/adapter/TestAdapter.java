package uebung3.adapter;

import uebung3.adapter.mareina.CSVLeserAdapter;

import java.util.Vector;

/***
 * 
 * Tester f�r die AdapterL�sung
 * 
 *
 */

public class TestAdapter {

	public static void main (String[] args)
	{
		IPersonenLeser leser = new CSVLeserAdapter("src/resources/com/example/csvadapter/person.csv");
		Vector<Person> personen = leser.lesePersonen();
		
		for (Person person : personen)
		{
			person.print();
		}
	}
}
