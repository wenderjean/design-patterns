package com.patterns.chapter.one;

public class MallardDuck extends Duck {

	public MallardDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
	
	@Override
	public String display() {
		return "Looks like a Mallard duck";
	}
}
