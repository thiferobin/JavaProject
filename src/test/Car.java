package test;

public class Car {
	
//	String carName;
//	String carColor;
//	String stop;
//	String wheel;
//	
//	public Car(String name,String color){
//		carName = name;
//		carColor = color;
//	}
//	
////	public void wheel(){
////		System.out.println("My car have wheel");
////	}
//	
//	public void run(){
//		System.out.println("My car can run");
//	}
//	
//	public void stop(){
//		System.out.println("My car can stop");
//	}
//	
//	public String oil(int quantity){
////		System.out.println("My car can fill oil");
//		if(quantity < 20){
//			return "Please fill the oil now!!!";
//		}else if(quantity <70 && quantity >= 20){
//			return "Half of tank";
//		}else{
//			return "It's Full";
//		}
//	}
//	
//	public static void main(String agrs[]){
//		
//		Car car = new Car("Lamborghini","Black");
//		System.out.println("My Car name is " + car.carName);
//		System.out.println("My Car color is " + car.carColor);
//		car.run();
//		car.stop();
////	car.oil();
//		System.out.println(car.oil(90));
//	}
	
	///////////////////////////////////////////////////////////////////
	
	private String name;
	private String color;
	private String brand;
	private boolean hasBreak;
	int wheel;
	
	public Car(String brand){
		this.brand = brand;
	}
	
	public void drive(){
		System.out.println("Car is driving...");
	}
	
	public void breakCar(){
		System.out.println("Car is breaking...");
	}
	
	public String refuel(int oil){
		if (oil > 90){
			return "Full";
		}else if (oil > 50){
			return "Middle";
		}
		
		return "Empty";
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public boolean isHasBreak() {
		return hasBreak;
	}

	public void setHasBreak(boolean hasBreak) {
		this.hasBreak = hasBreak;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}

	public static void main(String agrs[]){
		Car car = new Car("Lamborghini");
		System.out.println("Brand car is : " + car.brand);
		car.drive();
		car.breakCar();
		System.out.println("Car refuel is : " + car.refuel(50));
//		car.setName("Honda");
		car.setBrand("Honda");
		car.setColor("Red");
		System.out.println("Car : " + car.getBrand());
		System.out.println("Car : " + car.getColor());
	}

}
