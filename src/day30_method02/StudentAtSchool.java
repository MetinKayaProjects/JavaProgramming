package day30_method02;

public class StudentAtSchool {
	public static void main(String[] args) {
		
		study("Selenium");
		study("Java");
		study("Python, java");
		
		sleep(8);
		sleep(3);
		
		
	}
	
	
	public static void study(String topic) {
		System.out.println("Student is studying " + topic);  
		
//		Student is studying Selenium
//		Student is studying Java
//		Student is studying Python, java
		
	}
//  Method name : sleep
//	return type	: void
	
	public static void sleep(int hours) {
		System.out.println();
		System.out.println("Student has been sleeping for " + hours + " hours");
		System.out.println("Student has studied " + hours + " hours");
	}

}
