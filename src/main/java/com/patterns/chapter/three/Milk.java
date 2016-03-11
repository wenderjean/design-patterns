package com.patterns.chapter.three;

public class Milk extends CondimentDecorator {
	
	private Beverage beverage;

	@Override
	public float cost() {
		return 0;
	}
}
