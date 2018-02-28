package com.homework2;

import java.util.Arrays;

public class ArraytoString {

	public static void main(String[] args) {
		int[] a = { 32, 2, 12, 4, 5, 34, 7, 8, 56, 0 };
		System.out.println("How it should be: ");
		System.out.println(Arrays.toString(a));
		System.out.println("Result of method: ");
		System.out.println(arrayIntToString(a));

	}

	public static String arrayIntToString(int[] a) {
		String resultString = "[";
		//System.out.println("[");
		for (int i = 0; i < a.length; i++) {
			if (i==a.length-1) {
				resultString += a[i] + "]"; 
				break;}
			resultString += a[i]+", "; 
			
		}
		return resultString;
	}

}
