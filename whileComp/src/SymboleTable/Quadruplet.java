package SymboleTable;

public class Quadruplet {
	
	private CodeOp operator;
	private String result;
	private String arg1;
	private String arg2;
	
	public Quadruplet(CodeOp op, String r, String a1, String a2){
		this.operator = op;
		this.result = r;
		this.arg1 = a1;
		this.arg2 = a2;
	}
	
	public String getSecond (){
		return this.result;
	}
	
	public String getThird(){
		return this.arg2;
	}
	public CodeOp getOp()
	{
		return operator;
	}
	
	public String getArg1()
	{
		return arg1;
	}
	
	public String getArg2()
	{
		return arg2;
	}
	
	public String getResult()
	{
		return result;
	}


	public String toString(){
		return "<" + operator.toString() + "," + result + "," + arg1 + "," + arg2 + ">";
	}
}
