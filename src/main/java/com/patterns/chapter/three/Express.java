package com.patterns.chapter.three;

public class Express extends Beverage {

	public Express() {
		description = "Express";
	}
	
	@Override
	public double cost() {
		return 1.99;
	}
}
