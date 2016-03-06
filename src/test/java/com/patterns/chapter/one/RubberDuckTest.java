package com.patterns.chapter.one;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class RubberDuckTest {
	
	private Duck duck = new RubberDuck();

	@Test
	public void shouldQuack() {
		assertThat("Squeak", equalTo(duck.quack()));
	}
	
	@Test
	public void shouldNotFly() {
		assertThat("Not Fly", equalTo(duck.fly()));
	}
	
	@Test
	public void shouldLookLikeARubberDuck() {
		assertThat("Looks like a rubber duck", equalTo(duck.display()));
	}
	
	@Test
	public void shouldSwim() {
		assertThat("All ducks float, even decoys", equalTo(duck.swim()));
	}
}
