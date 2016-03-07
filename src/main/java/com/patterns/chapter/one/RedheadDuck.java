package com.patterns.chapter.one;

public class RedheadDuck extends Duck {
	
	public RedheadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
	
	@Override
	public String display() {
		return "Looks like a red head duck";
	}
}
