package inheritance;

public class VehicleUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v = new Vehicle();
//		v.color = "black";
		v.setColor("black");
//		v.print();
		
		Bicycle b = new Bicycle();
//		b.color = "blue";
		b.setColor("blue");
		b.maxSpeed = 100;
		b.print();
		
		
		Car c = new Car();
//		c.color = "white";
		c.setColor("white");
		c.maxSpeed = 200;
		c.numofDoors = 4;
		c.print();
	}

}
