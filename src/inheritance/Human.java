package inheritance;

public class Human extends Life{
	public Human(){
		System.out.println("Human");
	}
	
	public Human(String name){
		super(name);
		System.out.println(name);
	}

}
