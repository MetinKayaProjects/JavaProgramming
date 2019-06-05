package day40_customclasses_methods;

import java.util.Scanner;

public class CellPhone { //this is our class
//	this class will be called by BestBuy class
	
	//instance variables(instance|object variable: a variable that is declared in the class and outside any method):
	String brand; // null
	double screenSize;
	String color;
	double price;
	
//Behaviour (methods):
//	- call()
//	- message()
//	- takePicture()

	public void call() {
		System.out.println("Calling from " + brand);
	}
	
	public void message() {
		System.out.println("Sending text message from " + brand);
	}
	public void takeAPhoto() {
		System.out.println("Taking a photo....");
		
	}
	

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "CellPhone [brand=" + brand + ", screenSize=" + screenSize + ", color=" + color + ", price=" + price
				+ "]";
	}
	
	
	
	// now we will create the main method as a single method. After that we will not need this in here.
//	public static void main(String[] args) {
//		
//		CellPhone cell = new CellPhone();
//		cell.brand = "Iphone";
//		cell.screenSize = 7.8;
//		cell.color = "Grey";
//		cell.price = 800.00;
//		
//		System.out.println("Brand: " + cell.brand);
//		System.out.println("screenSize: " + cell.screenSize);
//		System.out.println("color: " + cell.color);
//		System.out.println("price: " + cell.price);
//		
//	}

}
