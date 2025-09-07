package Inheritance.singleInheritance.Base;

class Name {
	protected String name;

	String stdname (String name) {
		this.name = name ;
		return name ;
	}
}


class Id extends Name{
	private int id ;
	int stdid(int id) {
		this.id=id;
		return id;
	}
	void display() {
		System.out.println("Name : "+name );
		System.out.println("Id : "+id);
	}
}

public class Student {
	public static void main(String[] args) {
		String name;
		int id ;
		Id n = new Id();
		name = n.stdname("Akshaya");
		id = n.stdid(56); 
		n.display();
		
	}
}
