package test;

public class Sum {
	public static void main(String agrs[]){
		int[] numbers = new int[100];
		int sum=0;
		int sumE=0;
		int sumO=0;
		int count=0;
		int count1=0;

		for (int i=1;i<=100;i++){
			numbers[i-1]=i;
		}
		
		for (int values : numbers){
			
			if (values%2==0){
				sumE += values;
				count++;
				
			}else{
				sumO += values;
				count1++;
			}
			sum += values;
			
		}
		
		System.out.println("Sum = "+sum);
		System.out.println("Even = "+sumE);
		System.out.println("Avg of Even = "+sumE/count);
		System.out.println("Odd = "+sumO);
		System.out.println("Avg of Odd = "+sumO/count1);
		System.out.println("Avg = "+sum/numbers.length);
	}

}
