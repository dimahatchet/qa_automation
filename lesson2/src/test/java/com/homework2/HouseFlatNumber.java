package com.homework2;

import java.util.Scanner;

public class HouseFlatNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter flat number:");
		int flatNumber = sc.nextInt();
		getFlatLocation(flatNumber);
		sc.close();
	}

	private static void getFlatLocation(int flatNumber) {

		if (flatNumber > 0 && flatNumber <= 144) {
			int entranceNumber = flatNumber / 36 + 1;
			System.out.println("The flat is in entrance number: " + entranceNumber);
			int floorNumber = ((flatNumber % 36) / 4) + 1;
			System.out.println("The flat is on the floor number: " + floorNumber);
		} else
			System.out.println("No such flat in the house");
	}
}
