package com.patterns.chapter.one;

public abstract class Duck {
	
	public String quack() {
		return "Quack";
	}
	
	public String fly() {
		return "Fly";
	}
	
	public abstract String display();
	
	public String swim() {
		return "All ducks float, even decoys";
	}
}
