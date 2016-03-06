package com.patterns.chapter.one;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class DecoyDuckTest {
	
	private Duck duck = new DecoyDuck();

	@Test
	public void shouldQuack() {
		assertThat("Not Quack", equalTo(duck.quack()));
	}
	
	@Test
	public void shouldFly() {
		assertThat("Not Fly", equalTo(duck.fly()));
	}
	
	@Test
	public void shouldLookLikeAMallardDuck() {
		assertThat("Looks like a decoy duck", equalTo(duck.display()));
	}
	
	@Test
	public void shouldSwim() {
		assertThat("All ducks float, even decoys", equalTo(duck.swim()));
	}
}
