package day62_exceptions01;

public class RunTimeError {
	
	static int i = 0;
	public static void main(String[] args) {
		
		go();
		
		
	}
	
	public static void go() {
		System.out.println(i+ "going");
		i++;
		go();				//method calls itself - recursive method. recursion
								//this gives STACKOVERFLOW ERROR.. 
								//Anytime we call a method in JAva, it creates a frame in stack memory.
								//If a method keeps calling itself it causes STACKOVERFLOW ERROR.
		
		
	}

}
