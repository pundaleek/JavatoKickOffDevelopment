package com.javademo.oops.concepts;

public class Human {
	
	String name;
	int age;
	int heightInInches;
	String eyeColor;
	
	
	
	public Human(String name, int age, int heightInInches, String eyeColor) {
		super();
		this.name = name;
		this.age = age;
		this.heightInInches = heightInInches;
		this.eyeColor = eyeColor;
	}

	public void speak(){
		System.out.println("Hello, my name is "+ name);
		System.out.println("I am "+ heightInInches + " inches tall");
		System.out.println("I am "+ age + " years old");
		System.out.println("My eye color is  "+ eyeColor);
	}
	
	public void eat(String name){
		System.out.println(name + " is eating...");
	}
	
	public void walk(String name){
		System.out.println(name + " is walking...");
	}
	
	public void work(String name){
		System.out.println(name + " is working...");
	}

}
