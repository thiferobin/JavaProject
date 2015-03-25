package AnimalWorldWide;

public class Cat extends Terrestial implements Run,Bite{

	public void biting() {
		System.out.println("The cat can biting you...");
		
	}

	public void running() {
		System.out.println("The cat can running to go home...");
		
	}

	@Override
	public void eat() {
		System.out.println("The cat can eating...");
		
	}

	@Override
	public void breathe() {
		System.out.println("The cat can breathe...");
		
	}

	@Override
	public void sleep() {
		System.out.println("The cat can sleeping beside you...");
		
	}

	@Override
	public void terrestial() {
		System.out.println("I'm terrestial");
		
	}
	
//	public void show(Animal animal){
//		animal.eat();
//		animal.breathe();
//		animal.sleep();
//	}
	
	public void overall(){
		terrestial();
		biting();
		running();

	}

}
