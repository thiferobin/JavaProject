package test;

public class DoWhileStatement {
	public static void main(String agrs[]){
		String[] month = {"January","February","March","April","May","June","July","August","September","Octorber","November","December"};
		
		int counter = 0;
		
		do{
			System.out.println(month[counter]);
			counter++;
		}while(counter < month.length);
	}
}
