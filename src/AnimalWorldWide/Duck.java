package AnimalWorldWide;

public class Duck extends Poultry implements Fly,Swim,Run,Bite{

	public void biting() {
		System.out.println("The duck can biting you...");
		
	}

	public void running() {
		System.out.println("The duck can run to hit the dog...");
		
	}

	public void swimming() {
		System.out.println("The duck can swimming for eating...");
		
	}

	public void flying() {
		System.out.println("The duck can fly but not too high...");
		
	}

	@Override
	public void poultry() {
		System.out.println("I'm poultry");
		
	}

	@Override
	public void eat() {
		System.out.println("The duck can eating vegetable...");
		
	}

	@Override
	public void breathe() {
		System.out.println("The duck can breathe...");
		
	}

	@Override
	public void sleep() {
		System.out.println("The duck can sleeping...");
		
	}
	
	public void overall(){
		poultry();
		biting();
		swimming();
		running();
		flying();
//		eat();
//		breathe();
//		sleep();
	}

}
