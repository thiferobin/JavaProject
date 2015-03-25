package Enum;

public class EnumDemo {

	public static void main(String[] args) {
		String day = "1";

		getDay(day);
		
//		for(Day objDay : Day.values()){
//			System.out.println(objDay.toString());
//		}
		
		Day dayEnum = Day.SATURDAY;
		
		System.out.println(dayEnum);
		System.out.println(dayEnum.getValue());

	}

	public static String getDay(String day) {
		if (day.equals("1")) {
			return "Sunday";
		} else if (day.equals("2")) {
			return "Monday";
		} else if (day.equals("3")) {
			return "Tuesday";
		} else if (day.equals("4")) {
			return "Wednesday";
		} else if (day.equals("5")) {
			return "Thursday";
		} else if (day.equals("6")) {
			return "Friday";
		} else if (day.equals("7")) {
			return "Saturday";
		} else {
			return "Don't know";
		}
		
		
	}

}

enum Day {
	SUNDAY(1),MONDAY(2),TUESDAY(3),WEDNESDAY(4),THURSDAY(5),FRIDAY(6),SATURDAY(7);
	
	private int value;
	
	private Day(int value){
		this.value = value;
	}
	
	public int getValue(){
		return value;
	}
}
