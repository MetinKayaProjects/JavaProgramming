package day21_practice_review;

public class ConverCharToString {
	public static void main(String[] args) {

		

		// following ways can be used to convert char to String
		char ch = 'a';        // String str1 = ch; doesnt work. Since String !== Char
		String str1 = "" + ch;
		System.out.println(str1);

		char ch2 = 'v';
		// String str2 = new String(ch2);
		String str2 = new String("" + ch2);
		System.out.println(str2);
		
		char ch3 = 'x';
		String str3 = Character.toString(ch3);
		System.out.println(str3);
		
		//String to char array
		//char[] arr = str.toCharArray();   

	}

}
