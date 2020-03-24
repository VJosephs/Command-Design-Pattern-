// Load Command Goes here

public class LoadCommand implements Command {

	private Document doc;

	public LoadCommand(Document doc) {
		this.doc = doc;
	}

	public void execute() {
		doc.load();
	}

}
