package inheritance;

import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {
		System.out.println("Put your number : ");

		Scanner scW = new Scanner(System.in);
		double w = scW.nextDouble();
		Scanner scH = new Scanner(System.in);
		double h = scH.nextDouble();
		System.out.println("W : " + w + " , " + "H : " + h);
		Rectangle rt = new Rectangle(w, h);
		rt.area();

		System.out.println("Rectangle result : " + rt.getAreaResult());

		Triangle tg = new Triangle(w, h);
		tg.area();

		System.out.println("Triangle result : " + tg.getAreaResult());
	}

}
