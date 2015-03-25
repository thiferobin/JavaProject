package AnimalWorldWide;

public class Bird extends Poultry implements Fly, Run, Bite {

	public void biting() {
		System.out.println("The Bird can biting you...");

	}

	public void running() {
		System.out.println("The Bird can running into your home...");

	}

	public void flying() {
		System.out.println("The Bird can flying to sky...");

	}

	@Override
	public void poultry() {
		System.out.println("I'm poultry");

	}

	@Override
	public void eat() {
		System.out.println("The bird can eating worm...");

	}

	@Override
	public void breathe() {
		System.out.println("The bird can breathe...");

	}

	@Override
	public void sleep() {
		System.out.println("The bird can sleeping...");

	}

	public void overall() {
		poultry();
		biting();
		flying();
		running();
//		eat();
//		breathe();
//		sleep();
	}

}
