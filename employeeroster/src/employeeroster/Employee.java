package employeeroster;

public class Employee {

	
	public Employee(String empName, String empJobTitle) {
		name = empName;
		jobTitle = empJobTitle;
	}
	
	private String name;
	private String jobTitle;
	
	
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private String getJobTitle() {
		return jobTitle;
	}
	private void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
}
