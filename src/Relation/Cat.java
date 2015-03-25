package Relation;

public class Cat extends Animal{

	@Override
	public void name() {
		System.out.println("The name of cat is Mar");
		
	}

	@Override
	public void color() {
		System.out.println("The color of cat is Gray");
		
	}

	@Override
	public void sex() {
		System.out.println("The sex of cat is Male");
		
	}

	@Override
	public void size() {
		System.out.println("The size of cat is Small");
		
	}
	
	@Override
	public void overall(){
		name();
		color();
		sex();
		size();
		
	}
}
