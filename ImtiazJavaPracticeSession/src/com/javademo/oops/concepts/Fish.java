package com.javademo.oops.concepts;

public class Fish extends Animal{
	
	public Fish(String animalName, int animalAge, int numberOfLegs) {
		super(animalName, animalAge, numberOfLegs);
		
	}

	public void swim(){
		System.out.println("swimming...");
	}

}
