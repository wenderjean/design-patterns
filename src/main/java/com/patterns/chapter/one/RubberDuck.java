package com.patterns.chapter.one;

public class RubberDuck extends Duck {
	
	@Override
	public String quack() {
		return "Squeak";
	}

	@Override
	public String fly() {
		return "Not Fly";
	}

	@Override
	public String display() {
		return "Looks like a rubber duck";
	}
}
