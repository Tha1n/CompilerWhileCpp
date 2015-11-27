package SymboleTable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class FunDictionary {
	//nom de la fonction, ses données
	private List<Fonction> dictionary;
	
	//la map fais le lien entre un nom de fonction et la Fonction elle meme
	
	//Fonction : nb entrées et sorties, adresse (nom en code cible), liste de variables

	public FunDictionary() {
		super();
		this.dictionary = new ArrayList<Fonction>();
	}
	
	public List<Fonction> getFunctions() {
		return this.dictionary;
	}

	public void setDictionary(List<Fonction> dictionary) {
		this.dictionary = dictionary;
	}
	
	public boolean putFunction(Fonction f){
		if (!isPresent(f)) {
			this.dictionary.add(f);
			return true;
		}
		this.dictionary.clear();
		return false;
		
	}
	
	
	
	public boolean isPresent (Fonction f){
		for(Fonction f1: this.dictionary){
			if(f1.egal(f)) return true;
		}
		return false;
	}
	
	
	public String toString(){
		String fonctions = "\n-------------------------------------\n"+
							 "        Table des symboles           \n";
		for(Fonction f : this.dictionary){
			fonctions += " - " + f.getM_name() + " : " + f.getM_nbIn() + " inputs --> " + f.getM_nbOut() +" outputs\n" + f.toString() ;
		}
		
		fonctions += "\n-------------------------------------\n";
		return fonctions;
	}
	
	
	public List<String> getListFuncName (){
		List<String> res = new ArrayList<String>();
		for(Fonction f:this.dictionary){
			res.add(f.getM_name());
		}
		return res;
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
