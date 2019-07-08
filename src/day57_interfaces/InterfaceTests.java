package day57_interfaces;

public class InterfaceTests {
	public static void main(String[] args) {
//		Electric el = new Electric() //not work. We cannot instantiate an interface
//		Automonous at = new Automonous(); //not work. We cannot instantiate an interface
		
		
		Tesla t = new Tesla();
		BMWi8 i8 = new BMWi8();
		
		t.charge();
		i8.charge();
		
		t.drive(); //from Vehicle. Tesla extends Vehicle... This method actually in Vehicle.
		t.selfDrive();
		i8.selfDrive();
		
		Electric el = new Tesla();//this is polimorfism. we will talk about later
		
	}

}
