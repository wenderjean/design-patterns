package com.patterns.chapter.one;

public class DecoyDuck extends Duck {
	
	public DecoyDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new MuteQuack();
	}
	
	@Override
	public String display() {
		return "Looks like a decoy duck";
	}
}
