
import java.util.HashMap;

public class InputHandler {

	private HashMap<String, Command> commands = new HashMap<String, Command>();

	public InputHandler(Document document) {
		commands.put("load", new LoadCommand(document));
		commands.put("save", new SaveCommand(document));
		commands.put("spell", new SpellCommand(document));
		commands.put("print", new PrintCommand(document));
	}

	public void inputEntered(String data) {
		if(commands.get(data) != null)
			commands.get(data).execute();
		else
			System.out.println("Sorry, we don't recognize that command");
	}

}
