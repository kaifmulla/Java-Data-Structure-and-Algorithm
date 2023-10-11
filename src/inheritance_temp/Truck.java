package inheritance_temp;

import inheritance.Vehicle;

public abstract class Truck extends Vehicle {

	int maxLoading;
	
	
	public void print() {
		System.out.println("color:- "+getColor()+ " maxSpeed:- "+maxSpeed+" maxLoading "+maxLoading);
	}
}
