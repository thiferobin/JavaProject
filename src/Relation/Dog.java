package Relation;

public class Dog extends Animal{
//	private void name;

	@Override
	public void name() {
		System.out.println("The name of dog is Po");
		
	}

	@Override
	public void color() {
		System.out.println("The color of dog is Black");
	}

	@Override
	public void sex() {
		System.out.println("The sex of dog is Male");
	}

	@Override
	public void size() {
		System.out.println("The size of dog is Big");
	}
	
	@Override
	public void overall(){
		name();
		color();
		sex();
		size();
		
	}

}
