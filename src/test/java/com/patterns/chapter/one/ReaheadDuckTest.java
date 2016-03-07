package com.patterns.chapter.one;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class ReaheadDuckTest {
	
	private Duck duck = new RedheadDuck();

	@Test
	public void shouldQuack() {
		assertThat("Quack", equalTo(duck.performQuack()));
	}
	
	@Test
	public void shouldFly() {
		assertThat("Fly with wings", equalTo(duck.performFly()));
	}
	
	@Test
	public void shouldLookLikeARedheadDuck() {
		assertThat("Looks like a red head duck", equalTo(duck.display()));
	}
	
	@Test
	public void shouldSwim() {
		assertThat("All ducks float, even decoys", equalTo(duck.swim()));
	}
}
