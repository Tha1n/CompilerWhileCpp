package org.xtext.example.validation;

public class Issue {
	String 	m_associatedFile;	//Fichier associé
	int		m_type;				//Type: Error or Warning
	String 	m_message;			//Message d'erreur
	
	
	public String getM_associatedFile() {
		return m_associatedFile;
	}
	public void setM_associatedFile(String m_associatedFile) {
		this.m_associatedFile = m_associatedFile;
	}
	public int getM_type() {
		return m_type;
	}
	public void setM_type(int m_type) {
		this.m_type = m_type;
	}
	public String getM_message() {
		return m_message;
	}
	public void setM_message(String m_message) {
		this.m_message = m_message;
	}
}
