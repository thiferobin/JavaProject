package University;

import java.util.List;

public class Teacher extends Person{

	public Teacher(String name, String sex, String id, List<Address> address, Course course, Drive drive){
		super.setName(name);
		super.setId(id);
		super.setSex(sex);
		this.setAddresses(address);
		this.setCourses(course);
		this.setDrive(drive);
	}
	
	private List<Address> addresses;
	private Course courses;
	private Drive drive;

	public Drive getDrive() {
		return drive;
	}

	public void setDrive(Drive drive) {
		this.drive = drive;
	}

	public Course getCourses() {
		return courses;
	}

	public void setCourses(Course courses) {
		this.courses = courses;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
}
