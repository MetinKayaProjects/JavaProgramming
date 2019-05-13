package day13_ternary_string_intro;

public class StringCaseConversion {
	public static void main(String[] args) {
		
		
		String city = "Tashkent";
		System.out.println(city); //Tashkent
		System.out.println(city.toUpperCase()); //TASHKENT
		System.out.println(city.toLowerCase()); //tashkent
		
		String lan = "JAVA";
		System.out.println(lan.toLowerCase());//java
		lan = lan.toLowerCase();
		System.out.println(lan); //java
		
		int n = 100;
		System.out.println(n + 5); //105
		//n = n + 5;
		System.out.println(n);//yine ilk degeri yani 100 verir. cunki yeni degeri n'e atamadik
		
		n = n+5;
		System.out.println(n); //simdi 105 yazdirir
		
		
	}

}
