package com.lesson2;

public class Cat {
	private String name;
	private String color;
	private int age;

	public Cat(String name, String color, int age) {
		super();
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public Cat() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void up(int h) {
		System.out.println("I jump " + h + " cm");
	}

	public String getVoice() {
		if (age > 1) {
			return "Muuuuur";
		} else {
			return "may";
		}
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", color=" + color + ", age=" + age + "]";
	}

	
}
