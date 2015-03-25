package test;

import java.util.Scanner;

public class fibonancial {
	static int total;
	static int first =0;
	static int second=1;
	public static void main(String agrs[]){
		System.out.print("Put value " );
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
//		int result = fib(s);
		
		for(int i=0;i<=s;i++){
			if(i<=1){
				total =i;
			}
			else{
				total = first+second;
				first = second;
				second = total;
			}
			System.out.println("fibo = "+total);
		}
		
//		int result=0;
//		System.out.println(total);
	}
	
//	public static int fib(int n) {
//        if (n < 2) {
//           return n;
//        }
//        else {
//        	return fib(n-1)+fib(n-2);
//        }
//	}

}
