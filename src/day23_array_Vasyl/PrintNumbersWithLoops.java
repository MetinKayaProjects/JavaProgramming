package day23_array_Vasyl;

public class PrintNumbersWithLoops {
	public static void main(String[] args) {
		//just to print numbers from 1 to 10
		
		
		System.out.println("--  1st way --\n ");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i+ " ");
		}
		System.out.println();
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(i+ " ");
		}
		System.out.println();
		for (int i = 1; i <= 10; i++) {
			System.out.print(i+ " ");
		}
		
		System.out.println("\n--  2nd way --\n ");
		
		for(int j=1; j<=6; j++) {   //outer loop             how many lines?
			System.out.print("Line j-"+ j + ":..... ");
			for(int k = 1; k <=3; k++) {					//how many iteration in the same line
				for(int i =1; i<=10; i++) {  // inner loop   //
					System.out.print((i + " "));
			}
			System.out.print(">>- (Pillar k" + k + ")---");
				
			}
			System.out.println(); //asagi satira atsin diye bos satir print
		}
			
	}

}
