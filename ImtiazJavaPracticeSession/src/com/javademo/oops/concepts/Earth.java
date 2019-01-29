package com.javademo.oops.concepts;

public class Earth {
	public static void main(String[] args) {
		
		Human human1 = new Human("Tom", 33, 170, "Brown");
		Human human2 = new Human("Joe", 44, 180, "Black");
		Human human3 = new Human("Scott", 23, 150, "Red");
		
		human1.speak();
		System.out.println();
		human2.speak();
		System.out.println();
		human3.speak();
	}
}