package SymboleTable;

import java.util.ArrayList;

public class Label {
	private String name;
	private ArrayList<Quadruplet> code;

	public Label(String name) {
		this.name = name;
		this.code = new ArrayList<Quadruplet>();
	}

	public void add(Quadruplet instruction) {
		this.code.add(instruction);
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public ArrayList<Quadruplet> getCode()
	{
		return this.code;
	}
}
