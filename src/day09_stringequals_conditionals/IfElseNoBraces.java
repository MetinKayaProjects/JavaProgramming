package day09_stringequals_conditionals;

public class IfElseNoBraces {
	
	public static void main(String[] args) {
		
		String day = "Tuesday";
		
		//if(day.equals("Tueasday"));{
			System.out.println("Today is Tueasday");
		//}else {
			System.out.println("Tuday is not Tuesday");
			
			
			
			if(day.contentEquals("Tuesday"))
				System.out.println("Today is Tuesday");
			else 
				System.out.println("Today is not Tuesday");
				
			//System.out.println("Today is not Tuesday); //this line is the second line after else. So this is not part of the else condition
			
		//}
	}
}
