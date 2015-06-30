//Define a class IntegerVector that has:
//
//* public void add(int e) method for adding an element to the vector
//* public int size() method that returns the size of the vector
//* public int sum() method that returns the sum of the numbers in the vector
//* public void addAll(int [] n) method that adds all the elements from n to the back of the vector
//* public int get(int index) method that returns the value of the element on place index
//* public String toString() method

package com.hackbulgaria.programming51.week3;

public class IntegerVector {
	private int capacity;
	public int[] data;
	private int current;
	
	//Default constructor
	public IntegerVector() {
		capacity = 10;
		current = 0;
		data = new int[capacity];
	}
	
	public void add(int number) {
		if (current == capacity) {
			data = resize(data);
		}
		
		data[current] = number;
		current++;
	}
	
	public int getLength() {
		return data.length;
	}
	
	private int[] resize(int[] a) {
		capacity = capacity * 2 + 1;
		
		int[] temp = new int[capacity];
		
		for (int i = 0; i < a.length; i++) {
			temp[i] = a[i];
		}
		
		return temp;
	}
	
	public String toString() {
		String str = "";
		for (int i = 0; i < current; i++) {
			str += data[i] + " ";
		}
		return str;
	}
	
	public int sum() {
		int result = 0;
		
		for (int i = 0; i < data.length; i++) {
			result += data[i];
		}
		return result;
	}
	
	public int[] addAll(int[] n) {
		int index = current;
		
		for (int i = 0; i < n.length; i++) {
			if (index >= capacity) {
				data = resize(data);
			}
			data[index] = n[i];
			index++;
		}
		return data;
	}
	
	public int get(int index) {
		return data[index];
	}

}
