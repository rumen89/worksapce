package com.hackbulgaria.programming51.week2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Coffee mocca = new Coffee("Mocca", 1.30);
//		
//		CoffeeMachine cm = new CoffeeMachine(3);
//		
//		//cm.addCoffee(mocca);
//
//		//cm.addCoffee(mocca);
//		System.out.println(cm.addCoffee(mocca));
//		System.out.println(cm.toString());
//		
//		System.out.println(cm.buyCoffee("Mocca", 2));
//		System.out.println("The balans is: " + cm.getBalans());
//		System.out.println(mocca);
		
//		Person rumen = new Person("Rumen", "Tsvetkov", 26);
//		//System.out.println(rumen);
//		
//		AutoShop autoShop = new AutoShop(3);
//		Auto ford = new Auto(rumen, "Ford", "Mondeo", 300, 50000);
//		
//		//System.out.println(ford);
//		
//		autoShop.addAuto(ford);
//		
//		Auto vw = new Auto(rumen, "Volkswagen", "Passat", 250, 70000);
//		
//		autoShop.addAuto(vw);
//		
//		Auto opel = new Auto(rumen, "Opel", "Astra", 260, 56000);
//		
//		autoShop.addAuto(opel);
//		
//		Auto renault = new Auto(rumen, "Renault", "Megane", 240, 40000);
//		
//		autoShop.addAuto(renault);
//		
//		autoShop.printAutoShop();
//		
//		System.out.println(autoShop.getTopSpeed());
		
		Food milk = new Food("Milk", "Milk", 1000);
		Food cheese = new Food("Cheese", "Milk", 300);
		Food beer = new Food ("Beer", "Beverage", 500);
		Food carrot = new Food ("Carrot", "Vegetable", 200);
		Food cake = new Food ("Cake", "Sweet", 200);
		
		Fridge fridge = new Fridge(10);
		
		System.out.println(fridge.addFood(milk));
		System.out.println(fridge.addFood(cheese));
		System.out.println(fridge.addFood(beer));
		System.out.println(fridge.addFood(carrot));
		System.out.println(fridge.addFood(cake));
		
		System.out.println(fridge.getFoodsCount());
		
		System.out.println(fridge.toString());
		System.out.println(fridge.getHeaviestFood());
		System.out.println(fridge.getProductsOfType("Milk"));
		System.out.println(fridge.getWeight());
	}

}
