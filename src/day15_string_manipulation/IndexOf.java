package day15_string_manipulation;



public class IndexOf {
	public static void main(String[] args) {
		
		String word1 = "github"; //012345
		System.out.println(word1.indexOf('g'));// 0
		
		System.out.println(word1.indexOf("th")); //2    t'nin yerini verir. Ilk buldugunun yerini verir
		System.out.println(word1.indexOf("hub"));//3
		System.out.println(word1.indexOf("java")); //-1   word1 icinde java yok; -1 verir
		System.out.println(word1.charAt(word1.indexOf("u")));//u
		
		String url = "www.okta.com"; //index 01234567891011 >>12 character
		int i =url.indexOf(".");
		System.out.println("Position of . :" + i);
		System.out.println(url.charAt(i+3));//t   burada i noktanin oldugu yerdi. yani noktadan 3 karakter sonra t var
		
		String title = "Java - Google Search";
		//find the position of '-' and check if space 
		//is on right and left sides
		
		System.out.println(title.indexOf("-"));//5
		 int dash = title.indexOf("-"); // sadece single karakter aradigimizda ('-') da olur. //5
		 System.out.println("The position of - is : " + dash);//5
		 System.out.println(title.charAt(dash-2));//a
		 System.out.println(title.charAt(dash+2));//G
		 
		 String country = "United States of America";
		 int states = country.indexOf("States");//7
		 System.out.println("Position of states: " + states);//7 S'nin basladigi karakte 7'inci sirada
		 
		 String word2 = "java, c++, python, tomcat, eclipse";
		 //check if c++ in the list
		 //1st method: using contains
		 if(word2.contains("c++")) {
			 System.out.println(("c++ is there"));
		 }else {
			 System.out.println("c++ is not there");
		}
		// 2nd method: using indexOf
		 if(word2.indexOf("c++")> -1){ // >=0 da olBILIRDI
			 System.out.println("YEs C++ is there"); // YEs C++ is there
		 }else {
			System.out.println("c++ is not there");
		}
	}

}
