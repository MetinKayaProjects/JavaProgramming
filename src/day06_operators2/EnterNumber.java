package day06_operators2;

import java.util.Scanner; //line 12' u yazinca kendisi otomatic geldi. 
							//gelmezse Scanner uzerinde sag tikla import et

public class EnterNumber {
	
	public static void main(String[] args) {
		
		//Scanner scan = new Scanner (System.in); //  scan variable.... new Scanner object
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int number = scan.nextInt(); //scan line 12'deki degisken ismi. burada degisken int degilde String olsaydi
		//String fisrtName = input.next()  // seklinde yazacaktik. next'den sonra Int olmayacakti.
		
		System.out.println("You entered " + number); //number line 16'dan
		
		// run ettikten sonra asagida sizden numara girmenizi isteyecek. 
		
		
	}
	
	
	

}
