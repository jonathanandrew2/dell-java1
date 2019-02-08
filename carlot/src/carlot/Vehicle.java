package carlot;

public abstract class Vehicle {
	
	String licenseNumber;
	String make;
	String model;
	int price;
	
	public Vehicle(String vLicenseNumber, String makeOfVehicle, String modelOfVehicle, int priceOfVehicle) {
		this.licenseNumber = vLicenseNumber;
		this.make = makeOfVehicle;
		this.model = modelOfVehicle;
		this.price = priceOfVehicle;
	}
	
	public static void printDescription() {
	
	}

}
