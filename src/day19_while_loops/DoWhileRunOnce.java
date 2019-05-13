package day19_while_loops;

public class DoWhileRunOnce {
	public static void main(String[] args) {
		//in this example do while loop body code will run
		//once test the condition. Then exit the loop, as condition is false

		int count = 10;
		do {
			System.out.println("count: " + count);  // 10
			count++;           //11
			
		}while(count <=5);  // false 11 is not lass than 5
	}

}
