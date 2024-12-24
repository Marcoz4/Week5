package Homework;

public class SpacedLogger implements Logger {
//new class
	//hover over class name to add unimplemented methods
	

	@Override
	public void log(String message) {
		System.out.println(addSpaces(message));
		//// Calls addSpaces method
		
	}

	@Override
	public void error(String message) { 
		System.out.println("ERROR: " + addSpaces(message)); 
		// Adds ERROR: before spaced message }
	}
	
	private String addSpaces(String message) { 
		StringBuilder spacedMessage = new StringBuilder(); 
		for (char c : message.toCharArray()) {  // Loops through each character
			spacedMessage.append(c).append(' '); 
		} 
		return spacedMessage.toString().trim(); // Returns the spaced message
		
	}

}
