package day36_wrapperclasses_arraylistintro;

public class WrapperClassMethod {
	public static void main(String[] args) {
		
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);System.out.println();
		
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);System.out.println();
		
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);System.out.println();
		
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);System.out.println();
		
//		System.out.println(Double.MIN_EXPONENT);
		System.out.println(Double.MIN_NORMAL);
		System.out.println(Double.MAX_VALUE);System.out.println();
		
		System.out.println(Boolean.TRUE);
		System.out.println(Boolean.FALSE);
		System.out.println();
		
		System.out.println(Character.MIN_VALUE);  //empty
		System.out.println(Character.MAX_VALUE);  // ￿
		System.out.println();
		
//		convert String to primitive
		int count = Integer.parseInt("34356");
		System.out.println("count: " + count);
		System.out.println();
		
		int count2 = Integer.valueOf("56565");  //valueOf(String)
		System.out.println(Integer.valueOf(123));//valueOf(int)
		System.out.println("count2: " +count2);
		
		System.out.println(Character.isAlphabetic('a'));
		System.out.println(Character.isAlphabetic(count2));
		System.out.println(Character.isAlphabetic('@'));
		
		System.out.println(Character.isLetter('j'));
		System.out.println(Character.isLetter('?'));
		
		System.out.println(Character.isDigit('0'));
		
		String str = "java101";
		System.out.println(Character.isAlphabetic(str.charAt(0))); //true  --j
		System.out.println(Character.isDigit(str.charAt(6))); // true --1
		System.out.println();
		
		String word = "ab123c5dfer1";
		for(int i = 0; i < word.length(); i++) {
			if(Character.isDigit( word.charAt(i) )) {
				System.out.print(word.charAt(i)); //12351
			}
		}
	}

}
