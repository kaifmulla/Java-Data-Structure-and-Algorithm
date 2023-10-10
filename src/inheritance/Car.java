package inheritance;

public class Car extends Vehicle{

	int numofDoors;
	public void printCar() {
		System.out.print("car color "+getColor()+" maxspeed "+maxSpeed+" numofdoors "+numofDoors);
	}
}
