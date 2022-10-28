package com.example.csvadapter;
import java.util.Vector;


public class CSVLeserAdapter implements IPersonenLeser {
	private String file;
	
	public CSVLeserAdapter(String file)
	{
		this.file = file;
	}
	
	@Override
	public Vector<Person> lesePersonen() {
		
		return new Vector<Person>();
		
	}

}
