package day43_encapsulation_constructor;
import java.util.*;


public class TeslaDealer {
	public static void main(String[] args) {
		
		Tesla tesla = new Tesla();
		tesla.setModel("Model S");
		tesla.setRange(310);
		tesla.setZeroto60(3.2);
		tesla.setPrice(51450);
		tesla.setSelfDriving(true);
		
		System.out.println("Model: " + tesla.getModel()); //Model: Model3
		System.out.println("Range: " + tesla.getRange());  //Range: 310
		System.out.println("ZeroTo60: " + tesla.getZeroTo60() + "sec"); //ZeroTo60: 3.2sec
		System.out.println("Price: " + tesla.getPrice());  //Price: 51450.0
		System.out.println("Is it self driving: " + tesla.isSelfDriving()); //Is it self driving: true
		System.out.println("setTeslaInfo()");
		tesla.setTeslaInfo("model s", 310, 3.2, 51450, true);
		System.out.println("setTeslaInfo() method: " + tesla.toString());
		
////		first in the Tesla class we automatically created (source> Generate to String)
//		@Override
//		public String toString() {
//			return "Tesla [model=" + model + ", range=" + range + ", zeroTo60=" + zeroTo60 + ", price=" + price
//					+ ", selfDriving=" + selfDriving + "]";
		System.out.println();
		System.out.println(tesla);
		System.out.println();
		System.out.println(tesla.toString());
		
		System.out.println();
		
		tesla.getAllInfo(); //I wrote this method myself
		
		System.out.println();
		
		tesla.isValidModel("Model S");
		System.out.println("LAST: " + tesla.isValidModel("Model S"));
		System.out.println();
		
		Tesla tesla2 = new Tesla();
		tesla2.setModel("Model S");
		tesla2.isValidModel("Model S");
		System.out.println("Corolla is: " + tesla2.isValidModel("Corolla"));
		tesla2.setModel("Civiv");
		
		System.out.println();
		
		Tesla myTesla = new Tesla();
		myTesla.setTeslaInfo("Roadstar", 620, 1.9, 250000, true);  
//		myTesla.setTeslaInfo(String model, int range, double zeoTo60, double price, boolean selfDriving)
		
		System.out.println("myTesla: " + myTesla.toString());
		
		System.out.println();
		
		//tesla, myTesla
		
		if (tesla.getZeroTo60() > myTesla.getZeroTo60()) {
			System.out.println("Faster model: " + myTesla.getModel());
			System.out.println("0-60 speed: " + myTesla.getZeroTo60());
			
		}else {
			System.out.println("Faster model: " + tesla.getModel());
			System.out.println("0-60 speed: " + tesla.getZeroTo60());
		}
		
		System.out.println();
		
		buy(tesla);
		buy(myTesla);
		buy(tesla2); //unknown. since civic assigned to tesla2
		
		System.out.println();
		
		testDrive("Model S");// how can we print it out
		//1
		System.out.println(testDrive("Model X"));
		
		System.out.println();
		//2
		Tesla testCar = testDrive("Roadstar");
		System.out.println(testCar.toString());
		
	
	}//END OF MAIN CLASS
	
	public static void buy(Tesla car) {
		System.out.println("Purchasing " + car.toString());
	}

		//model: testDrive
		//return: Tesla
		//Param: String model
		//inside of the metod, print out: 
		//-"I would like to test drive - model"
		//-"Sure, let me build tje object and return it"
		//create object first with data here and return
		//return {Tesla object};
	
	public static Tesla testDrive(String model) {
		
		System.out.println("-I would like to test drive " + model);
		System.out.println("-Sure, let me build the object and return it");
		
		Tesla car =new Tesla();
		car.setTeslaInfo(model, 310, 2.5, 95000, false);
//		car.setTeslaInfo(model, 0, 0, 0, false);
		return car;
		
	}
	

}
