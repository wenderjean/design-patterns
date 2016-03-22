package com.patterns.chapter.four;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class PizzaStoreTest {

	private PizzaStore store = new PizzaStore(new SimplePizzaFactory());
}
