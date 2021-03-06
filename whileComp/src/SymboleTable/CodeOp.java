package SymboleTable;

public class CodeOp {
	public final static int OP_NOP = 0;
	public final static int OP_IF = 1;
	public final static int OP_AFF = 2;
	public final static int OP_WHILE = 3;
	public final static int OP_FOREACH = 4;
	public final static int OP_CONS = 5;
	public final static int OP_HD = 6;
	public final static int OP_TL = 7;
	public final static int OP_CALL = 8;
	public final static int OP_AND = 9;
	public final static int OP_OR = 10;
	public final static int OP_NOT = 11;
	public final static int OP_EQ = 12;


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
		case 1:
			opToString =  "IF";
			break;
		case 2:
			opToString =  ":=";
			break;
		case 3:
			opToString =  "while";
			break;
		case 4:
			opToString =  "foreach";
			break;
		case 5:
			opToString =  "cons";
			break;
		case 6:
			opToString =  "hd";
			break;
		case 7:
			opToString =  "tl";
			break;
		case 8:
			opToString =  "call";
			break;
		case 9:
			opToString = "and";
			break;
		case 10:
			opToString = "or";
			break;
		case 11:
			opToString = "not";
			break;
		case 12:
			opToString = "eq";
			break;
		default:
			opToString = "Undefined";
			break;
		}
		return opToString;
	}
}
