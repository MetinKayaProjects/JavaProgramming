package day16_strin_manipulation;

import java.util.Scanner;

public class Url1_Murodil {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter url:");
		String url = scan.next();
		
		//check www.
		if(url.startsWith("www.")) {
			System.out.println("www. is present");
		}else {
			System.out.println("Invalid url format");
			return;
		}
		
		//check . is there right before extension
		//find out the length of the url
		//do -4 and using charAt get the character 
		//compare if it is '.'
		//www.etsy.com => 12
		
	    int dotIndex = url.lastIndexOf(".");
	  //int dotIndex = url.length() - 4;    //bu da olur
				
		if(url.charAt(dotIndex) == '.') {
			System.out.println(". is there before extension");	
		}else {
			System.out.println(". might be misplaced");
		}
		
		
		
		//get domain and extension
		//www.yahoo.com
		String domain = url.substring(4, dotIndex);  //int dotIndex = url.length() - 4; yukarida ,com'dan onceki .
		System.out.println("Domain:"+domain);
		
		String extension=url.substring(dotIndex+1, url.length());
		//String extension=url.substring(dotIndex+1); 		//de olur.
		//String extension=url.substring(url.length()-4); 	// bu da olur
		
		System.out.println("Extension:"+extension);
	}

}
