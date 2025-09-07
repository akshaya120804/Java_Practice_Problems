package Inheritance.MultipleInheritance.Festivel;

public class Thing extends Foood{
	protected String thing;

	public Thing(String name, String location, String food, String thing) {
		super(name, location, food);
		this.thing = thing;
	}

	@Override
	public String toString() {
		return "Let's Celebrate "+name+"\nFestivel : " + name + "\nCelebrated State : " + location + "\nFamous For : " + thing + "\nFamous food : " + food ;
	}

	
	
}
