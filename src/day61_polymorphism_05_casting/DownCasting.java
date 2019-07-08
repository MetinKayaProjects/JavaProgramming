package day61_polymorphism_05_casting;

import day60_polymorphism_04_AppleDevice.*;
public class DownCasting {
	public static void main(String[] args) {
		AppleDevice appDev = new IPad();
		//appDev can access use method, startingPrice variable
		appDev.use();
		//appDev.draw(); not accessible
		//how to call draw method from IPad
		IPad ipad = (IPad) appDev;
		ipad.use();
		ipad.draw();
		
		AppleDevice dev2 = new Mac();
		dev2.use();
		
		//1) using another reference variable
		Mac mac = (Mac)dev2;
		mac.code();
		System.out.println(mac.model);
		
		//2) cast and call in single statement
		((Mac)dev2).code();
		System.out.println( ((Mac)dev2).model );
		
		//String str = (String) dev2; not related with inheritance
	    
		double d = 123.45;
		int j = (int)d; //123
		
	}
}
