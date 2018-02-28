package com.homework2;

import java.util.Arrays;

public class LinearSearch {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("Array is:");
		System.out.println(Arrays.toString(a));
		System.out.println(searchNum(a, 6));
		System.out.println(searchNum(a, 15));

	}

	public static int searchNum(int[] a, int key) {
		int index = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				index = i;
				System.out.println("Index of found element is: ");
			}
		}
		return index;
	}

}
