package week5CodingAssignment;

public class SpacedLogger implements Logger {
	
	/*The SpacedLogger should add spaces between each character of the String argument 
	 *passed into its methods. If the log method received “Hello” as an argument, it 
	 *should print H e l l o
	 *
	 *The error method should do the same, but with “ERROR:” preceding the spaced out 
	 *input (i.e. ERROR: H e l l o) 
	 */

	@Override
	public void log(String log) {
		for (int i = 0; i < log.length(); i++) {
			char character = log.charAt(i);
			System.out.print(character + " ");
		}
	}
	

	@Override
	public void error(String error) {
		System.out.print("ERROR: ");
		for (int i = 0; i < error.length(); i++) {
			char letter = error.charAt(i);
			System.out.print(letter + " ");
		}
	}
	
}
