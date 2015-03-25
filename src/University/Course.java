package University;

public class Course {
	
	public Course(String courseName){
		this.setCourseName(courseName);
	}
	
	private String courseName;

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}
