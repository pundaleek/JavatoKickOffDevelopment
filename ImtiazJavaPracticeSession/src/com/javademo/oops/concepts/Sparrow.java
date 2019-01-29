package com.javademo.oops.concepts;

public class Sparrow extends Bird implements Flyable{

	public Sparrow(String animalName, int animalAge, int numberOfLegs) {
		super(animalName, animalAge, numberOfLegs);

	}

	public void fly() {
		System.out.println("Sparrow flying high..");
		
	}
}