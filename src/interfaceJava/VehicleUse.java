package interfaceJava;

public class VehicleUse {

	public static void main(String[] args) {
		
		// we cannot create object of vehicleInterface but we can create object of vehicle class
		Vehicle v = new Vehicle();
//		VehicleInterface vI = new VehicleInterface();
		VehicleInterface vI;             		// But yes we can achieve polymorphism
		
//		vI = new Vehicle();
//		vI.getCompany();
//		vI.print();                        // we cannot use this because print function is not vehicleinterface specific so..
		
		
	}

}
