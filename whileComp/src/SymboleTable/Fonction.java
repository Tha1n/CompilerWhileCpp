package SymboleTable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Fonction contient les meta donnees d'une fonction --> nb d'entrees, de sorties, 
//l'@ code cible, et une liste de variables

public class Fonction {
	private int m_nbIn;
	private int m_nbOut;
	private String m_adressCode;
	private ArrayList<Variable> m_varList;
	
	//adresse donnée à la variable
	private String VAR_INTERN = "intern";
	private String VAR_INPUT = "input";
	
	public Fonction(int nbIn, int nbOut, String adressCode) {
		super();
		this.m_nbIn = nbIn;
		this.m_nbOut = nbOut;
		this.m_adressCode = adressCode;
		this.m_varList = new ArrayList<Variable>();
	}

	public void add(Variable var) {
		if (!isPresent(var)) m_varList.add(var);
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
		Iterator<Variable> it = this.m_varList.iterator();
		while(it.hasNext()){
			Variable var = it.next();
			if(var.getM_name().equals(x.getM_name()) && var.getM_dataAdress().equals(x.getM_dataAdress())){
				return true;
			}
			if(var.getM_name().equals(x.getM_name()) && var.getM_dataAdress().equals(VAR_INPUT)){
				return true;
			}
		}
		
		return false;
	}
	
	//rend l'index de la variable x dan la liste de variables présentes dans f, -1 si x n'est pas présente
	public int getIndex(Variable x){
		int res =0;
		Iterator<Variable> it = this.m_varList.iterator();
		while(it.hasNext()){
			Variable var = it.next();
			if(x.getM_name().equals(var.getM_name()) && x.getM_dataAdress().equals(var.getM_dataAdress())){
				return res;
			}
			res++;
		}
		return -1; //pas présente
	}
	
	public String toString(){
		String variables = "";
		Iterator<Variable> it = this.m_varList.iterator();
		while (it.hasNext()){
			Variable x = it.next();
			variables += "\t -> "+ x.getM_name() +"\n";
		}
		return variables;
		//attention les variables sont inclues parfois en double..
	}
	
	public Set<String> getVariables() {
		Set<String> retour = new HashSet<String>();
		for(Variable val : m_varList)
		{
			retour.add(val.toString());
		}
		return retour;
	}
}
