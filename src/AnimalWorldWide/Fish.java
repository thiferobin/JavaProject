package AnimalWorldWide;

public class Fish extends Aquatic implements Swim,Bite{

	public void biting() {
		System.out.println("The fish can biting small fish...");
		
	}

	public void swimming() {
		System.out.println("The fish can swimming in the sea...");
		
	}
	
	@Override
	public void aquatic() {
		System.out.println("I'm aquatic");
		
	}

	@Override
	public void eat() {
		System.out.println("The fish can eating plankton...");
		
	}

	@Override
	public void breathe() {
		System.out.println("The fish can breathe...");
		
	}

	@Override
	public void sleep() {
		System.out.println("The fish can sleeping...");
		
	}
	
	public void overall(){
		aquatic();
		biting();
		swimming();
//		eat();
//		breathe();
//		sleep();
	}

}
