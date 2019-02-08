package carlot;

import java.util.ArrayList;

public class CarLot {
	
	private String name;
	private ArrayList<String> listOfVehicles1 = new ArrayList();
	private Vehicle[] listOfVehicles;

	
	
	public CarLot(int limit) {
		listOfVehicles =  new Vehicle[limit];
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getListOfVehicles1() {
		return listOfVehicles1;
	}

	public void setListOfVehicles(ArrayList<String> listOfVehicles1) {
		this.listOfVehicles1 = listOfVehicles1;
	}
	
	public Vehicle[] getListOfVehicles() {
		return listOfVehicles;
	}

	public void setListOfVehicles(Vehicle[] listOfVehicles) {
		this.listOfVehicles = listOfVehicles;
	}

	public void printVehicleInventory() {
		for(int i = 0; i < listOfVehicles.length; i++) {
			if(listOfVehicles[i] != null) {
			System.out.println(i);	
			}
				
		}
		
	}
	public void addVehicle(Car myCar, int location) {
		listOfVehicles[location] = myCar;
		
	}
	public void addVehicle(Truck myTruck, int spot) {
		listOfVehicles[spot] = myTruck;
	}
	

}
