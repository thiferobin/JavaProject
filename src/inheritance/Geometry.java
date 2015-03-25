package inheritance;

public abstract class Geometry {

	private double width;
	private double hight;
	private double areaResult;

	public Geometry(double width, double hight) {
		this.width = width;
		this.hight = hight;
	}

	public abstract void area();
	public abstract void test();

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHight() {
		return hight;
	}

	public double getAreaResult() {
		return areaResult;
	}

	public void setAreaResult(double areaResult) {
		this.areaResult = areaResult;
	}

	public void setHight(double hight) {
		this.hight = hight;
	}

}
