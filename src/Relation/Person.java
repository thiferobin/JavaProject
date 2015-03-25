package Relation;

public class Person {
	
	private Person person;
//	private Dog dog;
//	private Cat cat;
	String firstName,lastName;
	char gender;
	int age;
	
	private Person(){
		
	}
	
	public Person(String firstName, String lastName, char gender, int age){
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
	}
	
//	public Dog getDog() {
//		return dog;
//	}
//
//
//	public void setDog(Dog dog) {
//		this.dog = dog;
//	}
//
//
//	public Cat getCat() {
//		return cat;
//	}
//
//
//	public void setCat(Cat cat) {
//		this.cat = cat;
//	}


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


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void showPerson(){
		System.out.println("First Name : "+person.getFirstName());
		System.out.println("Last Name : "+person.getLastName());
		System.out.println("Gender : "+person.getGender());
		System.out.println("Age : "+person.getAge()+"\n");
	}


	public static void main(String[] agrs){
		Person person = new Person("Net","Me",'M',23);

//		person.showPerson();
		
		System.out.println("I have Dog and Cat\n");
		
		Dog dog = new Dog();
		dog.overall();
//		dog.setName("Name");
//		dog.setColor("Black");
//		dog.setSex('M');
//		dog.setSize("Big");
		System.out.println("\n");
//		person.setDog(dog);
		
//		Dog dogs = person.getDog();
//		System.out.println("Dog Name : " + dogs.getName());
//		System.out.println("Dog Color : " + dogs.getColor());
//		System.out.println("Dog Sex : " + dogs.getSex());
//		System.out.println("Dog Size : " + dogs.getSize()+"\n");
		
		Cat cat = new Cat();
		cat.overall();
//		cat.setName("Meaw");
//		cat.setColor("Gray");
//		cat.setSex('F');
//		cat.setSize("Small");
		
//		person.setCat(cat);
//		Cat cats = person.getCat();
//		System.out.println("Cat Name : " + cats.getName());
//		System.out.println("Cat Color : " + cats.getColor());
//		System.out.println("Cat Sex : " + cats.getSex());
//		System.out.println("Cat Size : " + cats.getSize());
		
		
	}

}
