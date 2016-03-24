package com.patterns.chapter.four;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza create(PizzaType type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		
		if(PizzaType.CHEESE.equals(type)) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("NYStyle Cheese Pizza");
		} else if(PizzaType.PEPPERONI.equals(type)) {
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("NYStyle Pepperoni Pizza");
		} else if(PizzaType.CLAM.equals(type)) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("NYStyle Clam Pizza");
		} else if(PizzaType.VEGGIE.equals(type)) {
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("NYStyle Veggie Pizza");
		}
		
		return pizza;
	}
}
