package day16_strin_manipulation;

public class GetNumberFromString {
	public static void main(String[] args) {
		
		String sentence = "I wrote [236] lines of code today";
		////assign to variable and print the number between [ and ]
		
		int firstIndex = sentence.indexOf('[');
		int secondIndex = sentence.indexOf(']');
		
		System.out.println("Lines of Code: " + sentence.substring(firstIndex+1, secondIndex));
		
		System.out.println("===== 2nd way ===============");
		//2nd way:
		String codeCount = sentence.substring(firstIndex+1, secondIndex);
		System.out.println("Lines of code: " + codeCount);
		
		
		// check the codeCount is more than 20
		
	int count = Integer.parseInt(codeCount); //codeCount String, bunu integer'a ceviriyoruz.
	if(count > 20) {
		System.out.println("Wrote more than 20 codes today");
	}else {
		System.out.println("Not eneough coding today :(");
	}
		
	}

}
