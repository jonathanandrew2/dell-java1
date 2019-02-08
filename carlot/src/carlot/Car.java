package carlot;

public class Car extends Vehicle {

	private String typeOfCar;
	private int numOfDoors;
	
	public Car(String typeOfCars, int numbOfDoors, String vLicenseNumber, String makeOfVehicle, String modelOfVehicle, int priceOfVehicle) {
		super(vLicenseNumber, makeOfVehicle, modelOfVehicle, priceOfVehicle);
		this.typeOfCar = typeOfCar;
		this.numOfDoors = numbOfDoors;
		
	}
	
	public String getTypeOfCar() {
		return typeOfCar;
	}
	public void setTypeOfCar(String typeOfCar) {
		this.typeOfCar = typeOfCar;
	}
	public int getNumOfDoors() {
		return numOfDoors;
	}
	public void setNumOfDoors(int numOfDoors) {
		this.numOfDoors = numOfDoors;
	}
}
