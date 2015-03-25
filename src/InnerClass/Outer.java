package InnerClass;

public class Outer {
	
	private String thoughts = "My outer thoughts";
	
	class Inner {
		String innerThoughts = "My inner thoughts";
		void doStuff(){
			//inner object also has a kind of "outer this"
			//even for private data of outer class
			System.out.println(thoughts);
		}
	}
	static class Inner2{
		String innerStr = "My inner 2";
		
		void doStuff(){
			//inner object has its own "this"
			System.out.println(innerStr);
		}
	}
	
	public static void main(String[] args) {
		//instantiate me, the outer object
		Outer o = new Outer();
		
		//Inner i = new Inner();
		//No! Can't instantiate Inner by itself!
		
		Outer.Inner i = o.new Inner();
		//now I have my special inner object
		i.doStuff();
		//OK to call methods on inner object
		
		Inner2 inner2 = new Outer.Inner2();
		inner2.doStuff();
		
		
		
	}

}
