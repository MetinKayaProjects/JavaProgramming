package day20_forLoops;

public class ForLoop1 {
	public static void main(String[] args) throws InterruptedException {
	
		
		//using for loop; print out 10 times "Love Java" 
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Love Java! " + "["+ i + "] times");
			Thread.sleep(456);
		}
		
		System.out.println("\n========================\n");
		
		//Print numbers from 5 to 15 by using for loop
		
		for(int i = 5; i <= 15; i++) {
			System.out.print(i+" ");
			Thread.sleep(456);
			
		}
		
		System.out.println("\n========================\n");
		
		//using for loop print 20 -10
		
		for (int i = 20; i >= 10; i--) {
			System.out.print(i+" ");
			Thread.sleep(456);
		}
	
	}

}
