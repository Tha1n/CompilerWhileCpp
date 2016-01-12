package SymboleTable

class Logger {
	public static boolean _debug = true;
	
	def public static void PRINT(String toPrint)
	{
		if(_debug)
			println(toPrint)
	}
}