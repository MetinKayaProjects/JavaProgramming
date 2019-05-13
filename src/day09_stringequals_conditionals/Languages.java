package day09_stringequals_conditionals;

public class Languages {
	public static void main(String[] args) {
		
		int option = 4; //bu rakami degistirdikce output degisecek. 4'te Merhaba yazar.
						// 1 olsaydi Hello yazip kalacakti
		/*
		 * 1>> English
		 * 2>> Spanish
		 * 3>> French
		 * 4>> Turkish
		 * 5>> Russian
		 * 6>> Greek
		 */
		if(option==1) { //bu int oldugundan == kullandik
			System.out.println("Hello");
		}else if(option == 2) {
			System.out.println("Hola");   // else'ler olmasaydi, 1'inci basamkta kalmayip 
										//diger basamaklari da kontrol edecekti. zaman kaybi.
	
		}else if(option == 3) {
			System.out.println("Bonjour");
		}else if(option == 4) {
			System.out.println("Merhaba");
		}else if(option == 5) {
			System.out.println("Privet");
		}else if(option == 6) {
			System.out.println("Yiasou");
		}
		
		/*
		 * if(option==(1)) { //bu int oldugundan == kullandik
			System.out.println("Hello");
		
	}
		if(option == 2) {
	System.out.println("Hola");
	
		}
		if(option == 3) {
			System.out.println("Bonjour");
		}
		if(option == 4) {
			System.out.println("Merhaba");
		}
		 */
	}
}
