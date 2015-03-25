package Annonymous;

public class People {
	DoubleClick doubleClick;

	public DoubleClick getDoubleClick() {
		return doubleClick;
	}

	public void setDoubleClick(DoubleClick doubleClick) {
		this.doubleClick = doubleClick;
	}
	
	public void doSomething(){
		doubleClick.DoubleClick();
	}
	
	public static void main(String[] args) {
		People people = new People();
		people.setDoubleClick(new DoubleClick() {
			
			public void DoubleClick() {
				System.out.println("People double click...");
				
			}
		});
		
		people.doSomething();
	}
}
