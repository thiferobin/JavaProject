package AnimalWorldWide;

import java.util.Scanner;

public class CheckAnimal {

	public static void main(String[] args) {
		
		boolean count = true;
		while(count != false){
			System.out.println("Which animals do you want to select?");
			System.out.println("(1) Bird, (2) Dog, (3) Cat, (4) Fish, (5) Chicken, (6) Duck, (0) Exit : ");
			
			Scanner sc = new Scanner(System.in);
			int select = sc.nextInt();
			
			if(select == 1){
				System.out.println("I AM A BIRD");
				Bird bird = new Bird();
				bird.overall();
				Animal birds = new Bird();
				show(birds);
				
			}else if(select == 2){
				System.out.println("I AM A DOG");
				Dog dog = new Dog();
				dog.overall();
				Animal dogs = new Dog();
				show(dogs);
				
			}else if(select == 3){
				System.out.println("I AM A CAT");
				Cat cat = new Cat();
				cat.overall();
				Animal cats = new Cat();
				show(cats);
				
			}else if(select == 4){
				System.out.println("I AM A FISH");
				Fish fish = new Fish();
				fish.overall();
				Animal fishs = new Fish();
				show(fishs);
				
			}else if(select == 5){
				System.out.println("I AM A CHICKEN");
				Chicken chicken = new Chicken();
				chicken.overall();
				Animal chickens = new Chicken();
				show(chickens);
				
				
			}else if(select == 6){
				System.out.println("I AM A DUCK");
				Duck duck = new Duck();
				duck.overall();
				Animal ducks = new Duck();
				show(ducks);
				
			}else if(select == 0){
				count=false;
			}
			
		}
		System.out.println("Bye");
	}

	private static void show(Animal animal) {
		animal.eat();
		animal.breathe();
		animal.sleep();
		
	}

}
