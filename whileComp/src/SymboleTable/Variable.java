package SymboleTable;

/**
 * This class defined a WHILE variable
 *
 */
public class Variable {
	//The name of the variable
	private String m_name;
	//If it's an input
	private String m_dataAdress;
	
	public Variable(String name, String dataAdress) {
		super();
		this.m_name = name;
		this.m_dataAdress = dataAdress;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getM_dataAdress() {
		return m_dataAdress;
	}

	public void setM_dataAdress(String m_dataAdress) {
		this.m_dataAdress = m_dataAdress;
	}
}
