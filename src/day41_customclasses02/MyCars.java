package day41_customclasses02;

public class MyCars {
	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.make = "Ford";
		car1.model = "Fiesta";
		car1.color = "Grey";
		car1.currentSpeed = 55;
		
		car1.printCarInfo();  //Car make [Ford], model [Fiesta], color [Grey], currentSpeed [55]
		
		car1.showCurrentSpeed(70);
		car1.showCurrentSpeed(50);
		
		
		car1.drive();
		
		System.out.println();
		
		System.out.println("before : " + car1.currentSpeed);
		car1.accellerate(20);
		System.out.println("after : " + car1.currentSpeed);
		
		BMW m1 = new BMW();
		m1.make ="BMW";
		m1.model = "330i";
		m1.price = 23000.00;
		
		m1.showPrice();
		System.out.println("model: "+m1.model);
		System.out.println("make: "+m1.make);
		System.out.println("price: " +m1.price);
	}

}
