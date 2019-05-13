package day29_method01;

public class Student {
	public static void main(String[] args) {
	
		
		code();
		study();
		study();
		study();
		code();
		sayHello();
		sayHello();
	}
	
	public static void study() {     
		System.out.println("Student is studying");

	}
	
	//create a method with name sayHello. taht prints "Hello friends!"
	public static void sayHello() {
	
		System.out.println();
		System.out.println("Hello friends!");
		System.out.println("Thanks a lot");
		System.out.println("** ** ** ** \n");
	}
	//create a method with name code.
	//"Inside code method"
	//"Student is coding Java"
	
	public static void code() {
		System.out.println("\nInside code method");
		System.out.println("Student is coding Java\n");
	}
	

}
