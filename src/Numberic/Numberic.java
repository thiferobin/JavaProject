package Numberic;

import java.util.Scanner;

public class Numberic {
	
	static int temp,million,hundredThousad,tenThousand,thousand,hundred,tens,digits;
	static String[] word = {"�ٹ��","˹��","�ͧ" ,"���","���","���" ,"ˡ","��","Ỵ" ,"���"};
	static String[] wordEng = {"","one","two" ,"three","four","five" ,"six","saven","eight" ,"nine","ten"};
	static String[] wordEng1 = {"fourteen","fifteen",""};
	static String strThai="",strEng="";
	
	public static String ans(int num){
		strEng = millionE(num)+hundredThousadE(num)+tenThousandE(num)+thousandE(num)+hundredE(num)+tensE(num)+digitsE(num);
		return strEng;
	}
	
	public static String calculate(int num){
		strThai = million(num)+hundredThousad(num)+tenThousand(num)+thousand(num)+hundred(num)+tens(num)+digits(num);
		
		return strThai;
	}
	
	public static String million(int num){
		million = num/1000000;
		if(million > 0){
			strThai = word[million]+"��ҹ";
		}
		return strThai;
	}
	
	public static String hundredThousad(int num){
		hundredThousad = (num/100000)%10;
		if(hundredThousad > 0){
			strThai = word[hundredThousad]+"�ʹ";
		}
		return strThai;
	}
	
	public static String tenThousand(int num){
		tenThousand = (num/10000)%10;
		if(tenThousand > 0){
			strThai = word[tenThousand]+"����";
		}
		return strThai;
	}
	
	public static String thousand(int num){
		thousand = (num/1000)%10;
		if(thousand > 0){
			strThai = word[thousand]+"�ѹ";
		}
		return strThai;
	}
	
	public static String hundred(int num){
		hundred = (num/100)%10;
		if(hundred > 0){
			strThai = word[hundred]+"����";
		}
		return strThai;
	}
	
	public static String tens(int num){
		tens =(num%100)/10;
		if(tens > 0){
			if(tens == 2){
				strThai = "����Ժ";
			}else if(tens == 1){
				strThai = "�Ժ";
			}else{
				strThai = word[tens]+"�Ժ";
			}
		}
		return strThai;
	}
	
	public static String digits(int num){
		digits = num%10;
		if(digits >= 0){
			if(tens != 0 && digits == 1){
				strThai = "���";
			}else if(tens == 0 || digits >1){
				strThai = word[digits];
			}
		}
		return strThai;
	}
	
	public static String millionE(int num){
		million = num/1000000;
		if(million > 0){
			strEng = wordEng[million]+" million ";
		}
		return strEng;
	}
	
	public static String hundredThousadE(int num){
		hundredThousad = (num/100000)%10;
		if(hundredThousad > 0){
			strEng = wordEng[hundredThousad]+" hundred ";
		}
		return strEng;
	}
	
	public static String tenThousandE(int num){
		tenThousand = (num/10000)%10;
		temp = (num/1000)%10;
		if(tenThousand > 3){
			strEng = wordEng[tenThousand]+"ty-"+wordEng[temp];
		}else if(tenThousand == 2){
			strEng = "twenty-"+wordEng[temp];
		}else if(tenThousand == 1 && temp == 1){
			strEng = "eleven";
		}else if(tenThousand == 1 && temp == 2){
			strEng = "twelve";
		}else if(tenThousand == 1 && temp == 3){
			strEng = "thirteen";
		}
		return strEng;
	}
	
	public static String thousandE(int num){
		tenThousand = num/10000;
		thousand = (num/1000)%10;
		hundred = (num/100)%10;
		if(thousand > 0){
			strEng = " thousand ";
		}else if(tenThousand == 0 && thousand == 0){
			strEng = wordEng[thousand]+" thousand ";
		}
		return strEng;
	}
	
	public static String hundredE(int num){
		thousand = (num/1000)%10;
		hundred = (num/100)%10;
		if(hundred > 0){
			strEng = wordEng[hundred]+" hundred ";
		}
		return strEng;
	}
	
	public static String tensE(int num){
		hundred = (num/100)%10;
		tens =(num%100)/10;
		digits = num%10;
		if(tens > 0){
			if(tens == 2){
				strEng = "twenty-";
			}else if(tens == 3){
				strEng = "thirty-";
			}else if(tens > 3){
				strEng = wordEng[tens]+"ty-";
			}else if(tens == 1 && digits == 1){
				strEng = "eleven";
			}else if(tens == 1 && digits == 2){
				strEng = "twelve";
			}else if(tens == 1 && digits == 3){
				strEng = "thirteen";
			}
		}
		return strEng;
	}
	
	public static String digitsE(int num){
		tens =(num%100)/10;
		digits = num%10;
		if(digits > 0 && tens == 0){
			strEng = wordEng[digits];
		}else if(digits == 1){
			strEng = "";
		}else if(digits == 2){
			strEng = "";
		}else if(digits == 3){
			strEng = "";
		}
		return strEng;
	}
	
