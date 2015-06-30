package com.hackbulgaria.programming51.week3;

public class Main {

	public static void main(String[] args) {
		IntegerVector v = new IntegerVector();
		
		for (int i = 0; i < 30; i++) {
			v.add(i);
		}
		
		int[] n = new int[5];
		
		for (int i = 0; i < 5; i++) {
			n[i] = i;
		}
		
		System.out.println(v);
	}
}
