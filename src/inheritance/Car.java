package inheritance;

public class Car extends Vehicle{

	int numofDoors;
//	int maxSpeed;
	
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
	
}
