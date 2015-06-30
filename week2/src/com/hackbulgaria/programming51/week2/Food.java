//Define the following:
//
//* name
//* type - "Milk", "Sweet", "Vegetable", "Fruit", "Bevarage"
//* weight - in grams
//* Proper constructors
//* public String toString() method

package com.hackbulgaria.programming51.week2;

public class Food {

	private String name;
	//private String[] types = {"milk", "Sweet", "Vegetable", "Fruit", "Beverage"};
	private String type;
	private int weight;
	
	public Food(String name, String type, int weight) {
		this.name = name;
		this.type = type;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public String toString() {
		return name + " " + "-" + " " + type + ":" + " " + weight;
	}
}
