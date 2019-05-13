package day43_encapsulation_constructor;

public class Computer {
	/*Class Computer
	brand
	os
	price
	*/
	
	private String brand;
	private String os;
	private double price;
	
	
	
	//add a constructor
	public Computer() {  //constructor name should be same with class name
		System.out.println("Computer constructor...");
		brand = "unknown";
		os = "unknown";
	}
	
	public Computer(String brand, String os, double price) {
		System.out.println("In 3 args constructor...");
		this.brand = brand;  //since brand is private, then use this.
		this.os = os;
		this.price = price;
	}
	
	//click : seource > Generate to String
	@Override
	public String toString() {
		return "Computer [brand=" + brand + ", os=" + os + ", price=" + price + "]";
	}


	//getter setter: click seurce> Generate Getter and Setter
	public String getBrand() {
		return brand;
	}


	public String getOs() {
		return os;
	}


	public void setOs(String os) {
		this.os = os;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}

}

