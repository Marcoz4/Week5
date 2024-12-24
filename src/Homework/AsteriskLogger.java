package Homework;

public class AsteriskLogger implements Logger {
//created a new class that implements logger
	//hover over the class name to add unimplemented methods

	@Override
	public void log(String message) {
		System.out.println("***" + message + "***");
		//adds asterisk before and after message
	}

	@Override
	public void error(String message) {
		String errorMessage = "***Error: " + message + "***"; 
		//string with the message and some other words added to it
		String border = "*".repeat(errorMessage.length()); 
		//will add asterisk the length of the errorMessage
		System.out.println(border); //border for top
		System.out.println(errorMessage); //will print error message with asterisks
		System.out.println(border); //asterisk border on bottom
		
	}

}
