package day18_while_dowhile_loops;

public class Counter {
	public static void main(String[] args) throws InterruptedException {

		// 1,2,3,4,5,....,10
		int i = 0;
		while (i <= 10) {
			System.out.print(i + ", ");
			i++;
			Thread.sleep(400); // pause the code execution for a second
		}

		System.out.println("\n\nNumber value after loop : 11\n");

		int num = 11;
		while (num >= 1) {
			System.out.print(num + ",");
			num--;
			Thread.sleep(400);

		}

	}

}
