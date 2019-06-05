package day55_abstraction_4;

public class VehicleTest {
	public static void main(String[] args) {
		
		Sailboat sb = new Sailboat(23000, 12);
	
//		sb.setWheels(12);
		System.out.println(sb.getLength() + " ft");  //12ft
		System.out.println("$" + sb.getPrice());  //$23000
		System.out.println(sb.getPowerSource());  //wind
		sb.move();
		
		System.out.println();
		
		Bike bike = new Bike(2, 750.50);
		
		System.out.println(bike.getWheels()); //2
		System.out.println(bike.getPrice());  //750.5
		System.out.println(bike.getPowerSource());
		bike.move();  //cycling
		
		
		
	}

}
