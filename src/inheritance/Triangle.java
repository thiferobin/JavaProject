package inheritance;

public class Triangle extends Geometry{
	
	public Triangle(double width, double hight){
		super(width, hight);
	}
	
	@Override
	public void area() {
		setAreaResult(getWidth()*getHight()/2);
		
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
}
