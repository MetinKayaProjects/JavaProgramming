package day19_while_loops;

public class DoWhile {
	public static void main(String[] args) {
		
	//print 1 to 10 using do-While Loop
		
		int i = 1;
		
		do {
			System.out.print(i + " ");
			i ++;
			
		}while(i <= 10);
		
		
		System.out.println(" ======== ");
		
		int x = 10;
		do {
			System.out.print( + x + " ");
			x --;
		}while(x>=0);
		
		
		
		
		System.out.println(" ======== ");
		
		int sum = 0;
		int j = 1;
		
		do {
			sum +=j;		//sum = sum + j;
			j ++;
		
		}while(j <= 5);
		
		System.out.println("=====Sum the odd numbers from 1 to 21 is ======");
		
		
		int sum2 = 0;
		int j2 = 1;
		
		do {
			sum2 +=j2;		//sum = sum + j;
			j2 +=2;
		
		}while(j2 <= 21);
		
		System.out.println("Sum the odd numbers from 1 to 21 is " + sum2);
	}

}
