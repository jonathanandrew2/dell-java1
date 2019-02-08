import java.util.List;
import java.util.ArrayList;

public class Timesheet {

	private List<TimesheetEntry> database;
	
	public Timesheet() {
		this.database = new ArrayList<>();
	}
	
	public List<TimesheetEntry> getDatabase() {
		return database;
	}

	public void setDatabase(List<TimesheetEntry> database) {
		this.database = database;
	}
	public void add(TimesheetEntry project) {
		database.add(project);

	}

	public static void delete(TimesheetEntry entry) {
		entry =  null;
	}



	

}
