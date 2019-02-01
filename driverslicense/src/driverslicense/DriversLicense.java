package driverslicense;

import java.time.LocalDate;
import java.time.Period;

public class DriversLicense {
	
	public String firstName;
	public String lastName;
	public int height;
	public String gender;
	public int dobYYYY;
	public int dobMM;
	public int dobDD;
	

	public DriversLicense() {
		
	}
	
	private int getDobYYYY() {
		return dobYYYY;
	}


	void setDobYYYY(int dobYYYY) {
		this.dobYYYY = dobYYYY;
	}


	private int getDobMM() {
		return dobMM;
	}


	void setDobMM(int dobMM) {
		this.dobMM = dobMM;
	}


	private int getDobDD() {
		return dobDD;
	}


	void setDobDD(int dobDD) {
		this.dobDD = dobDD;
	}
	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

//	public int getDob() {
//		return dob;
//	}
//
//	public void setDob(int dob) {
//		this.dob = dob;
//	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
public int ageOfPerson() {
		
		LocalDate today = LocalDate.now(); // today's date
		LocalDate birthday = LocalDate.of(1992, 9, 22); // date of birth

		Period period = Period.between(birthday, today);

		int age = period.getYears(); // calculate the period between DOB and today in years
		
		return age;
		
	}

	

}
