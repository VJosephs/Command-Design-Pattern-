/**
 * A class that acts as a command to load a Document
 *
 * @author Andrew Merrill
 * @version 1.0.0 March 24, 2020
 */
public class LoadCommand implements Command {

	/**
	 * The Document the command will be running on
	 */
	private Document doc;

	/**
	 * @param doc input to be stored as the Document to be acted on
	 */
	public LoadCommand(Document doc) {
		this.doc = doc;
	}

	/**
	 * Executes the load command
	 */
	public void execute() {
		doc.load();
	}

}
