package AnimalWorldWide;

public class Chicken extends Poultry implements Fly,Run,Bite{

	public void biting() {
		System.out.println("The chicken can biting you...");
		
	}

	public void running() {
		System.out.println("The chicken can run to hit you...");
		
	}

	public void flying() {
		System.out.println("The chicken can fly but but not high...");
		
	}

	@Override
	public void poultry() {
		System.out.println("I'm poultry");
		
	}

	@Override
	public void eat() {
		System.out.println("The chicken can eating worm...");
		
	}

	@Override
	public void breathe() {
		System.out.println("The chicken can breathe...");
		
	}

	@Override
	public void sleep() {
		System.out.println("The chicken can sleeping...");
		
	}
	
	public void overall(){
		poultry();
		biting();
		running();
		flying();
		eat();
		breathe();
		sleep();
	}

}
