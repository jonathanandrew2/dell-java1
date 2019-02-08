package Car;

public class GarageManager {

	public static void main(String[] args) {
		
		ParkingGarage parkingSpots = new ParkingGarage(20); 
		MyCar blueCar= new MyCar("blue", "123ghn", "nissan", "370z");
		MyCar redCar= new MyCar("red", "123ghn", "nissan", "370z");
		parkingSpots.park(blueCar, 15);
		parkingSpots.park(redCar, 16);
		parkingSpots.vacate(15);
		parkingSpots.printInventory();
	
		
	}

}
