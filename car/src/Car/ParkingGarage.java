package Car;

public class ParkingGarage {
	
	private MyCar[] parkingSpots;
	private int currCapacity;
	
	public MyCar[] getParkingSpots() {
		return parkingSpots;
	}

	public void setParkingSpots(MyCar[] parkingSpots) {
		this.parkingSpots = parkingSpots;
	}

	public int getCurrCapacity() {
		return currCapacity;
	}

	public void setCurrCapacity(int currCapacity) {
		this.currCapacity = currCapacity;
	}

	public ParkingGarage() {
		
	}
	
	public ParkingGarage(int numSpots) {
		parkingSpots = new MyCar[numSpots];
		currCapacity = 0;
		
	}

	public void printInventory() {
		for(int i = 0; i <parkingSpots.length; i++) {
			if(parkingSpots[i] != null) {
				System.out.println(i + " " + parkingSpots[i].getMakeOfCar() + " " + parkingSpots[i].getModelOfCar() + " " + parkingSpots[i].getColor() + " " + parkingSpots[i].getLicenseNumber() );
				
			}

		
		}
	}
	
	public void park(MyCar car, int Spot) {
		parkingSpots[Spot] = car;

		
	}
	
	public void vacate(int Spot) {
		
		parkingSpots[Spot] = null;
				
	}
}
