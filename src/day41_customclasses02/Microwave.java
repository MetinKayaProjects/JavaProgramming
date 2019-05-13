package day41_customclasses02;

import java.util.*;
public class Microwave {

	String brand;
	boolean isOn; // false is default value for boolean (true=>on, false=> off)
	// how can we turn on a microwave

	public void turnOn() {
		if (isOn == true) { // Already on
			System.out.println(brand + " microwave is already ON");
		} else {
			System.out.println("Turning on " + brand + " microwave");
			isOn = true;
		}
	}

	//// how can we turn off a microwave
	public void turnOff() {
		if (isOn == false) { // Already on
			System.out.println(brand + " microwave is already OFF");
		} else {
			System.out.println("Turning OFF " + brand + " microwave");
			isOn = false;
		}
	}

	public void heat(String food) {
		if (isOn) {
			System.out.println("Heating the " + food);
		}else {
			System.out.println("Microwave is OFF, cannot heat " + food);
		}

	}

}
