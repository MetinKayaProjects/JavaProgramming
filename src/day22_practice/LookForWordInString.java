package day22_practice;

public class LookForWordInString {
	public static void main(String[] args) {

		String sentence = "He said hi, then she replied hi. hi guys!";
		// look for how many "hi" are there in this string.
		// print letters in pairs
		// He
		// e   e+space
		//  s  space+s
		// sa
		// ai
		int count = 0;
		for (int i = 0; i <= sentence.length() - 2; i++) {
			String temp = sentence.substring(i, i + 2);
			System.out.println(temp);
			if(temp.equals("hi")) {
				count++;
			}
		}
		
		System.out.println("-------");
		//Count: 3
		System.out.println("Count (hi): " + count);  //>> Count (hi): 3
		

	}

}
