// SpellCommand Goes here
package csce247.assignments.command;
public class SpellCommand extends Document implements Command {

	private Document doc;
	
	public SpellCommand(Document doc) {
		this.doc = doc;
	} 
	
	public void execute() {
		doc.spell();
	}
	
}