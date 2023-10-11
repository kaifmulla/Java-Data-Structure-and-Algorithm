package inheritance;

public abstract class Car extends Vehicle{

	int numofDoors;
//	int maxSpeed;
	
	public Car() {
		
	}
	public Car(int numofDoors, int maxSpeed) {
//		super(maxSpeed);
		System.out.println("Car's Constructor");
		this.numofDoors = numofDoors;
	}
	
	public void print() {
		super.print();
		System.out.print(" numofdoors "+numofDoors);
	}
	
	public void printMaxSpeed() {
		super.maxSpeed = 120;
		System.out.println(maxSpeed+" "+ super.maxSpeed);
	}

	@Override
	public boolean isMotorized() {
		// TODO Auto-generated method stub
		return true;
	}
	
	
	
}


// final keyword
// when we declare final keyword to a variable: then that variable should be declare once and initialized once only and it cant be changed further.

// when we declare final to method : then that function cannot be overided for we have vehicle class and in that print func is final and in car and bicycle class we have print functions
// that functions will get error because it should be declare once.... 

// when we declare final to the class : that class cannot be inherited
