package driverslicense;

import java.time.LocalDate;
import java.time.Period;

public class LicenseProgram {

	public static void main(String[] args) {
		
		
	DriversLicense dL = new DriversLicense();
	dL.firstName = "Jon";
	dL.lastName = "Hernandez";
	dL.dob = 1992;
	int year = 0;
	int month = 0;
	int day = 0;
	
	
	System.out.println("Name: " + dL.getFirstName() + " " + dL.getLastName());
	System.out.println("Age : " + (dL.getDob()));
	
		System.out.println();

	}
	
	public static void ageOfPerson() {
		
		LocalDate today = LocalDate.now(); // today's date
		LocalDate birthday = LocalDate.of(1992, 01, 03); // date of birth

		Period period = Period.between(birthday, today);

		int age = period.getYears(); // calculate the period between DOB and today in years
		System.out.println(age);

		
		
	}


}

