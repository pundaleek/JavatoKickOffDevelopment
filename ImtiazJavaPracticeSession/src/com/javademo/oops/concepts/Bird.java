package com.javademo.oops.concepts;

public class Bird extends Animal{

	public Bird(String animalName, int animalAge, int numberOfLegs) {
		super(animalName, animalAge, numberOfLegs);
		
	}

	public void fly(){
		System.out.println("flying...");
	}

}
