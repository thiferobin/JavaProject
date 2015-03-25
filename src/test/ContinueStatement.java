package test;

public class ContinueStatement {
	public static void main(String agrs[]){
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		
		for (int values : numbers){
			if(values == 5){
				return;
			}
			System.out.println(values);
		}
	}

}
