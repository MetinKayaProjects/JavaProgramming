package day57_interfaces;

public class Tesla extends Vehicle implements Electric, Automonous {
//	A class (Tesla) can extend a class and interface, impelements more classes at the same time
	@Override
	public void charge() {  //public abstract void charge();
	System.out.println("Tesla is charging at charging station");
	}

	@Override
	public void selfDrive() {  			//-> public abstract void selfDrive();
		System.out.println("Tesla is in auto pilot mode. Driving itself");
		
	}
	@Override
	public void drive() {   //Tesla extends Vehicle. This method is Overridden from Vehicle
		System.out.println("Tesla is driving... This is called from Vehicle");
	}
}
