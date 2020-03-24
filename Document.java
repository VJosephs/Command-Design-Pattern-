// Document goes here
package csce247.assignments.command;
public class Document {
	
	private String name;
	
	public Document(String name) {
		this.name = name;
		System.out.println("Document " + name + " is being created");
	}
	
	public void spell() {
		System.out.println("Document " + name + " is being checked for spelling errors");
	}
	
	public void load() {
		System.out.println("Document " + name + " is being loaded into view ");
	}
	
	public void save() {
		System.out.println("Document " + name + " is being saved ...");
	}
	
	public void print() {
		System.out.println("Document " + name + " is printing ...");
	}
}