package day16_strin_manipulation;

import java.util.Scanner;

public class url1 {
	public static void main(String[] args) {
		
		
		/*www.amazon.com
		com, net, edu, org, gov
		1- check  it that starts with www.
		2- check it contains the ending dot (.) right before the extension
		3- assign String domain and String extension.
		4- print them
			"Domain: " amazon
			"Extension: " com
			
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter url: ");
		String url = scan.next();
		
//1- check  it that starts with www.
		
		if(url.startsWith("www.")) {
			System.out.println("www. is present");
		}else {
			System.out.println("Invalid url format");
			return;
		}
		
//2- check it contains the ending dot (.) right before the extension
		// 		exp.   www.etsy.com   12-4'de . var
		
		int dotIndex = url.length()-4;  //	- find out the length of the url and do -4 and using chart get the character
		//url.lastIndexOf(".");
		
		if(url.charAt(dotIndex) == ( '.')) {   // - compare if it is '.'
			System.out.println("Yes it contains (.) before extension");
		}else {
			System.out.println(". might be misplaced");
		}
		/*
		 * if (url.charAt(url.lengrh() - 4) == '.'){   //bu da ayni sonucu verir.
		 * 
		 * }   */
		
/* 3- assign String domain and String extension.
   4- print them
			"Domain: " amazon
			"Extension: " com
		 */
		
		String domain = url.substring(4, dotIndex); //www.'dan dotIndex'e kadar sonasini okutuyoruz
		System.out.println("Domain: " + domain);
		String extension = url.substring(dotIndex+1, url.length()); //dotIndex, -4'e gelmisti 
													// (.' yi cikarmak icin +1 ekledik,
													// nereye kadar=> sonuna yani url.length()'e kadar
		System.out.println("Extension: "+ extension);
		
		
		
	}

}
