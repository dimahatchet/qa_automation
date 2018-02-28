package com.homework2;

public class CounterOddNumbers {
	public static void main(String[] args) {
		int[] arr = { 0, 5, 2, 4, 7, 1, 3, 19 };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (!(arr[i] % 2 == 0)) {
				count += 1;
			}
		}
		System.out.println("Amount of odd numbers is: " + count);
	}

}
