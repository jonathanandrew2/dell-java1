package carlot;

public class Truck extends Vehicle {
	
	private String bedSize;
	
	
	public Truck(String bedSizeOfTruck, String vLicenseNumber, String makeOfVehicle, String modelOfVehicle, int priceOfVehicle) {
		super(vLicenseNumber, makeOfVehicle, modelOfVehicle, priceOfVehicle);
		this.bedSize = bedSizeOfTruck;
	}

	public String getBedSize() {
		return bedSize;
	}

	public void setBedSize(String bedSize) {
		this.bedSize = bedSize;
	}
	
}
