package csce247.assignments.command;

import java.util.HashMap;

public class InputHandler {

	private HashMap<String, Command> commands;

	public InputHandler(Document document) {
		commands.put("load", new SpellCommand(document));
		commands.put("save", new SaveCommand(document));
		commands.put("spell", new SpellCommand(document));
		commands.put("print", new PrintCommand(document));
	}

	public void inputEntered(String data) {

		commands.get(data).execute();

	}

}
