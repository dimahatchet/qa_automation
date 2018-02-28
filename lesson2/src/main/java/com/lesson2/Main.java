package com.lesson2;

public class Main {

	public static void main(String[] args) {
		Cat cat0ne = new Cat("Vaska", "White", 5);
		
		System.out.println(cat0ne);
		
		cat0ne.up(50);
		
		String voice = cat0ne.getVoice();
		System.out.println(voice);
		
	
		
		cat0ne.setAge(0);
		System.out.println(cat0ne);
		voice = cat0ne.getVoice();
		System.out.println(voice);
	}
	
}
