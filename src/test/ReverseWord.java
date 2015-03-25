package test;

import java.util.Scanner;

public class ReverseWord {
	
	public static String reverse(String word){
		
		if (word.length() == 0){
			return word;
		}

	    return reverse(word.substring(1)) + word.charAt(0);
	}
	
	public static void main(String agrs[]){
		
//		 String word = "Hello";
//		 String o = "";
//		 for(int i = word.length()-1;i>=0;i--){
//			 char c = word.charAt(i);
//			 o += c;
//		 }
//		System.out.println("Original : "+str);
//		System.out.print("Reverse : "+ o);
		
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
//		String word = "Hello";
		String str = reverse(word);
		
		
		System.out.println("Original : " + word);
		System.out.println("Reverse  : " + str);
	}

}
