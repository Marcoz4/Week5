package Homework;

public class App { 
	public static void main(String[] args) { 
		Logger asteriskLogger = new AsteriskLogger(); 
		Logger spacedLogger = new SpacedLogger(); 
		
		// Test AsteriskLogger 
		asteriskLogger.log("Marco"); // Output: ***Marco*** 
		asteriskLogger.error("Marco"); // Output: 
		/* **************** 
		 * ***Error: Marco*** 
		 * **************** 
		 */ 
		
		// Test SpacedLogger 
		spacedLogger.log("Marco"); // Output: M a r c o 
		spacedLogger.error("Marco"); // Output: ERROR: M a r c o

	}

}
