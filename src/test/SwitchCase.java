package test;

public class SwitchCase {
	public static void main(String agrs[]){
		int month = 1;
		String monthName = null;
		
		switch(month){
		case 1:
			monthName = "January";
			break;
		case 2:
			monthName = "February";
			break;
		case 3:
			monthName = "Invalid Values";
			break;
			
		}
		
		System.out.println("Month : " + monthName);
	}

}
