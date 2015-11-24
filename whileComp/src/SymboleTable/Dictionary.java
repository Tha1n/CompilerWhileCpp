package SymboleTable;
import java.util.HashMap;
import java.util.Iterator;


public class Dictionary {
	//nom de la fonction, ses données
	private HashMap <String, Fonction> dictionary;

	public Dictionary() {
		super();
		this.dictionary = new HashMap<String, Fonction>();
	}

	public HashMap<String, Fonction> getDictionary() {
		return dictionary;
	}

	public void setDictionary(HashMap<String, Fonction> dictionary) {
		this.dictionary = dictionary;
	}
	
	public void put(String name, Fonction f){
		if (isPresent(name)) this.dictionary.put(name, f);
	}
	
	public void remove (String name){
		this.dictionary.remove(name);
	}
	
	public void replace(String name, Fonction newFunc){
		this.dictionary.replace(name, newFunc);
	}
	
	public Fonction get(String name){
		return this.dictionary.get(name);
	}
	
	public boolean isPresent (String name){
		return (this.dictionary.get(name) != null);
	}
	
	public String toString(){
		String fonctions = "\n-------------------------------------\n"+
							 "        Table des symboles           \n";
		Iterator<String> it = this.dictionary.keySet().iterator(); 
		
		while (it.hasNext()){
			String name = it.next();
			fonctions += " - " + name + " : \n"  + this.dictionary.get(name).toString() + "\n";
		}
		return fonctions;
	}
	
}
