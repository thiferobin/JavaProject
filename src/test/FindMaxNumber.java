package test;

public class FindMaxNumber {

	public static void main(String[] args) {
		int[] number = { 20, 2 ,3, 4, 25, 10, 15, 2 };
		int max = number[0];
		int min = number[0];

		for (int i = 1; i < number.length - 1; i++) {
			if (max < number[i]) {
				max = number[i];
			} else if (number[i] < min) {
				min = number[i];
			}
		}
		System.out.println("Max number in array is " + max);
		System.out.println("Min number in array is " + min);

	}

}
