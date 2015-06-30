//In a com.hackbulgaria.programming51.week2 package create an AutoShop class where you:
//
//Contain an array of Auto
//Create a method for adding cars to the shop public void addCar(Auto)
//Create a method for finding the car in the shop with the top speed public Auto getTopSpeed()
//Create a method for printing all the cars in AutoShop. Brand, Max Speed, Price, Owner

package com.hackbulgaria.programming51.week2;

public class AutoShop {

	private Auto[] autoShop;
	private int capacity;
	private int current = 0;
	
	//Default constructor
	public AutoShop () {
		capacity = 10;
		autoShop = new Auto[capacity];
	}
	
	public AutoShop (int capacity) {
		this.capacity = capacity;
		autoShop = new Auto[capacity];
	}
	
	public void addAuto(Auto auto) {
		if (current == capacity) {
			System.out.println("Your autohouse is full");
		} else {
		
			autoShop[current] = auto;

			System.out.println(autoShop[current].getBrand() + " " + autoShop[current].getName() + " was added to your shop.");
		
			current++;
		}
	}
	
	public Auto getTopSpeed() {
		int maxSpeed = autoShop[0].getMaxSpeed();
		int index = 0;
		
		for (int i = 0; i < capacity; i++) {
			if (autoShop[i].getMaxSpeed() > maxSpeed) {
				maxSpeed = autoShop[i].getMaxSpeed();
				index = i;
			}
		}
		return autoShop[index];
	}
	
	public void printAutoShop() {
		if (current < capacity) {
			for (int i = 0; i <= current; i++) {
				System.out.println(autoShop[i] + "\n\n");
			}
		} else {
			for (int i = 0; i < capacity; i++) {
				System.out.println(autoShop[i] + "\n\n");
			}
		}
	}
}
