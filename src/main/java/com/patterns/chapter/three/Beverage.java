package com.patterns.chapter.three;

public abstract class Beverage {
	
	protected String description;
	
	public String getDescription() {
		return description;
	}
	
	public abstract float cost();
}
