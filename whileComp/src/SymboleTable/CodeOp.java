package SymboleTable;

public class CodeOp {
	public final static int OP_NOP = 0;

	private int op;
	private String optLabel1;
	private String optLabel2;

	public CodeOp(int operator, String optLabel1, String optLabel2) {
		this.setOp(operator);
		this.setOptLabel1(optLabel1);
		this.setOptLabel2(optLabel2);
	}

	public CodeOp(int operator, String optLabel) {
		this(operator, optLabel, null);
	}

	public CodeOp(int operator) {
		this(operator, null, null);
	}

	/**
	 * @return the op
	 */
	public int getOp() {
		return op;
	}

	/**
	 * @param op the op to set
	 */
	public void setOp(int op) {
		this.op = op;
	}

	/**
	 * @return the optLabel1
	 */
	public String getOptLabel1() {
		return optLabel1;
	}

	/**
	 * @param optLabel1 the optLabel1 to set
	 */
	public void setOptLabel1(String optLabel1) {
		this.optLabel1 = optLabel1;
	}

	/**
	 * @return the optLabel2
	 */
	public String getOptLabel2() {
		return optLabel2;
	}

	/**
	 * @param optLabel2 the optLabel2 to set
	 */
	public void setOptLabel2(String optLabel2) {
		this.optLabel2 = optLabel2;
	}
	
	public String toString()
	{
		String opToString;
		switch (this.op) {
		case 0:
			opToString =  "Nop";
			break;
		default:
			opToString = "Undefined";
			break;
		}
		return opToString;
	}
}
