package day56_abstraction_02_2;

import day54_muhtar_inheritancereview.this_Super;

public abstract class Mobile extends Phone {
	// since Mobile is also abstract so we don't need to override
	static String providerName;
	// public abstract void call();
	public abstract void text(String message);
	
	public abstract void takePicture();
	
	//constructor
	public Mobile(String providerName ) {
		this.providerName = providerName;
		System.out.println("(Mobile) provider comapny: " + this.providerName);
	}
//	method
	public boolean hasTouchScreen() {
		System.out.println("Mobile phones have touchScreen...");
		return true;
	}

}
