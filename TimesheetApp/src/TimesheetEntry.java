import java.time.LocalDateTime;

public class TimesheetEntry {

	private String projectName;
	private String task;
	private int id;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	private static int NEXTID = 1;
	
	public TimesheetEntry(String myProject, String myTask) {
		this.projectName = myProject;
		this.task = myTask;
		this.startTime = LocalDateTime.now();
		this.id = NEXTID;

	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

	public static int getNEXTID() {
		return NEXTID;
	}

	public static void setNEXTID(int nEXTID) {
		NEXTID = nEXTID;
	}
	
	public void updateEndTime() {
		if(endTime == null) {
			endTime = LocalDateTime.now();

		}
	}


}
