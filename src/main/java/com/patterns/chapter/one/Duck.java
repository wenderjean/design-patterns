package com.patterns.chapter.one;

public abstract class Duck {

	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

		public String performFly() {
		return flyBehavior.fly();
	}

	public String performQuack() {
		return quackBehavior.quack();
	}

	public String swim() {
		return "All ducks float, even decoys";
	}
	
	public abstract String display();
}
