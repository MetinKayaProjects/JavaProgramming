package day61_polymorphism_05_casting;
import java.util.Scanner;

import day49_inheritance02.TV;
import day57_interfaces.Tesla;
import day60_polymorphism_04_AppleDevice.*;;

public class MethodsUsingPolymorphism {
	public static void main(String[] args) {
		purchase( new Mac() );//AppleDevice ap = new Mac();
		
		AppleDevice dev = new AppleWatch();
		purchase(dev);
		
		givemeAnyObject(new String("hi"));
		givemeAnyObject(new Scanner(System.in));
		givemeAnyObject(new TV());
		givemeAnyObject(new Tesla());
		givemeAnyObject(55);//auto box to Integer
		int n = 33;
		givemeAnyObject(n);
		
		Object tv = new TV();
		Object str = new String("java");
		Object d = new AppleWatch();
		
		Object o = new Object();
		
		AppleDevice retDev=buildAppleDevice();
		retDev.use();
		
		( (IPad) buildAppleDevice() ).draw();
		
	}
	
	public static void purchase(AppleDevice ap) {
		System.out.println("Purchasing: " + ap.getClass().getSimpleName());
	}
	
	public static void givemeAnyObject(Object object) {
		System.out.println("You gave me: " + object.getClass().getSimpleName());
	}
	
	//Method buildAppleDevice, return type: AppleDevice
	public static AppleDevice buildAppleDevice() {
//		AppleDevice ap = new AppleWatch();
//		return ap;
		//we can return object from Mac, IPad, AppleWatch classes
		
		return new IPad();
	}
	
	/*
	 * You need to know inheritance hierarchy
	 * AppleDevice > IPad
	 *             > AppleWatch
	 *             > Mac
	 * By looking at the hierarchy above, it means we can write methods
	 * that return or accept AppleDevice and pass any Sub class object.
	 */
	
	public static AppleDevice buildDevice(String type) {
		if(type.equals("ipad")) {
			return new IPad();
		}else if(type.equals("mac")) {
			return new Mac();
		}else if(type.equals("applewatch")) {
			return new AppleWatch();
		}else {
			return null;
		}
	}
}

