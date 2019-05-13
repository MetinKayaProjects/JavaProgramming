package day08_casting_conditionals;

public class CastingPrimitives {
	
	public static void main(String[] args) {
		
		//cast double value to int
		
		int i = (int)3.4; // cast to int // 
		System.out.println("i: "+ i); //3 printed out
		
		
		double price = 230.50;
		int dollars = (int)price;
		
		System.out.println("Price: " + price);//230.5 
		System.out.println("Price: "+ dollars); //230 printed out
		
		System.out.println("==============================");
		//WHOLE NUMBERS BETWEEN byte, short, int		
		
		int count = 2444;
		byte byteCount = (byte)count; // byte in'ten kucuk oldupundan byte int atayamayiz. 
										// burada castin ile convert yapiyoruz.
		System.out.println("ByteCount: " + byteCount); //kendi rangindeki karsiligini verir. burada -116 verdi.
		
		System.out.println("==============================");
		
		long longValue = 345645L;
		int intValue = (int)longValue;
		System.out.println("IntValue: " + intValue); //345645
		
		System.out.println("==============================");
		
		int large = 5678;
		short small = (short) large;
		System.out.println("Small : " + small);
		
		System.out.println("==============================");
		
		int result = (int)(500.4/2.0); //burada double olan tum degerleri int'e cevirmeliyiz
		System.out.println("Result: " +result); //print  out 250  (500/2)
		
		System.out.println("==============================");
		
		
		
		
		
	}

}
