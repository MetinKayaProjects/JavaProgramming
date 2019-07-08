package day60_polymorphism_04;

import java.awt.List;
import java.util.ArrayList;

//import day59_polymorphism_02.Shape;
//import day59_polymorphism_02.Triangle;
import day59_polymorphism_02.*;;  //this cover above as well

public class ShapesArray {
	public static void main(String[] args) {
		//from day59_02
		Shape shape = new Shape();
		shape.draw();  //calls from Shape since object is in the Shape class
		
		Shape shape2 = new Triangle();  //this should be imported, see above
		shape2.draw();  // calls from Triangle, since there is an overridden method in Triangle. If it was not an overridden then calls from Shape class (super class)
		
		System.out.println();
		
		Shape [] shapes = {new Triangle(), new Square(), new Circle(), new Triangle(), new Square(), new Circle()};
		shapes[0].draw();  //Triangle
		shapes[1].draw();  //square
		shapes[2].draw();  //Circle
		
		System.out.println("---- ForEach-----");
		
		for(Shape sh : shapes) {
			System.out.println(sh.getClass().getSimpleName());
			sh.draw();
		}
		
		System.out.println("------");
		//also we can write like this:
		
		Shape[] shapes2 = new Shape[3];
		shapes2[0] = new Triangle();
		shapes2[1] = new Square();
		shapes2[2] = new Circle();
		
		shapes2[0].draw();//triangle
		shapes2[1].draw();
		shapes2[2].draw();
		
		System.out.println("----List-----");
		//create a list of Shapes and add 5 different objects
		//List<Shape> sList = new ArrayList<>();
		ArrayList<Shape> shapesList = new ArrayList<>();
		shapesList.add(new Triangle());
		Shape newShape = new Square();
		shapesList.add(newShape);
		shapesList.add(new Circle());
		shapesList.add(new Triangle());
		shapesList.add(new Circle());
		
		//draw first line
		System.out.println("\n**********draw first line*************");
		shapesList.get(0).draw();
		
		System.out.println("\n**********draw second line*************");
		Shape someShape = shapesList.get(1);
		someShape.draw();
		
		System.out.println("\n-------FOR EACH WITH LIST of SHAPES -------------");
		
		for(Shape s2 : shapesList) {
			System.out.println(s2.getClass().getSimpleName().toUpperCase());
			s2.draw();
		}
		
		System.out.println("\n-------FOR LOOP WITH LIST of SHAPES -------------");
		
		for (int i = 0; i < shapesList.size(); i++) {
			System.out.println(shapesList.get(i).getClass().getSimpleName().toUpperCase());
			shapesList.get(i).draw();
		}
		
	}

}
