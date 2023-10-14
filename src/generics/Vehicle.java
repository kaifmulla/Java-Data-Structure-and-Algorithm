package generics;

public class Vehicle implements printInterface{

	int maxSpeed;
	String color;
	
	public Vehicle(int maxSpeed, String color) {
		this.maxSpeed = maxSpeed;
		this.color = color;
	}
//	public void print() {
//		System.out.println(maxSpeed+" "+color);
//	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(maxSpeed+" "+color);
		
	}
}
