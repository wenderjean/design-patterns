package com.patterns.chapter.one;

public class RubberDuck extends Duck {
	
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}

	@Override
	public String display() {
		return "Looks like a rubber duck";
	}
}
