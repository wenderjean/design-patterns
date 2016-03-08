package com.patterns.chapter.two;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class WeatherDataTest {

	private Subject weatherData = new WeatherData();
	
	@Test
	public void shouldHaveAnEmptyListOfObservers() {
		isEmptyTest();
	}
	
	@Test
	public void shouldAddANewObserver() {
		weatherData.addObserver(new Observer() {
			@Override
			public void update(float temp, float umidity, float pressure) {
			}
		});
		
		assertThat(1, equalTo(weatherData.getObservers().size()));
	}
	
	@Test
	public void shouldRemoveAnObserver() {
		isEmptyTest();
	}
	
	public void isEmptyTest() {
		assertThat(Boolean.TRUE, equalTo(weatherData.getObservers().isEmpty()));
	}
}
