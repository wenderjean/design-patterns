package com.patterns.chapter.two;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, Display {

	private float pressure;
	private Observable observable;

	public ForecastDisplay(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			this.pressure = weatherData.getPressure();
		}
		display();
	}

	@Override
	public String display() {
		String message = "Current pressure: " + this.pressure + ".";
		System.out.println(message);
		return message;
	}
}
