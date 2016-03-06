package com.patterns.chapter.one;

public class DecoyDuck extends Duck {

	@Override
	public String quack() {
		return "Not Quack";
	}

	@Override
	public String fly() {
		return "Not Fly";
	}
	
	@Override
	public String display() {
		return "Looks like a decoy duck";
	}
}
