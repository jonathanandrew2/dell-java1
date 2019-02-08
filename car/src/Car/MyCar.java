package Car;

public class MyCar {
	
	private String Color;
	private String MakeOfCar;
	private String ModelOfCar;
	private String LicenseNumber;

	
	public MyCar() {
		
	}
	
	public MyCar(String myColor, String myLicense, String myMake, String myModel) {
		this.Color = myColor;
		this.LicenseNumber = myLicense;
		this.MakeOfCar = myMake;
		this.ModelOfCar = myModel;
		
	}
	
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public String getMakeOfCar() {
		return MakeOfCar;
	}
	public void setMakeOfCar(String makeOfCar) {
		MakeOfCar = makeOfCar;
	}
	public String getModelOfCar() {
		return ModelOfCar;
	}
	public void setModelOfCar(String modelOfCar) {
		ModelOfCar = modelOfCar;
	}
	public String getLicenseNumber() {
		return LicenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		LicenseNumber = licenseNumber;
	}

	
}
