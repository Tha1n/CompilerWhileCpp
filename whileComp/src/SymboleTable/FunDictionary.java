package SymboleTable;
import java.util.HashMap;
import java.util.Iterator;


public class FunDictionary {
	//nom de la fonction, ses données
	private HashMap <String, Fonction> dictionary;
	
	//la map fais le lien entre un nom de fonction et la Fonction elle meme
	
	//Fonction : nb entrées et sorties, adresse (nom en code cible), liste de variables

	public FunDictionary() {
		super();
		this.dictionary = new HashMap<String, Fonction>();
	}

	public HashMap<String, Fonction> getDictionary() {
		return dictionary;
	}

	public void setDictionary(HashMap<String, Fonction> dictionary) {
		this.dictionary = dictionary;
	}
	
	public void putFunction(String name, Fonction f){
		if (!isPresent(name)) {
			this.dictionary.put(name, f);
		}
		else{
			Fonction fbis = this.get(name);
			if (fbis.getM_nbIn() == f.getM_nbIn() && 
				fbis.getM_nbOut() == f.getM_nbOut() &&
				fbis.getM_adressCode() == f.getM_adressCode()){
				//error
			}
			else this.dictionary.put(name, f);
		}
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
	
	public boolean isPresent (Fonction f){
		return this.dictionary.containsValue(f);
	}
	
	public String toString(){
		String fonctions = "\n-------------------------------------\n"+
							 "        Table des symboles           \n";
		Iterator<String> it = this.dictionary.keySet().iterator(); 
		
		while (it.hasNext()){
			String name = it.next();
			Fonction f = this.dictionary.get(name);
			fonctions += " - " + name + " : " + f.getM_nbIn() + " inputs --> " + f.getM_nbOut() +" outputs\n" + f.toString() ;
		}
		fonctions += "\n-------------------------------------\n";
		return fonctions;
	}
	
	
	public void putVariable(Variable x, Fonction f){
		if(isPresent(f)){
			if(!f.isPresent(x)){
				f.add(x);
			}
			else{//error
			}
		}
		else{
			//error
		}
	}
	
}