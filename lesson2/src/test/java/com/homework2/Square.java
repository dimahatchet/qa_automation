/*
 *  �������� �� ����� ������������� �� *. 
 *  ������ ������ � ������ �������������� �������� � ����������.
 */
package com.homework2;

import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		int h;
		int w;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height");
		h = sc.nextInt();
		System.out.println("Enter width");
		w = sc.nextInt();
		if (h > 0 && w > 0) {
			for (int i = 0; i < h; i += 1) {
				System.out.println("");
				for (int j = 0; j < w; j += 1) {
					if (j == 0 || j == w - 1 || i == 0 || i == h - 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
		} else
			System.err.println("Sides of square should be more then zero");
		sc.close();

	}

}
