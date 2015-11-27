package SymboleTable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class FunDictionary {
	//nom de la fonction, ses données
	private HashMap <String, Fonction> dictionary;
	
	//la map fais le lien entre un nom de fonction et la Fonction elle meme
	
	//Fonction : nb entrées et sorties, adresse (nom en code cible), liste de variables

	public FunDictionary() {
		super();
		this.dictionary = new HashMap<String, Fonction>();
	}
	
	public Set<String> getFunctions() {
		return this.dictionary.keySet();
	}

	public HashMap<String, Fonction> getDictionary() {
		return dictionary;
	}

	public void setDictionary(HashMap<String, Fonction> dictionary) {
		this.dictionary = dictionary;
	}
	
	public boolean putFunction(String name, Fonction f){
		if (!isPresent(name, f)) {
			this.dictionary.put(name, f);
		}
		else{
			Fonction fbis = this.get(name);
			if (fbis.getM_nbIn() == f.getM_nbIn() && 
				fbis.getM_nbOut() == f.getM_nbOut() &&
				fbis.getM_adressCode() == f.getM_adressCode()){
				this.dictionary.clear();
				return false;
			}
			else this.dictionary.put(name, f);
		}
		return true;
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
	
	public boolean isPresent (String name, Fonction f){
		Fonction fbis = this.dictionary.get(name);
		
		return fbis != null && fbis.egal(f);
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
	
	//remove une variable quand on sort du bloc où la variable est déclarée
	public void removeVariable(Variable x, Fonction f){
		if(isPresent(f)){
			if(f.isPresent(x)){
				int index = f.getIndex(x);
				f.remove(index);
			}
			else{//error
			}
		}
		else{
			//error
		}
	}
	
}
