package University;

import java.util.List;

public class Student extends Person{

	public Student(String name, String sex, String id, Address address, List<Course> course,List<Teacher> teachers){
		super.setName(name);
		super.setId(id);
		super.setSex(sex);
		this.setAddress(address);
		this.setCourse(course);
		this.setTeachers(teachers);
	}
	
	private Address address;
	private List<Course> course;
	private List<Teacher> teachers;
	
	public List<Teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}
