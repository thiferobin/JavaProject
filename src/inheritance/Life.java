package inheritance;

public class Life {
	public Life(){
		System.out.println("Life");
	}
	
	public Life(String name){
		System.out.println("Life is string");
	}
	
	public void eat(){
		System.out.println("eat in life.....");
	}
	
	public void eat(String name){
		System.out.println("eat " + name);
	}

}
