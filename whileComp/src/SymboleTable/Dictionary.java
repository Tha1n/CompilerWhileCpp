package SymboleTable;
import java.util.HashMap;


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
		this.dictionary.put(name, f);
	}
	
	public void remove (String name){
		this.dictionary.remove(name);
	}
	
	public void replace(String name, Fonction newFunc){
		this.dictionary.replace(name, newFunc);
	}
}
