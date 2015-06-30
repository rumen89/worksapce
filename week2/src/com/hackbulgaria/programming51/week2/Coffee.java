//In a com.hackbulgaria.programming51.week2 package create a Coffee class, where you:
//
//Define attributes for Coffee that have brand and price Think about their types.
//Make several objects of type Coffee and print them.
//Define public String toString() {} for Coffee.

package com.hackbulgaria.programming51.week2;

public class Coffee {
	private String brand;
	private double price;

	// Default constructor
	public Coffee() {
		brand = "ubnamed";
		price = 0.00f;
	}

	public Coffee(String brand, double d) {
		this.brand = brand;
		this.price = d;
	}

	public Coffee(float price, String brand) {
		this.price = price;
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public double getPrice() {
		return price;
	}

	public String toString() {
		return brand + " " + price;
	}
}
