package SymboleTable;

import java.util.ArrayList;

public class Fonction {
	private int m_nbIn;
	private int m_nbOut;
	private String m_adressCode;
	private ArrayList<Variable> m_varList;
	
	public Fonction(int nbIn, int nbOut, String adressCode) {
		super();
		this.m_nbIn = nbIn;
		this.m_nbOut = nbOut;
		this.m_adressCode = adressCode;
		this.m_varList = new ArrayList<Variable>();
	}

	public void add(Variable var) {
		m_varList.add(var);
	}
	public void remove(int index) {
		this.m_varList.remove(index);
	}
	public boolean contains(Variable v){
		return this.m_varList.contains(v);
	}
	public Variable getVar(int index){
		return this.m_varList.get(index);
	}
	public void setVar(int index, Variable v){
		this.m_varList.set(index, v);
	}

	public int getM_nbIn() {
		return m_nbIn;
	}

	public void setM_nbIn(int m_nbIn) {
		this.m_nbIn = m_nbIn;
	}

	public int getM_nbOut() {
		return m_nbOut;
	}

	public void setM_nbOut(int m_nbOut) {
		this.m_nbOut = m_nbOut;
	}

	public String getM_adressCode() {
		return m_adressCode;
	}

	public void setM_adressCode(String m_adressCode) {
		this.m_adressCode = m_adressCode;
	}

	public boolean isPresent(Variable x){
		return this.m_varList.contains(x);
	}
	
}
