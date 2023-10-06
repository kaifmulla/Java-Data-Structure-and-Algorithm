package oopsConcepts;

public class Student {

	
	String name;
	final double conversionFactor = 0.97;               		// final keyword once we declare with final we cannot change its value anywhere it is declared once and initialized once 
	public String name2;
	private int roll;                 
																//here we have did this roll private hence it can be accessed and used within this class only
																// so whenever the student object is created from other class we cannot access roll but we can access name as it is default
	
																// we have wrote string name,it means it is default variable means it can be access within same package
	
	static int numStudents;									// we have declared numStudents as static it means it belongs to class and other properties like name and roll it belongs to object
															// so that it can e increased when object is called
	
	
	//constructor :-  it is nothing but when object is created constructor gets called
	// it is same name as class name....
//	public Student(){																	It is a default constructor 
//		
//	}
	
	public Student(String name, int roll) {
		this.name = name;
		this.roll = roll;
		numStudents++;
	}
	
	
	
	public int getRoll() {
		return roll;
	}
	
	public void setRoll(int roll) {								// here we are setting rollno  but we can also put checks so that wrong value cannot be set 
																// parameters of setroll is as same and roll variable so it will not work so we will need to use this keyword
																// this referes to current object
		if(roll <= 0) {
			return;
		}
		
		this.roll = roll;
	}
	
	public void print() {
		System.out.println(name+" "+roll);
	}
	
}
