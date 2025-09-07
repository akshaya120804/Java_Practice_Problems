package Inheritance.singleInheritance.RealScenarios.library;

public class About extends Details {

	protected int version;

	public About(String name, int id, String author, float cost,int version) {
		super(name, id, author, cost);
		this.version = version;
	}
	
	@Override
	public String toString() {
		return "Book Details........\nname=" + name + "\nid=" + id + "\nauthor=" + author + "\ncost=" + cost+"\nVersion="+version ;
	}
	

}
