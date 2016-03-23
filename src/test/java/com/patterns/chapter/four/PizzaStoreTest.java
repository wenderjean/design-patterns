package com.patterns.chapter.four;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class PizzaStoreTest {

	private PizzaStore store = new PizzaStore(new SimplePizzaFactory());
	
	@Test
	public void shouldMakeACheesePizza() {
		assertThat(store.order("cheese").getClass(), equalTo(CheesePizza.class));
	}
	
	@Test
	public void shouldMakeAPepperoniPizza() {
		assertThat(store.order("pepperoni").getClass(), equalTo(PepperoniPizza.class));
	}
	
	@Test
	public void shouldMakeAClamPizza() {
		assertThat(store.order("clam").getClass(), equalTo(ClamPizza.class));
	}
	
	@Test
	public void shouldMakeAVeggiePizza() {
		assertThat(store.order("veggie").getClass(), equalTo(VeggiePizza.class));
	}
}
