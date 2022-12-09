package week5CodingAssignment;

public class App {

	public static void main(String[] args) {

	/*In this class instantiate an instance of each of your logger classes that implement 
	 *the Logger interface.
	 * 
	 * Test both methods on both instances, passing in Strings of your choice.
	 */
		
		Logger logger = new SpacedLogger();
		
		logger.log("Goodbye");
		System.out.println();
		logger.error("Goodbye");
		
		
	}

}
