package test;

import java.util.Scanner;

public class Grade {
	public static void main(String agrs[]){
//		int point = 50;
		String grade=null;
		System.out.println("Input score : ");
		Scanner sc = new Scanner(System.in);
		int point = sc.nextInt();
		
//		System.out.println(point);
		
//		if(point <= 100 && point >= 90){
//			System.out.println("Grade : A");
//		}else if(point <= 89 && point >= 80){
//			System.out.println("Grade : B");
//		}else if(point <= 79 && point >= 70){
//			System.out.println("Grade : C");
//		}else if(point <= 69 && point >= 50){
//			System.out.println("Grade : D");
//		}else{
//			System.out.println("Grade : F");
//		}
		
		switch(point/10){
		case 10:
			grade = "Grade : A";
			break;
		case 9:
			grade = "Grade : A";
			break;
		case 8:
			grade = "Grade : B";
			break;
		case 7:
			grade = "Grade : C";
			break;
		case 6:
			grade = "Grade : D";
			break;
		case 5:
			grade = "Grade : D";
			break;
		case 4:
			grade = "Grade : F";
			break;
		case 3:
			grade = "Grade : F";
			break;
		case 2:
			grade = "Grade : F";
			break;
		case 1:
			grade = "Grade : F";
			break;
		case 0:
			grade = "Grade : F";
			break;
		}
		
		System.out.println(grade);
	}

}
