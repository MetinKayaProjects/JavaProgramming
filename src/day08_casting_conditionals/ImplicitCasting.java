package day08_casting_conditionals;

public class ImplicitCasting {
	public static void main(String[] args) {
	
	//automotic casting from smaller into larger type
		
		short shortValues = 3455;
		int intValue = shortValues; //bunun basina int yazmak optional. cunki short<int.
		//int intValue = (int)shortValues;  //optional
		System.out.println("intValue: " + intValue);
		
		System.out.println("==============================");
		
		
		double price = 345;
		System.out.println(price); // 345.0 printed out
		
		int priceValue = (int)price;
		System.out.println("PriceValue: " + priceValue); //345 printed out
		
		System.out.println("==============================");
		
		int price1 = 34563;
		double dPrice = price1;
		
		System.out.println("dPrice: " + dPrice); //34563.0
		
		System.out.println("==============================");
		
		System.out.println(10/2.0); //result is double 5.0
		
		System.out.println("==============================");
		
		int result = (int)(10/2.0); //2.0 double oldugundan int'e cevirmek gerekiyor.
		//int result = 10/(int)2.0;  // boyle de yazilablirdi
		
		System.out.println(result);  //5 yazar
		
		System.out.println("==============================");
		
		int rent1 = 987;
		int rent2 = 1100;
		int rent3 = 894;
		int rent4 = 1234;
		
		//double average = (rent1+rent2+rent3+rent4)/4;
		
		//System.out.println(average); //1053.0
		
		double average2 = (double)((rent1+rent2+rent3+rent4)/4.0);
		
		System.out.println(average2); //1053.75
		
		double d = 40.2;
		int i = (byte)d;
		//in above statement both explicit and implicit casting happening.
		
		// explicit: double to byte,
		// implicit: byte to int
		
		System.out.println("==============================");
		char c= 'a'+1;
		System.out.println(c);
		
		
		
}
}
