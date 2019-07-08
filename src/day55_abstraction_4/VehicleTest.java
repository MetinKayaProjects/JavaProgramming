package day55_abstraction_4;

public class VehicleTest {
	public static void main(String[] args) {
		
		Sailboat sb = new Sailboat(23000, 12);
	
//		sb.setWheels(12);
		System.out.println(sb.getLength() + " ft");  //12ft
		System.out.println("$" + sb.getPrice());  //$23000
		System.out.println(sb.getPowerSource());  //wind
		System.out.println(sb.getType());//sailboat
		System.out.println(sb.getWheels());//0
		sb.move();//Sailboat is sailing on the sea...
		
		System.out.println();
		
		Bike bike = new Bike(2, 750.50);
		
		System.out.println(bike.getWheels()); //2
		System.out.println(bike.getPrice());  //750.5
		System.out.println(bike.getType());  //Bycle
		System.out.println(bike.getPowerSource());  //only a person
		bike.move();  //cycling
		
		
		
	}

}
