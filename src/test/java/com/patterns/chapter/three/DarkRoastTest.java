package com.patterns.chapter.three;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class DarkRoastTest {

	private Beverage beverage;
	
	@Before
	public void setUp() {
		beverage = new DarkRoast();
	}
	
	@Test
	public void rawDarkRoastShouldNameDarkRoastCoffee() {
		assertThat(beverage.getDescription(), equalTo("Dark Roast Coffee"));
	}
	
	@Test
	public void rawDarkRoastShouldCost99() {
		assertThat(beverage.cost(), equalTo(.99));
	}
	
	@Test
	public void darkRoastWithMilkShouldNameDarkRoastCoffeeMilk() {
		beverage = new Milk(beverage);
		assertThat(beverage.getDescription(), equalTo("Dark Roast Coffee, Milk"));
	}
	
	@Test
	public void darkRoastWithMilkShouldCost298() {
		beverage = new Milk(beverage);
		assertThat(beverage.cost(), equalTo(2.98));
	}
}
