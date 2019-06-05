package day55_abstraction;

import day54_muhtar_inheritancereview.this_Super;

public abstract class Animal {
	private String name;
	
	
	
	public abstract void speak(); //abstract method
	
	public abstract void eat();  //abstract method
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
}
