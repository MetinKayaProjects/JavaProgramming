package day04_primitives_operators;
public class Primitives {
	public static void main(String[] args) {  //main method
		
		byte byteValue     = 127;  // 127; -128 ile 127 arasinda. kucuk harfle baslayip yeni kelimeye gecerken buyuk harfle devam et: byteValue
		//byte byteValue     = 200;  bu olamaz, hata verir. cunku 200 sayisi -128 ile 127 arasinda degil.
		short shortValue   = 23000;
		int intValue       = 123545645;
		long longValue     = 453453453453L; //sonuna mutlaka apper L eklenir.
		
		float floatValue   = 12.123F;//desimal degerler atanir, sonuna F veya f eklenir. 
		double doubleValue = 2342.5; // sonuna d ya da D ekleyebiliriz, optional.
		// burada deger olarak reel sayi da atasan yazdirirken desimal yazdirir. 
		//Orn; 3465 atasan da 3465.0 yazdirir
		
		char charValue     = '@';  //bu rakam degil, karakter oldugu icin TEK TIRNAK icine almamiz gerekiyor. 
								   //tirnak icine aldigimiz icin de gordugunu yazar, yani bu ornekte @.
		char charValue2    = 1511; //okul numaramin karsiligi karakter
		char charValue3    = 65; // 65'in karsiligi A idi.
		
		boolean booleanValue  = true;
		boolean booleanValue2 = false;
		
		
		
		System.out.println("byte: " + byteValue);
		System.out.println("short: " + shortValue);
		System.out.println("int: " + intValue);
		System.out.println("long: " + longValue);
		System.out.println("float: " + floatValue);
		System.out.println("double: " + doubleValue);
		System.out.println("char: " + charValue);
		System.out.println("char2: " + charValue2);//okul numaramin karsiligi karakteri yazdirir
		System.out.println("char3: " + charValue3); // 65'in karsiligi A yazar
		System.out.println("boolean: " + booleanValue);
		System.out.println("boolean: " + booleanValue2);
		
		
	}

}
