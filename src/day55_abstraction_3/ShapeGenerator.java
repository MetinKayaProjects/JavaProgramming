package day55_abstraction_3;

public class ShapeGenerator {
	public static void main(String[] args) {
		Circle c1 = new Circle(3.0);
//		c1.radius = 4.5;
		System.out.println(c1.name);
		System.out.println(c1.calculateArea());
		c1.draw();
		
		
		System.out.println();
		
		Triangle t1 = new Triangle();
		t1.length1=2.4;
		t1.length2=3.3;
		t1.length3=2.1;
		System.out.println(t1.name);
		System.out.println(t1.calculateArea());
		t1.draw();
		
		System.out.println();
		
		Triangle t2 = new Triangle(3, 4, 5);
		System.out.println(t2.name);
		System.out.println(t2.calculateArea());
		t2.draw();
	}

}
