package com.patterns.chapter.four;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class NYPizzaStoreTest {

	private PizzaStore store = new NYPizzaStore();
	private Pizza pizza;
	
	@Test
	public void shouldMakeACheesePizza() {
		pizza = store.order(PizzaType.CHEESE);
		assertThat(pizza.getClass(), equalTo(CheesePizza.class));
		testPizzaName("NYStyle Cheese Pizza");
	}
	
	@Test
	public void shouldMakeAPepperoniPizza() {
		pizza = store.order(PizzaType.PEPPERONI);
		assertThat(pizza.getClass(), equalTo(PepperoniPizza.class));
		testPizzaName("NYStyle Pepperoni Pizza");
	}
	
	@Test
	public void shouldMakeAClamPizza() {
		pizza = store.order(PizzaType.CLAM);
		assertThat(pizza.getClass(), equalTo(ClamPizza.class));
		testPizzaName("NYStyle Clam Pizza");
	}
	
	@Test
	public void shouldMakeAVeggiePizza() {
		pizza = store.order(PizzaType.VEGGIE);
		assertThat(pizza.getClass(), equalTo(VeggiePizza.class));
		testPizzaName("NYStyle Veggie Pizza");
	}
	
	private void testPizzaName(String name) {
		assertThat(pizza.getName(), equalTo(name));
	}
}
