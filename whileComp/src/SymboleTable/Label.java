package SymboleTable;

import java.util.List;
import java.util.ArrayList;

public class Label {
	private String name;
	private List<Quadruplet> code;

	public Label(String name) {
		this.name = name;
		this.code = new ArrayList<Quadruplet>();
	}

	public void add(Quadruplet instruction) {
		this.code.add(instruction);
	}
}
