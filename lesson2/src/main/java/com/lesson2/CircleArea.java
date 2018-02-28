package com.lesson2;

public class CircleArea {
	public static void main(String[] args) {
		/*
		 * int a = 7; int b= 0;
		 * 
		 * System.out.println(div(a,b)); System.out.println("MAIN STOP!!!!");
		 */
		System.out.println(caclulateCircleArea(1));
		System.out.println(caclulateCircleArea(-1));
	}

	public static int div(int a, int b) {
		int c;
		try {
			c = a / b;
		} catch (ArithmeticException e) {
			e.printStackTrace();
			c = Integer.MAX_VALUE;
		}

		return c;
	}

	public static double caclulateCircleArea(double r) {
		if (r < 0) {
			throw new IllegalArgumentException("Negative redius");
		}
		double area = Math.PI * r * r;
		return area;
	}
}
