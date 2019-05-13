package day13_ternary_string_intro;

public class Ternary {
	public static void main(String[] args) {
		String result;
		int score = 78;
		
		/*if(score > 60) {
			result = "pass";
		}else {
			result = "fail";
		}
		
		we can code this as like it is in the below:
		*/
		
		result = score > 60 ? "pass" : "fail"; 
		
		System.out.println("Result is: " + result);  //pass    78>60
		
		
	}

}
