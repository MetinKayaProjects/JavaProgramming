package day21_practice_review;

public class StringMethodsReview  {
	public static void main(String[] args) {
		
        //01234
	String word = "javva";
	String unique = "";
	
	char ch = word.charAt(0);
	System.out.println(unique.contains(""+ch));
	System.out.println(unique.indexOf(ch));
	if(!unique.contains(""+ch)) {
		unique += ch; //unique = unique+ch;
	}
	
	if(unique.indexOf(ch) == -1) {
		unique+=ch; // "ab"
	}
	
	System.out.println("Unique:" + unique);
	
	System.out.println("\n***************\n");
	
	String word2 = "bananas";
	String unique2 ="";
	
	int i = 0;
	char ch2 = word2.charAt(i);//b
	System.out.println("Ch2:" + ch2);
	
	i = 1;
	ch2 = word2.charAt(i); //a
	System.out.println("Ch2:" + ch2);
	//"bananas"
	i++;//2
	ch2 = word2.charAt(i); //n
	System.out.println("Ch2:" + ch2);
	
	//check if ch2 is in the unique2 variable
	//if(unique2.contains(ch2))
				
	System.out.println("\n***************\n");
	String word3 = "apples";
	String unique3 ="";
	for(int j=0; j<word3.length(); j++) {
		char ch3 = word3.charAt(j);
		String str3 = Character.toString(ch3);
		if(!unique3.contains("" + ch3)) {
			unique3 += ch3;
		}
	}System.out.println("Unique3: " + unique3);
	
	
	}

}
