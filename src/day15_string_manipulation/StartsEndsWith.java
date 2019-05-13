package day15_string_manipulation;



public class StartsEndsWith {
	public static void main(String[] args) {
		
		String word1 = "eclipse";
		//startsWith	
		
		System.out.println(word1.startsWith("e")); //T
		System.out.println(word1.startsWith("ec"));//T
		System.out.println(word1.startsWith("ecli"));//T
		System.out.println(word1.startsWith("ec"));//T
		
		System.out.println(word1.startsWith("Ec"));//F
		
		//endsWith
		
		System.out.println(word1.endsWith("e"));//T
		System.out.println(word1.endsWith("ipse"));//T
		System.out.println(word1.endsWith("ipsE"));//F
		System.out.println(word1.endsWith("Se"));//F
		System.out.println(word1.endsWith("java"));//F
		
		//"PSE"
		
		System.out.println(word1.toUpperCase().endsWith("PSE"));//true
		
		
		//Mr. ==> male 
		//Mrs.==> married female
		//Ms.==> Some woman
		//Dr. ==> Dr. man or woman 
		// ==> unknown status
		
		String name = "Mr. Jacson";
		
		if(name.startsWith("Mr.")) {  			//bunu yani //Male yazar."Mr."
			System.out.println("Male");
		}else if(name.startsWith("Mrs.")) {
			System.out.println("married woman");
		}else if(name.startsWith("Ms.")) {
			System.out.println("some woman");
		}else if(name.startsWith("Dr.")) {
			System.out.println("Dr. man or woman");
		}else {
			System.out.println("Unknown status"); 
		}
		
		
	}

}
