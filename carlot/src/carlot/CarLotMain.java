package carlot;

public class CarLotMain {

	public static void main(String[] args) {
		
	CarLot lov = new CarLot(20);
	CarLot myLot = new CarLot(20);
	Car myCar = new Car("coupe", 2, "HZH768", "Honda", "Civic", 10000);
	Car myCar1 = new Car("HatchBack", 2, "MHN4567", "Subaru", "wrx", 35000);
	lov.addVehicle(myCar, 14);
	myLot.addVehicle(myCar1, 7);
	Truck myTruck = new Truck("Large Bed Size", "HMH2890", "Chevy", "Silverado", 30000);
	lov.addVehicle(myTruck, 9);

	}

}

