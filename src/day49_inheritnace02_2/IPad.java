package day49_inheritnace02_2;

import day49_inheritance02.Device;

//IPAD IS-A DEVICE ( IPad is a subclass in a different package)
public class IPad extends Device {
	
	public void readEBook(String title) {
		System.out.println("reading a book " + title + " using " + brand +
		 "  tablet.");
//		System.out.println("Price: " + price); //in visible price is default
		System.out.println("Model : " + model);
		
	}
	

}
