package inheritance;

public class Rectangle extends Geometry{
	
	
	public Rectangle(double width, double hight) {
		super(width, hight);
	}

	@Override
	public void area() {
		setAreaResult(getWidth() * getHight());
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

}
