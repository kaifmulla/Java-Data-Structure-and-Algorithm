package inheritance;

public abstract class Vehicle {
	
	private String color;
	protected int maxSpeed;
	
	public Vehicle() {
		System.out.println("Vehicle's Constructor");
	}
	
	public Vehicle(int maxSpeed) {
		System.out.println("Vehicle's Constructor");
		this.maxSpeed = maxSpeed;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void print() {
		System.out.println("color:- "+color+ " maxSpeed:- "+maxSpeed);
	}
	
	public abstract boolean isMotorized();
	
	public abstract String getCompany();
	
}
