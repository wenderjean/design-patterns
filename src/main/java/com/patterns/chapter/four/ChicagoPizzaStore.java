package com.patterns.chapter.four;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	public Pizza create(PizzaType type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
		
		if(PizzaType.CHEESE.equals(type)) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Cheese Pizza");
		} else if(PizzaType.PEPPERONI.equals(type)) {
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("Chicago Pepperoni Pizza");
		} else if(PizzaType.CLAM.equals(type)) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Chicago Clam Pizza");
		} else if(PizzaType.VEGGIE.equals(type)) {
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("Chicago Veggie Pizza");
		}
		
		return pizza;
	}
}
