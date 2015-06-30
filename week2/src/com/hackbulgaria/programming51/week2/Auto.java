package com.hackbulgaria.programming51.week2;

public class Auto {
	private Person owner;
	private int maxSpeed;
	private String brand;
	private String name;
	private int price;

	public Auto() {
	}
	
	public Auto(Person person, String brand, String name, int maxSpeed, int price) {
		owner = person;
		this.brand = brand;
		this.name = name;
		this.maxSpeed = maxSpeed;
		this.price = price;
	}
	
	public Auto(Person person) {
		owner = person;
		maxSpeed = 0;
		brand = "None";
		name = "unnamed";
		price = 0;
	}
	
	public void addBrand(String brand) {
		this.brand = brand;
	}
	
	public void addName(String name) {
		this.name = name;
	}
	
	public void addMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public void addPrice(int price) {
		this.price = price;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getName() {
		return name;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String toString() {
		return brand + " " + name+ "\n" + "Owner: " + owner + "\n" + "Max Speed: " + maxSpeed + "\n" + "Price: " + price;
	}
}
