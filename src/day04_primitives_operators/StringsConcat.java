package day04_primitives_operators;

public class StringsConcat {

public static void main(String[] args) {
	
	///Declare String variable called firstName and assign your firstname
	
	String firstName = "Metin";  // String'de degiskene atanan deger mutlaka tirnak (" ") icinde olmali.
	
	// print out : My name is Metin
	
	
	System.out.println("My name is " + firstName);  //My name is Metin
	
	System.out.println("============================ ");
	
	//city variable and assign city where you are from
	
	String city = "Istanbul";
	System.out.println("I am from " + city + ".");  //I am from Istanbul.
	
	System.out.println("============================ ");//araya bos bir satir koymak icin
	
	
	//create a var: job and assign SDET to it
	//Create a var: company and assign any company
	// Print: I work as <SDET> in <company>
	
	String job = "SDET";
	String company = "BoA";
	System.out.println("I work as " + job + " in " + company + "."); //I work as SDET in BoA.
	
	System.out.println("============================ ");//araya bos bir satir koymak icin
	
	//create (declare) int var (variable) zipcode and assign zip code of your home
	//Print out: I live in <22043> zipcode
	
	int zipCode = 22043;
	System.out.println("I live in " + zipCode + " zipcode."); //I live in 22043 zipcode.
	
	System.out.println("============================ ");//araya bos bir satir koymak icin
	
	int num1=20;
	int num2=40;
			System.out.println(num1+ " " + num2); // bunu 20  40 olarak yazar.
			System.out.println(num1+num2); //toplar. 60
	
}
}
