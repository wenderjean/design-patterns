package com.patterns.chapter.four;

public abstract class PizzaStore {
	
	public final Pizza order(PizzaType type) {
		Pizza pizza = create(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

	public abstract Pizza create(PizzaType type);
}
