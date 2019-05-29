package day40_customclasses_methods;

import java.util.Scanner;

public class CellPhone { //this is our class
//	this class will be called by BestBuy class
	String brand; // null
	double screenSize;
	String color;
	double price;
	

	public void call() {
		System.out.println("Calling .....");
	}
	
	public void message() {
		System.out.println("Sending text message.....");
	}
	public void takeAPhoto() {
		System.out.println("Taking a photo....");
		
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
