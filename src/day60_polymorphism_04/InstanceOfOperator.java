package day60_polymorphism_04;

import day59_polymorphism_02.Circle;
import day59_polymorphism_02.Shape;
import day59_polymorphism_02.Square;
import day59_polymorphism_02.Triangle;

public class InstanceOfOperator {
	public static void main(String[] args) {
		Shape shape = new Square();
		//getClass().getName() method:
		System.out.println(shape.getClass().getName());  //day59_polymorphism_02.Triangle
		System.out.println(shape.getClass().getSimpleName());  //Triangle
		
		if (shape.getClass().getSimpleName().equals("Triangle")) {
			System.out.println("It is a Triangle");
		}else if (shape.getClass().getSimpleName().equals("Circle")) {
			System.out.println("It is a Circle");
		}else if(shape.getClass().getSimpleName().equals("Square")) {
			System.out.println("It is a Square");
		}
		
		//same check using onstanceof operator
		System.out.println("\n//////////// same check using instanceof operator\\\\\\\\\\\\\\");
		
		System.out.println(shape instanceof Square);  //true
		System.out.println(shape instanceof Circle);  //false
		System.out.println(shape instanceof Triangle); //false
		
		System.out.println(shape instanceof Shape);  //true
		
		System.out.println();
		
		if (shape instanceof Triangle) {
			System.out.println("It is a Triangle");
			shape.draw();
		}else if (shape instanceof Circle) {
			System.out.println("It is a Circle");
			shape.draw();
		}else if(shape instanceof Square) {
			System.out.println("It is a Square");   //It is a Square
			shape.draw();
		}
		
		Shape [] shapes = {new Triangle(), new Square(), new Circle(), new Triangle(), new Square(), new Circle()};
		
		int circles = 0, squares = 0, triangles = 0;
		for(Shape n : shapes) {
			if (n instanceof Triangle) {
				triangles++;
			}
			if (n instanceof Square) {
				squares++;
			}
			if (n instanceof Circle) {
				circles++;
			}
		}
		System.out.println("\ncircles: " + circles + " \nsquares: " + squares + " \ntriangles: " + triangles );
		
		
	}
	
}
