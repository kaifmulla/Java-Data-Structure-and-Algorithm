package interfaceJava;

public class Car extends Vehicle implements VehicleInterface,CarInterface{

	// we can also do both also extend Vehicle and also implement VehicleInterface
	//yes we can implement more than two interface
	// but this class can extend only one class
	
	
	
	@Override
	public boolean isMotorized() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getCompany() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int numGears() {
		// TODO Auto-generated method stub
		return 5;
	}

}