	public static void main(String[] args){
//		int temp,million,hundredThousad,tenThousand,thousand,hundred,tens,digits;
		System.out.println("Please input the number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
//		Scanner sc1 = new Scanner(System.in);
//		String tag = sc1.next();
//		String[] word = {"�ٹ��","˹��","�ͧ" ,"���","���","���" ,"ˡ","��","Ỵ" ,"���"};
		
		System.out.println("input : " + num);
		System.out.println("Output : " + calculate(num));
		System.out.println("Output : " + ans(num));
		
//		million = num/1000000;
//		hundredThousad = (num/100000)%10;
//		tenThousand = (num/10000)%10;
//		thousand = (num/1000)%10;
//		hundred = (num/100)%10;
//		tens =(num%100)/10;
//		digits = num%10;
		
//		if(million > 0){
//			System.out.print(word[million]+"��ҹ");
//		}if(hundredThousad > 0){
//			System.out.print(word[hundredThousad]+"�ʹ");
//		}if(tenThousand > 0){
//			System.out.print(word[tenThousand]+"����");
//		}if(thousand > 0){
//			System.out.print(word[thousand]+"�ѹ");
//		}if(hundred > 0){
//			System.out.print(word[hundred]+"����");
//		}if(tens > 0){
//			if(tens == 2){
//				System.out.print("����Ժ");
//			}else if(tens == 1){
//				System.out.print("�Ժ");
//			}else{
//				System.out.print(word[tens]+"�Ժ");
//			}
//		}if(digits >= 0){
//			if(tens != 0){
//				System.out.println("���");
//			}else if(tens == 0){
//				System.out.println(word[digits]);
//			}
//		}
		
//		for(int i=0;i<=9;i++){
//			temp = num/1000;
//			if(temp == i && temp == 0){
//				System.out.print("");
//			}else if(num/1000 == i && temp == 1){
//				System.out.print("output : ˹�觾ѹ");
//			}else if(num/1000 == i && temp == 2){
//				System.out.print("output : �ͧ�ѹ");
//			}else if(num/1000 == i && temp == 3){
//				System.out.print("output : ����ѹ");
//			}else if(num/1000 == i && temp == 4){
//				System.out.print("output : ���ѹ");
//			}else if(num/1000 == i && temp == 5){
//				System.out.print("output : ��Ҿѹ");
//			}else if(num/1000 == i && temp == 6){
//				System.out.print("output : ˡ�ѹ");
//			}else if(num/1000 == i && temp == 7){
//				System.out.print("output : �紾ѹ");
//			}else if(num/1000 == i && temp == 8){
//				System.out.print("output : Ỵ�ѹ");
//			}else if(num/1000 == i && temp == 9){
//				System.out.print("output : ��Ҿѹ");
//			}
//		}
//		for(int i=0;i<=9;i++){
//			temp = (num/100)%10;
//			if(temp == i && temp == 0){
//				System.out.print("");
//			}else if(num/1000 == i && temp == 1){
//				System.out.print("˹������");
//			}else if(num/1000 == i && temp == 2){
//				System.out.print("�ͧ����");
//			}else if(num/1000 == i && temp == 3){
//				System.out.print("�������");
//			}else if(num/1000 == i && temp == 4){
//				System.out.print("�������");
//			}else if(num/1000 == i && temp == 5){
//				System.out.print("�������");
//			}else if(num/1000 == i && temp == 6){
//				System.out.print("ˡ����");
//			}else if(num/1000 == i && temp == 7){
//				System.out.print("������");
//			}else if(num/1000 == i && temp == 8){
//				System.out.print("Ỵ����");
//			}else if(num/1000 == i && temp == 9){
//				System.out.print("�������");
//			}
//		}
//		for(int i=0;i<=9;i++){
//			temp = (num%100)/10;
//			if(temp == i && temp == 0){
//				System.out.print("");
//				temp = num%10;
//				if(temp == 1){
//					System.out.print("˹��");
//				}
//			}else if(num/1000 == i && temp == 1){
//				System.out.print("�Ժ");
//			}else if(num/1000 == i && temp == 2){
//				System.out.print("����Ժ");
//			}else if(num/1000 == i && temp == 3){
//				System.out.print("����Ժ");
//			}else if(num/1000 == i && temp == 4){
//				System.out.print("����Ժ");
//			}else if(num/1000 == i && temp == 5){
//				System.out.print("����Ժ");
//			}else if(num/1000 == i && temp == 6){
//				System.out.print("ˡ�Ժ");
//			}else if(num/1000 == i && temp == 7){
//				System.out.print("���Ժ");
//			}else if(num/1000 == i && temp == 8){
//				System.out.print("Ỵ�Ժ");
//			}else if(num/1000 == i && temp == 9){
//				System.out.print("����Ժ");
//			}
//		}
//		for(int i=0;i<=9;i++){
//			temp = num%10;
//			if(temp == i && temp == 0){
//				System.out.print("");
//			}else if(num/1000 == i && temp == 1){
//				temp = (num%100)/10;
//				if(temp == 0){
//					System.out.print("");
//				}else if(temp != 0){
//					System.out.print("���");
//				}
////				System.out.print("���");
//			}else if(num/1000 == i && temp == 2){
//				System.out.print("�ͧ");
//			}else if(num/1000 == i && temp == 3){
//				System.out.print("���");
//			}else if(num/1000 == i && temp == 4){
//				System.out.print("���");
//			}else if(num/1000 == i && temp == 5){
//				System.out.print("���");
//			}else if(num/1000 == i && temp == 6){
//				System.out.print("ˡ");
//			}else if(num/1000 == i && temp == 7){
//				System.out.print("��");
//			}else if(num/1000 == i && temp == 8){
//				System.out.print("Ỵ");
//			}else if(num/1000 == i && temp == 9){
//				System.out.print("���");
//			}
//		}
	}

}
