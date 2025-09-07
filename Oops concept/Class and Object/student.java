package array;

import java.util.Scanner;

class Main {
	String name ;
	int rollno;
	String course;
	Main(String name ,int rollno,String course){
		this.name = name  ;
		this.rollno = rollno;
		this.course = course;
	}
	void display() {
		System.out.println("name :"+name);
		System.out.println("rollno :"+rollno);
		System.out.println("course :"+course);

	}

}
public class student{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String name = sc.next();
		int rollno = sc.nextInt();
		String course =sc.next() ;
		Main obj = new Main(name, rollno, course);
		obj.display();
		
	}
}
