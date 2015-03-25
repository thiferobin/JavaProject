package Annonymous;

public class MouseApp {
	public static void main(String[] args) {
		Mouse mouse = new Mouse();
		mouse.click();
		
		
		//annonymous class
		Mouse mouseAnnonymouse = new Mouse(){
			public void click(){
				System.out.println("I'm click mouse...");
			}
		};
		
		mouseAnnonymouse.click();
		
		DoubleClick doubleClick = new DoubleClick() {
			
			public void DoubleClick() {
				System.out.println("I'm click click...");
				
			}
		};
		
		doubleClick.DoubleClick();
	}
}

interface DoubleClick{
	public void DoubleClick();
}