package test;

public class ForEachStatement {
	public static void main(String agrs[]){
		String[] month = {"January","February","March","April","May","June","July","August","September","Octorber","November","December"};
//		int[] numbers = {1,2,3,4,5};
		
//		for (String values : month){
//			if(values == "August"){
//				System.out.println("This is August!!");
//			}
//		}
		
		String str = new String("A");
		String str2 = new String("A");
		if(str == str2){
			System.out.println("str = str2 EQUAL!!");
		}else{
			System.out.println("str = str2 NO EQUAL!!");
		}
		
		if(str.equals(str2)){
			System.out.println("str(A) = str2(A) EQUAL!!");
		}else{
			System.out.println("str = str2 NO EQUAL!!");
		}
	}

}
