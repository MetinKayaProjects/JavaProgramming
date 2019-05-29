package day49_inheritnace02_2;

import day49_inheritance02.Device;

//non-subclass in differnt package
public class OverSeasFactory {
	public static void main(String[] args) {
		
		Device dv = new Device();
		dv.brand="Samsung";
//		dv.model = "333";  // unvisible. protected
//		dv.price = 200; //inc=visible. price is local ( default).
//		dv.country=" USA"; // not visible since country is private variable
 		
		
		
	}

}
