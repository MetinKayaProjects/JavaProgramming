package day59_polymorphism_02;

public class ShapeTests {
	public static void main(String[] args) {
		
		Shape shape1 = new Shape();
		shape1.draw();
		
		//polimorphism:
		Shape circle = new Circle();   
		circle.draw();
		
		Shape triangle = new Triangle();
		triangle.draw();
		
		Shape square = new Square();
		square.draw();
		//Square sq2 = new Shape();
		
	}
}
