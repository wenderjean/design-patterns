package com.patterns.chapter.three;

public class Whip extends CondimentDecorator {
	
	private Beverage beverage;

	@Override
	public float cost() {
		return 0;
	}
}
