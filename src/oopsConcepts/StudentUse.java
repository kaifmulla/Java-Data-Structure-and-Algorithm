package oopsConcepts;

public class StudentUse {

	public static void main(String[] args) {
		
		Student s1 = new Student();							//when we write this..., an object get created and s1 stores the reference
															// And s1 points to block of heap memory
		
		s1.name = "kaif";                                 
		s1.roll = 33;
		
		System.out.println(s1.name+" "+s1.roll);

	}

}
