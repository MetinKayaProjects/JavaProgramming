package day55_abstraction_3;
/*
 * 
5,Create Circle and Triangle Concrete class of Shape

5.1,create no arg constructor and call super class's 
one arg constructor
for Circle add 1 arg to set radius,Trial 3 args 
set length
6,In Circle class add radius field. 
and use this field to calculate your area in your calculate are method
7,in Triangle class add leng1,leng2,leng3 and calculate your area according to the each side of triangle. 
9, Implement the abstract methods in both class 
to provide detail
 */
public class Circle extends Shape {
	double radius;
	
	public Circle() {
		super("Circle");
	}
	public Circle(double radius) {
		super("Circle");
		this.radius = radius;
	}

		
	@Override
	public double calculateArea() {
		area = Math.PI*Math.pow(radius,2);
		return area;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("  ***  \n" + 
						   " *   * \n" + 
						   "*     *\n" + 
						   "*     *\n" + 
						   "*     *\n" + 
					       " *   * \n" + 
						   "  ***");
	}

}
