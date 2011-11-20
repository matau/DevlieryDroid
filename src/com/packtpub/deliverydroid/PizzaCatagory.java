package com.packtpub.deliverydroid;

public class PizzaCatagory {
	final String name;
	PizzaTopping[] toppings;
	
	public PizzaCatagory(String name, PizzaTopping... toppings) {
		this.name = name;
		this.toppings = toppings;
	}
}