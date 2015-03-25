package test;

public class ForStatement {
	public static void main(String agrs[]){
		String[] month = {"January","February","March","April","May","June","July","August","September","Octorber","November","December"};
		int[] number = {1,2,3,4,5,6,7,8,9,10};
		
		for (int i=0;i<number.length;i++){
			if (number[i] <= 5){
				System.out.println(number[i]);
			}
		}
	}

}
