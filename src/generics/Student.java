package generics;

public class Student implements printInterface {

	int rollNo;
	
	public Student(int rollNo) {
		this.rollNo = rollNo;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(rollNo);
		
	}
}
