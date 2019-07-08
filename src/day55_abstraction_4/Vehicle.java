package day55_abstraction_4;

import java.util.ArrayList;

public abstract class Vehicle {
	private int wheels;
	private double price;
	private String type;
	private String powerSource;
	
	//constructor
	public Vehicle(int wheels, double price, String type, String powerSource) {
		
		this.wheels = wheels;
		this.price = price;
		this.type = type;
		this.powerSource = powerSource;
	}
	//abstract method
	public abstract void move();
	
	
	//getter/setter
	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPowerSource() {
		return powerSource;
	}

	public void setPowerSource(String powerSource) {
		this.powerSource = powerSource;
	}
	
	
	

}
