package SymboleTable;

import java.util.ArrayList;

public class Quadruplet {
	private ArrayList<String> quad;
	
	public Quadruplet(String a, String z, String e, String r){
		quad = new ArrayList<String>(4);
		quad.add(a);
		quad.add(z);
		quad.add(e);
		quad.add(r);
	}
	
	public ArrayList<String> getQuad() {
		return quad;
	}



	public void setQuad(ArrayList<String> quad) {
		this.quad = quad;
	}



	public String toString(){
		return "<" + quad.get(0) + ", " + quad.get(1) + ", " + quad.get(2) + ", " + quad.get(3) + ">";
	}
}
