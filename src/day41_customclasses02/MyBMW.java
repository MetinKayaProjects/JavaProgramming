package day41_customclasses02;

public class MyBMW {
	public static void main(String[] args) {
		String make = "BMW";
		String model;
		double price;
		
		BMW myBmw1 = new BMW();
		myBmw1.model = "330i";
		myBmw1.price = 40250;
		
		BMW myBmw2 = new BMW();
		myBmw2.model = "740i";
		myBmw2.price = 86460;
		
		BMW myBmw3 = new BMW();
		myBmw3.model = "m3";
		myBmw3.price = 66500;
		
		
		myBmw1.showPrice();
		myBmw2.showPrice();
		myBmw3.showPrice();
		
		
		
		
//		 * showPrice
//		 * 330i - 40,250
//		 * 740i - 86,450
//		 * m3 - 66,500
	}

}
