package day46_static_keyword;

public class Vehicle {
	
	String type; // non-sttaic instance variable, every object has its own type
	static int numberOfVehicles;// shared, one central value

	public static void vehicleInfo() {
//		System.out.println("tupe: " + type); // will not compile, since static cannot call non-static velue

		System.out.println("numberOfVehicles: " + numberOfVehicles); // works, since n=both are static
		int count = getNumberOfVehicle();  //works since both are static
		String make = "Kia";
		make = make.toUpperCase(); //works since both are in the same method
		System.out.println("make: " + make);
//		System.out.println(toString); // toString is a non-static class. it cannnot call static method
		
//		Vehicle vh = new Vehicle();
//		vh.toString();  //works
	}
	
	public static int getNumberOfVehicle() {
		return numberOfVehicles;  //works, since both are static
	}
	
	public String toString() {
		return "Vehicle type: " + type + " | count" + numberOfVehicles; 
	}

}
