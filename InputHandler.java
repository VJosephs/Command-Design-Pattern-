import java.util.HashMap;

/**
 *  A InputHandler Object
 *	A class to take in string input and execute the corresponding command
 *
 * @author Andrew Merrill, Jake Brown
 * @Version 1.0.0 March 24, 2020
 */
public class InputHandler {

	/**
	 * A HashMap to store the command string and command object pairing
	 */
	private HashMap<String, Command> commands = new HashMap<String, Command>();


	/**
	 * @param document the document the input will be accessing
	 */
	public InputHandler(Document document) {
		commands.put("load", new LoadCommand(document));
		commands.put("save", new SaveCommand(document));
		commands.put("spell", new SpellCommand(document));
		commands.put("print", new PrintCommand(document));
	}

	/**
	 * Takes in a String to be run as a command
	 * @param data this string that will act as the key to run the command
	 */
	public void inputEntered(String data) {
		if(commands.containsKey(data))
			commands.get(data).execute();
		else
			System.out.println("Sorry, we don't recognize that command");
	}

}
