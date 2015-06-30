//* An array of Food
//* Capacity - maximum number of Foods in the fridge
//* Weight - maximum capacity of Fridge
//* Proper consructors
//* public boolean addFood(Food f) method to add food to your refrigerator
//* public int getFoodsCount() method to count the foods you've added
//* public String toString() method
//* public String [] getProductsOfType(String type) that returns all the Food of a certain type
//* public int getWeight() that returns the weight of the Fridge at the moment
//* public int getMaxWeight() that returns the maximum weight capacity of the Fridge
//* public Food getHeaviestFood() that returns the heaviest Food in the Fridge
//* public int getCapacity() that returns the capacity of the Fridge

package com.hackbulgaria.programming51.week2;

public class Fridge {

	private Food[] fridge;
	private int capacity;
	private int weight;
	private int current = 0;
	private String[] types = { "Milk", "Sweet", "Vegetable", "Fruit", "Beverage" };

	public Fridge() {
		capacity = 10;
		weight = 2000;
		fridge = new Food[capacity];
	}

	public Fridge(int capacity) {
		this.capacity = capacity;
		fridge = new Food[capacity];
		weight = 2000;
	}

	public Fridge(int capacity, int weight) {
		this.capacity = capacity;
		this.weight = weight;
		fridge = new Food[capacity];
	}

	private boolean hasType(String type) {
		int check = 0;

		for (int i = 0; i < 5; i++) {
			if (types[i].equals(type)) {
				check = 1;
			}
		}
		if (check == 1) {
			return true;
		}
		return false;
	}
	
	public boolean addFood(Food food) {
		if (hasType(food.getType())) {
			if (weight - food.getWeight() >= 0) {
				fridge[current] = food;
				weight -= food.getWeight();
				current++;
				return true;
			}
		}
		return false;
	}
	
	public int getFoodsCount() {
		return current;
	}
	
	public int getMaxWeight() {
		return weight;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public String toString() {
		String result = "";

		for (int i = 0; i < current; i++) {
			result += fridge[i] + "\n";
		}
		return result;
	}
	
	public String getProductsOfType(String type) {
		String result = "";
		
		for (int i = 0; i < current; i++) {
			if (fridge[i].getType().equals(type)) {
				result += fridge[i] + "\n";
			}
		}
		return result;
	}
	
	public int getWeight() {
		int result = 0;
		
		for (int i = 0; i < current; i++) {
			result += fridge[i].getWeight();
		}
		return result;
	}
	
	public Food getHeaviestFood() {
		int heaviest = fridge[0].getWeight();
		int index = 0;
		
		for (int i = 0; i < current; i++) {
			if (fridge[i].getWeight() > heaviest) {
				heaviest = fridge[i].getWeight();
				index = i;
			}
		}
		return fridge[index];
	} 
}
