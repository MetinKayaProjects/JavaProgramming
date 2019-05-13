package day06_operators2;

import java.util.Scanner;

public class ScannerYourName {
	
	public static void main(String[] args) {
		
		//create scanner object
		
		//Scanner scan = new Scanner(System.in);  // scan burada variable. 
		
		System.out.println("Hi, What is your name?");
		
		Scanner scan = new Scanner(System.in); 
		
		String name = scan.nextLine(); // accept String input/// buradaki scan line 11'den. 
										//metin kaya yazdiracaksan line kullanmalisin
									//oradaki isim neyse o gelir buraya
		
		//String name = scan.next();  //next'in yanidaki Line'i silersen 
									//ekrana yazdigin sadece ilk kelimeyi yazdirir. metin yazar
		
		System.out.println("Nice to meet you " + name);
		
		
		
		
	}
	
	
	

}
