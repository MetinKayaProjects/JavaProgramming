package day57_interfaces;

public class BMWi8 implements Electric, Automonous {
	
	public void charge() {  //this comes from abstract Electric class-> public abstract void charge(); 
		System.out.println("BMWi8 is charging at home");
	}

	@Override
	public void selfDrive() {//this comes from abstract Automonous class-> public abstract void selfDrive(); 
		System.out.println("BMWi8 is also self driving car");
		
	}

}
