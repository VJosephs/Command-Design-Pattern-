// Load Command Goes here
package csce247.assignments.command;
public class LoadCommand implements Command {

	private Document doc;

	public LoadCommand(Document doc) {
		this.doc = doc;
	}

	public void execute() {
		doc.load();
	}

}
