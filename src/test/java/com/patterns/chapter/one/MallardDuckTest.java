package com.patterns.chapter.one;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class MallardDuckTest {
	
	private Duck duck = new MallardDuck();

	@Test
	public void shouldQuack() {
		assertThat("Quack", equalTo(duck.performQuack()));
	}
	
	@Test
	public void shouldFly() {
		assertThat("Fly with wings", equalTo(duck.performFly()));
	}
	
	@Test
	public void shouldLookLikeAMallardDuck() {
		assertThat("Looks like a Mallard duck", equalTo(duck.display()));
	}
	
	@Test
	public void shouldSwim() {
		assertThat("All ducks float, even decoys", equalTo(duck.swim()));
	}
}
