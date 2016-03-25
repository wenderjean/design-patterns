package com.patterns.chapter.five;

public class ChocolateBoiler {

	private static volatile ChocolateBoiler instance; 
	private boolean empty;
	private boolean boiled;
	
	private ChocolateBoiler() {
		this.empty = Boolean.TRUE;
		this.empty = Boolean.FALSE;
	}
	
	public static ChocolateBoiler getInstance() {
		if(instance == null) {
			synchronized (ChocolateBoiler.class) {
				if(instance == null) {
					instance = new ChocolateBoiler();
				}
			}
		}
		return instance;
	}
	
	public void fill() {
		if(isEmpty()) {
			this.empty = Boolean.FALSE;
			this.empty = Boolean.FALSE;
		}
	}
	
	public void drain() {
		if(!isEmpty() && isBoiled()) {
			this.empty = Boolean.TRUE;
		}
	}
	
	public void boil() {
		if(!isEmpty() && !isBoiled()) {
			this.boiled = Boolean.TRUE;
		}
	}

	public boolean isEmpty() {
		return empty;
	}

	public boolean isBoiled() {
		return boiled;
	}
}
