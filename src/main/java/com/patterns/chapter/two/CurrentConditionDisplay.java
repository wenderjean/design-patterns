package com.patterns.chapter.two;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, Display {

	private float temperature;
	private float humidity;
	private Observable observable;
	
	public CurrentConditionDisplay(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}
	
	@Override
	public String display() {
		String message = "Current conditions: " + this.temperature + "F degrees and " 
				+ this.humidity + "% of humidity.";
		System.out.println(message);
		return message;
	}
}
