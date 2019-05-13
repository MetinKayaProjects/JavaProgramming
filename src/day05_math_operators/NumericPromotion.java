package day05_math_operators;

public class NumericPromotion {
	public static void main(String[] args) {
		
		// Numeric Promotions; 3 kural var
		
		
		//Rule-1: 
		//Smaller Data Types, byte, short, and char, are 
		//first promoted to int any time they're used with a 
		//java binary arithmetic operator, even if neither of the operand is int:
		
		byte b = 10;
		short s = 20;
		//short total = b+s;  //bu calismaz.
		//short s = b+2; //bu da calismaz. sag tarafta degisken var sa short'un altina yazilmaz. int'e yazilir.
		int total = b+s;
		
		System.out.println(total); //30 yazdirir
		
		
		//Rule-2
		//If one of the values is integral and other is floating-point, 
		//Java will automatically promote the integral value to the floating-point value's data type
		
		double d = 10.5;
		int i = 4;
		
		//int j = d* i  // kabul etmez. cunki double int'den daha genis 
		//range sahip. int double'i cover edemez ama double int'i cover eder.
		double j = d * i;
		
		System.out.println(j); // 42.0 yazdirir
		
		
		//Rule-3
		//After all promotion has accured and the operands have the same data type, 
		//the resulting value will have the same type as its promoted operands:
		
		double d1 = 10.5;
		double d2 = 3.4;
		double d3 = d1-d2;  // oncekilerin ikisi de double oldugundan sonuncusu da double olmali.
		System.out.println(d3); //7.1 yazdirir.
		
		
		
		
		
	}

}
