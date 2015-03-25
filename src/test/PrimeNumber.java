package test;

public class PrimeNumber {
	public static void main(String args[]) {

		for (int i = 1; i <= 100; i++) {
			if (i == 1) {
				continue;
			} else if (i % 2 == 0 && i != 2) {
				continue;
			} else if (i % 3 == 0 && i != 3) {
				continue;
			} else if (i % 5 == 0 && i != 5) {
				continue;
			} else if (i % 7 == 0 && i != 7) {
				continue;
			}
			System.out.println(i);
		}
	}

}
