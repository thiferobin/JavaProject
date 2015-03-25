package test;

import java.util.Scanner;

public class Calculator {

	// int plus;
	// int minus;
	// int multiple;
	// int divide;

	int numX;
	int numY;
	int total;
	double totalD;

	public Calculator(int x, int y) {
		numX = x;
		numY = y;
	}

	public int plus(int x, int y) {
		total = x + y;
		return total;
	}

	public int minus(int x, int y) {
		total = x - y;
		return total;
	}

	public int multiple(int x, int y) {
		total = x * y;
		return total;
	}

	public Double divide(double x, double y) {
		totalD = x / y;
		return totalD;
	}

	public static void main(String[] args) {

		System.out.print("Please input the number : ");
		Scanner numX = new Scanner(System.in);
		Scanner numY = new Scanner(System.in);

		int numberX = numX.nextInt();
		int numberY = numY.nextInt();

		System.out.print("\n" + "What do you want do??(Please enter 1,2,3,4) : ");
		Scanner sc = new Scanner(System.in);

		int check = sc.nextInt();
		// System.out.println(check);

		Calculator cal = new Calculator(numberX, numberY);

		if (check == 1) {
			// cal.plus(4, 5);
			System.out.print("total : " + cal.plus(numberX, numberY));
		} else if (check == 2) {
			// cal.minus(4, 5);
			System.out.print("total : " + cal.minus(numberX, numberY));
		} else if (check == 3) {
			// cal.multiple(4, 5);
			System.out.print("total : " + cal.multiple(numberX, numberY));
		} else if (check == 4) {
			// cal.divide(4, 5);
			System.out.print("total : " + cal.divide(numberX, numberY));
		}

	}

}
