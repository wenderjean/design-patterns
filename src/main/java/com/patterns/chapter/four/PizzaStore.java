package com.patterns.chapter.four;

public class PizzaStore {
	
	private SimplePizzaFactory factory;

	public PizzaStore(SimplePizzaFactory factory) {
		super();
		this.factory = factory;
	}
	
	public Pizza order(String type) {
		Pizza pizza = this.factory.create(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

}
