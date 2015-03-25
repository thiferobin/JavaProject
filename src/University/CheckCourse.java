package University;

import java.util.ArrayList;
import java.util.List;

public class CheckCourse {
	
	private Course course;

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public static void main(String[] args) {
		
		Drive drivePat = new Drive("Yes");
		Drive driveNiwat = new Drive("No");
		
		List<Course> course = new ArrayList<Course>();
		Course course1 = new Course("CS111");
		Course course2 = new Course("CS101");
		Course course3 = new Course("CS295");
		course.add(course1);
		course.add(course3);

		List<Address> addressT = new ArrayList<Address>();
		Address ad = new Address("458","Jakkapak","Paknam","10270");
		Address ad2 = new Address("345","Jakkapak","Paknam","10270");
		addressT.add(ad);
		addressT.add(ad2);
		
		List<Address> addressT2 = new ArrayList<Address>();
		Address ad3 = new Address("133","Thonglor","Bangkok","99909");
		addressT2.add(ad3);

		
		
		List<Teacher> teacher = new ArrayList<Teacher>();
		teacher.add(new Teacher("Pat", "Female", "1209660000",addressT, course2,drivePat));
		teacher.add(new Teacher("Nawat", "Male", "9999990000",addressT2,course1,driveNiwat));
		
		System.out.println("---------------------------------");
		System.out.println("Teacher has " + teacher.size());
		System.out.println("---------------------------------");
		
		int count=0;
		
		System.out.println("Name: "+teacher.get(count).getName()+"\nID: "+teacher.get(count).getId()+"\nSex: "+teacher.get(count).getSex()+"\nCourse: "+teacher.get(count).getCourses().getCourseName()+"\nCan Drive: "+teacher.get(count).getDrive().getDrives());

		count++;
		for(Address a : addressT){
			System.out.println(a.getStreet()+" "+a.getDistrict()+" "+a.getProvince()+" "+a.getZipcode()+" ");
		}
		
		System.out.println("---------------------------------");
		System.out.println("Name: "+teacher.get(count).getName()+"\nID: "+teacher.get(count).getId()+"\nSex: "+teacher.get(count).getSex()+"\nCourse: "+teacher.get(count).getCourses().getCourseName()+"\nCan Drive: "+teacher.get(count).getDrive().getDrives());
		count++;

		for(Address a : addressT2){
			System.out.println("Address: "+a.getStreet()+" "+a.getDistrict()+" "+a.getProvince()+" "+a.getZipcode()+" ");
		}
		
		List<Student> student = new ArrayList<Student>();
		student.add(new Student("Net", "Male", "5309610417",new Address("133/58","Jakkapak","Paknam","10270"),course,teacher));
		student.add(new Student("Nipat", "Male", "5309610417",new Address("458","Jakkapak","Paknam","10270"),course,teacher));
		student.add(new Student("Nadia", "Female", "5309660023",new Address("0","siri","yaa","170"),course,teacher));
		
		System.out.println("---------------------------------");
		System.out.println("Student has " + student.size());
		System.out.println("---------------------------------");
		
		for (Student s : student){
			System.out.println("Name: "+s.getName()+"\nID: "+s.getId()+"\nSex: "+s.getSex()+"\nAddress: "+s.getAddress().getStreet()+" "+s.getAddress().getDistrict()+" "+s.getAddress().getProvince()+" "+s.getAddress().getZipcode());
			for(Course c : course){
				System.out.println("Course: "+c.getCourseName());
			}
			for(Teacher t : teacher){
				System.out.println("Name Teacher: "+t.getName());
			}
			System.out.println("---------------------------------");
		}

	}

}
