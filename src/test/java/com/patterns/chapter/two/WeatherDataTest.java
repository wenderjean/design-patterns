package com.patterns.chapter.two;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import java.util.Observable;
import java.util.Observer;

import org.junit.Test;

public class WeatherDataTest {

	private Observable weatherData = new WeatherData();
	private Observer currentConditionDisplay;
	
	@Test
	public void shouldHaveAnEmptyListOfObservers() {
		isEmptyTest();
	}
	
	@Test
	public void shouldAddANewObserver() {
		currentConditionDisplay = new CurrentConditionDisplay(weatherData);
		assertThat(weatherData.countObservers(), greaterThan(0));
	}
	
	@Test
	public void shouldRemoveAnObserver() {
		weatherData.deleteObserver(currentConditionDisplay);
		isEmptyTest();
	}
	
	@Test
	public void changedShouldBeFalse() {
		assertThat(weatherData.hasChanged(), is(Boolean.FALSE));
	}
	
	public void isEmptyTest() {
		assertThat(weatherData.countObservers(), equalTo(0));
	}
}
