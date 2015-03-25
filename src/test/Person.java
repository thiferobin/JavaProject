package test;

public class Person {
	
	String firstName,lastName,title;
	int age;
	
	public Person(){
		firstName = "Jane";
		lastName = "Doe";
	}
	
	public Person(String name, String lName){
		this.firstName = name;
		this.lastName = lName;
	}
	
	public String getFristName(){
		return firstName;
	}
	
	public void walk(){
		System.out.println("I'm walking...");
	}
	
	public String eat(){
		return "Mac";
	}
	
	public static void main(String agrs[]){
//		Person person = new Person();
		
		Person person = new Person("Net","Naja");
		
		System.out.println("First Name is : "+person.firstName);
		System.out.println("Last Name is : "+person.lastName);
		
		person.walk();
		System.out.println("I ate "+person.eat());
		
		Person person1 = new Person("Nes","Teeruk");
		System.out.println("First Name1 is : "+person1.firstName);
		System.out.println("Last Name1 is : "+person1.lastName);
	}

}
