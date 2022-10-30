package uebung3;

import uebung3.laura.CSVLeserAdapter;

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
