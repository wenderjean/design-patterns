package com.patterns.chapter.two;

public class CurrentConditionDisplay implements Observer, Display {

	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.addObserver(this);
	}
	
	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	
	@Override
	public String display() {
		String message = "Current conditions: " + this.temperature + "F degrees and " 
				+ this.humidity + "% of humidity.";
		System.out.println(message);
		return message;
	}
}
