package day41_customclasses02;

import java.util.*;

public class Car {
//	 instance variable/attributes/properties/data:
//		 make
//		 model
//		 color
//		 currentSpeed
	String make;
	String model;
	String color;
	int currentSpeed;
	
	/* Methods-1:
	 * printCarInfo()
	 * 		"car make[make], model[model], color[color], currentSpeed[currentSpeed]"
	 */
	public void printCarInfo() {
		String info = "Car make [" + make + "], model [" + model + "], " + "color [" + color + "], " + "currentSpeed [" + currentSpeed +"]";
//		System.out.println("make [" + make + "], model [" + model + "], " + "color [" + color + "], " + "currentSpeed [" + currentSpeed +"]");
		System.out.println(info);
	}
	
//	Method-2:
//	 showCurrentSpeed
//			return type: void
//			param: int speedLimit
//			Print: "make is driving at currentSpeed, following speed limit - 55"
//			"make is driving at currentSpeed, over speed limit - 55"
	public void showCurrentSpeed(int speedLimit) {
		if (currentSpeed > speedLimit) {
			String str = make +  "is driving at " + currentSpeed + ", over  speed limit - " + speedLimit;
			System.out.println(str);
		
		}else {
			
			String str2 = make +  "is driving at " + currentSpeed + ", following  speed limit - " + speedLimit;
			System.out.println(str2);
		}
		
	}
	public void drive() {
		System.out.println(make +" " + model + " is driving.");
	}
	
	/*method name: accellerate
	 * reurn type : void
	 * params: int mph
	 * 
	 * increase current speed by value of mph
	 * accellerate(10); => 55=>65
	 * 55=>65
	 */
	public void accellerate(int mph) {
		
		System.out.println("mph : " + mph);   
		currentSpeed = currentSpeed + mph; 
	}

}
