package test;

import java.util.Scanner;

public class factorial {
	public static void main(String args[]){
		int i,sum=1;
		System.out.print("Put value " );
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
//		System.out.println(s);
		
//		if(s!=0){
//			for(i=1;i<=s;i++){
//			sum= i*sum;
//		
//			}
//		}
//		else if(s==0){
//			sum = 1;
//		}
		int result = fac(s);
		System.out.println(result);
	}
	
	public static int fac(int a){
		if (a == 0) {
	           return 1;
	       } else {
	           return a * fac(a - 1);
	       }
		
	}
}
