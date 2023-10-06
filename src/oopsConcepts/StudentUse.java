package oopsConcepts;

public class StudentUse {

	public static void main(String[] args) {
		
//		Student s1 = new Student();							//when we write this..., an object get created and s1 stores the reference
															// And s1 points to block of heap memory
		
		Student s1 = new Student("kaif", 20);				// we are giving parameters because in student class constructor is defined
		Student s2 = new Student("Mahesh", 28);
		Student s3 = new Student("Abhi", 48);
//		s1.name = "kaif";                                 
//		s1.roll = 33;                                     as it was private we cannot set roll no
		
		
//		s1.setRoll(22);                       				//roll is private variable in student class so that we can set and get using set & get function inside student class
		
//		System.out.println(s1.getRoll());
		
		s1.print();
		System.out.println(Student.numStudents);              // but this is not the correct way to print static variables as it belongs to class we should write Student.numStudents
		
//		System.out.println(s1.name+" "+s1.getRoll());

	}

}
