package AnimalWorldWide;

public class Dog extends Terrestial implements Run, Bite, Swim {

	public void swimming() {
		System.out.println("The dog can swimming...");

	}

	public void biting() {
		System.out.println("The dog can biting you...");

	}

	public void running() {
		System.out.println("The dog can running from you...");

	}

	@Override
	public void eat() {
		System.out.println("The dog can eating...");

	}

	@Override
	public void breathe() {
		System.out.println("The dog can breathe...");

	}

	@Override
	public void sleep() {
		System.out.println("The dog can sleeping...");

	}

	@Override
	public void terrestial() {
		System.out.println("I'm terrestial");
	}

	public void overall() {
		terrestial();
		biting();
		running();
	}

}
