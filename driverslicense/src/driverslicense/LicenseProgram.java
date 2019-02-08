                 package driverslicense;

import java.time.LocalDate;
import java.time.Period;

public class LicenseProgram {

	public static void main(String[] args) {
		
		
	DriversLicense dL = new DriversLicense();
	dL.dobDD = 22;
	dL.dobMM = 9;
	dL.dobYYYY = 1992;
	dL.firstName = "Jonathan";
	dL.lastName = "Hernandez";

	System.out.println("Name: " + dL.getFirstName() + " " + dL.getLastName());
	System.out.println("Age : " + dL.ageOfPerson());
	
	

	}
}

