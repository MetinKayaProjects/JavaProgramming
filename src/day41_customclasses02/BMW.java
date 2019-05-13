package day41_customclasses02;

import java.util.*;

public class BMW {
	
	
	String make = "BMW";
	String model;
	double price;
	 
	/*Methods
	 * showPrice
	 * 330i - 40,250
	 * 740i - 86,450
	 * m3 - 66,500
	 */
	 public void showPrice() {
		if (model.equalsIgnoreCase("330i")) {
			System.out.println("BMW "+ model + " Price: " + price);
		}else if (model.equalsIgnoreCase("740i")) {
			System.out.println("BMW "+ model + " Price: " + price);
		}else if (model.equalsIgnoreCase("m3")) {
			System.out.println("BMW "+ model + " Price: " + price);
		}else {
			System.out.println("This model is not in the envantory");
		}
	}

// 	public void showPrice() {
//		switch(model) {
//		case "330i":
//			price = 40250;
//			break;
//		case "740i":
//			price = 86450;
//			break;
//		case "m3":
//			price = 66500;
//			break;
//		default:
//			System.out.println(model + " is not available");
//			price = 0.0;
//		}
//		System.out.println("Price: " + price);
//	}
 
}
