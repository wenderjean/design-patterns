package com.patterns.chapter.four;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class ChicagoPizzaStoreTest {

	private PizzaStore store = new ChicagoPizzaStore();
	private Pizza pizza;
	
	@Test
	public void shouldMakeACheesePizza() {
		pizza = store.order(PizzaType.CHEESE);
		assertThat(pizza.getClass(), equalTo(CheesePizza.class));
		testPizzaName("Chicago Cheese Pizza");
	}
	
	@Test
	public void shouldMakeAPepperoniPizza() {
		pizza = store.order(PizzaType.PEPPERONI);
		assertThat(pizza.getClass(), equalTo(PepperoniPizza.class));
		testPizzaName("Chicago Pepperoni Pizza");
	}
	
	@Test
	public void shouldMakeAClamPizza() {
		pizza = store.order(PizzaType.CLAM);
		assertThat(pizza.getClass(), equalTo(ClamPizza.class));
		testPizzaName("Chicago Clam Pizza");
	}
	
	@Test
	public void shouldMakeAVeggiePizza() {
		pizza = store.order(PizzaType.VEGGIE);
		assertThat(pizza.getClass(), equalTo(VeggiePizza.class));
		testPizzaName("Chicago Veggie Pizza");
	}
	
	private void testPizzaName(String name) {
		assertThat(pizza.getName(), equalTo(name));
	}
}
