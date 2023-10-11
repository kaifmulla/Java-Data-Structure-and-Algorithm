package interfaceJava;


// in interface it is pure abstract means all methods and variable are pure abstract

public interface VehicleInterface {
	
	
	// we can also declare the variable in this interface
	// by default variable are public static final
	public static final double pI = 3.14;             // so if we dont write it (public final static) it will be okay
	boolean isMotorized();
	
	String getCompany();
	
	

}
