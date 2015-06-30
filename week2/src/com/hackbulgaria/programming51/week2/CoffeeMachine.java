//In a com.hackbulgaria.programming51.week2 package create a CoffeeMachine class, 
//where you have the following attributes:
//
//Coffee[] brandsOfCoffee - an array for Coffee. One coffee machine can hold up to 10 brands of coffee.
//float balance - the current money balance in the coffee machine.
//And the following methods:
//
//Create method for adding Coffee in the machine - public boolean addCoffee(Coffee coffee). 
//The method should return true if you can add that coffee type to the machine. Otherwise, 
//return false (more than 10 cups are added)
//Create method for buying Coffee from the Coffee Machine public float buyCoffee(String brand, 
//float price). This method recieves coffee brand and money given by the buyer. 
//If the coffee brand exsists in brandsOfCoffee - return the change. 
//If it doesn't - return -1. The amounts of coffee we can buy, for now, is unlimited.

package com.hackbulgaria.programming51.week2;

public class CoffeeMachine {

	private Coffee[] coffeeMachine;
	private int capacity;
	private int current = 0;
	private float balans = 0;

	// Default constructor
	public CoffeeMachine() {
		capacity = 10;
		coffeeMachine = new Coffee[capacity];
	}

	public CoffeeMachine(int capacity) {
		this.capacity = capacity;
		coffeeMachine = new Coffee[capacity];
	}
	
	private boolean hasCoffee(Coffee coffee) {
		for (int i = 0; i < current; i++) {
			if (coffeeMachine[i].getBrand().equals(coffee.getBrand())) {
				return true;
			}
		}
		return false;
	}

	public boolean addCoffee(Coffee coffee) {
		if (current == capacity) {
			return false;
		}
		if (hasCoffee(coffee)) {
			return false;
		}
		coffeeMachine[current] = coffee;
		current++;
		return true;
	}

	public String toString() {
		String result = "";
		for (int i = 0; i < current; i++) {
			result += coffeeMachine[i].getBrand() + " " + coffeeMachine[i].getPrice() + "\n";
		}
		return result;
	}
	
	public float getBalans() {
		return balans;
	}
	

	public float buyCoffee(String name, float price) {
		for (int i = 0; i < capacity; i++) {
			if (coffeeMachine[i].getBrand().equals(name)) {
				balans += coffeeMachine[i].getPrice();
				
				if (coffeeMachine[i].getPrice() < price) {
					return (float) (price - coffeeMachine[i].getPrice());
				}
				return -1;
			}
			return -1;
		}
		return -1;
	}
}
