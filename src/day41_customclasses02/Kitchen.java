package day41_customclasses02;

public class Kitchen {
	public static void main(String[] args) {
	
		Microwave mic = new Microwave();  //Microwave is the name of the class
		mic.brand = "LG";
		
		mic.turnOn();
		mic.heat("pizza");
		mic.turnOff();
		
		
	
	}
}
