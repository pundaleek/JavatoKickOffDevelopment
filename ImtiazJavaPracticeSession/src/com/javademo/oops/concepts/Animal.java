package com.javademo.oops.concepts;

public abstract class Animal {
	String animalName;
	int animalAge;
	int numberOfLegs;
	
	public Animal(String animalName, int animalAge, int numberOfLegs) {
		super();
		this.animalName = animalName;
		this.animalAge = animalAge;
		this.numberOfLegs = numberOfLegs;
	}

	public void animalActions(){
		System.out.println(animalName + " is very nice animal");
		System.out.println(animalName + "'s age is " + animalAge);
		System.out.println(animalName + " has " + numberOfLegs + " legs ");
	}
	
	public void animalEats(){
		System.out.println(animalName + " is veg animal");
	}
	
	public void animalRun(){
		System.out.println("running...");
	}
	
	public abstract void move();
}