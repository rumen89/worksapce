package com.hackbulgaria.programming51.week2;

public class Person {

	private String firstName;
	private String lastName;
	private int age;
	
	//Default constructor
	public Person () {}
	
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public void addFirstName(String name) {
		firstName = name;
	}
	
	public void addLastName(String name) {
		lastName = name;
	}
	
	public void addAge (int age) {
		this.age = age;
	}
	
	public String getFullName() {
		return firstName + " " + lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	public String toString() {
		return firstName + " " + lastName + " " + age;
	}
}
