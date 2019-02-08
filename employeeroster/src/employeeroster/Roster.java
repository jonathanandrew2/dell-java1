package employeeroster;

import java.util.List;
import java.util.ArrayList;


public class Roster {
	private List<Employee> roster;
	
	public Roster() {
		roster = new ArrayList<>();
	}

	private List<Employee> getRoster() {
		return roster;
	}

	private void setRoster(List<Employee> roster) {
		this.roster = roster;
	}
	public void addEmployee(Employee toAdd) {
		roster.add(toAdd);
	}
	

}
