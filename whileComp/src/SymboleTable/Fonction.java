package SymboleTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * 
 * Fonction contient les meta donnees d'une fonction --> nb d'entrees, de sorties, 
 * l'@ code cible, et une liste de variables
 */
public class Fonction {
	private String m_name;

	private int m_nbIn;
	private int m_nbOut;
	private String m_adressCode;
	private ArrayList<Variable> m_varList;
	
	//Code 3@
	private HashMap<String, String> m_readVarList;
	private ArrayList<String> m_writeVarList;
	private ArrayList<Quadruplet> m_quadList;
	
	private String VAR_INPUT = "input";
	
	public Fonction(String name, int nbIn, int nbOut, String adressCode) {
		super();
		this.m_name = name;
		this.m_nbIn = nbIn;
		this.m_nbOut = nbOut;
		this.m_adressCode = adressCode;
		this.m_varList = new ArrayList<Variable>();
		this.m_quadList = new ArrayList<Quadruplet>();
		this.m_readVarList = new HashMap<String, String>();
		this.m_writeVarList = new ArrayList<String>();
	}

	public String getM_name() {
		return m_name;
	}
	
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public List<String> getListVarName(){
		List<String> res = new ArrayList<String>();
		for(Variable v:this.m_varList){
			res.add(v.getM_name());
		}
		return res;
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
	
	public boolean egal(Fonction f){
		return (this.m_nbIn == f.getM_nbIn() && this.m_nbOut == f.getM_nbOut() && this.m_name.equals(f.getM_name()));
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
			retour.add(val.getM_name());
		}
		return retour;
	}

	public ArrayList<Quadruplet> getM_quadList() {
		return m_quadList;
	}

	public void setM_quadList(ArrayList<Quadruplet> m_quadList) {
		this.m_quadList = m_quadList;
	}
	
	public void addQuad(Quadruplet q) {
		m_quadList.add(q);
	}
	
	//Méthodes pour les Read Var
	public boolean isReadVar(String var) {
		return m_readVarList.containsKey(var);
	}
	
	public void addReadVar(String whileVar, String cppVar) {
		m_readVarList.put(whileVar, cppVar);
	}
	
	public String getReadVar(String whileVar) {
		return m_readVarList.get(whileVar);
	}
	
	//Méthodes pour les Write Var
	public void addWriteVar(String whileVar) {
		m_writeVarList.add(whileVar);
	}
	
	public String getWriteVar(int index) {
		return m_writeVarList.get(index);
	}
	
	public HashMap<String, String> getReadVarList()
	{
		return m_readVarList;
	}
	
	public ArrayList<String> getWriteVarList()
	{
		return m_writeVarList;
	}
}
