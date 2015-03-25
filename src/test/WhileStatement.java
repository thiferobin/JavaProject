package test;

public class WhileStatement {
	
	public static void main(String agrs[]){
		String[] month = {"January","February","March","April","May","June","July","August","September","Octorber","November","December"};
		
		int counter = 0;
		while(counter < month.length){
			System.out.println(month[counter]);
			counter++;
		}
	}

}
