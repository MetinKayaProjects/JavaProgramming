package day06_operators2;

public class CentsToDollars {
	public static void main(String[] args) {
		
		//declare an int variable minutes
		//using arithmetic operators, find out how many hours and remaining minutes are there
		//minutes;
		//-hours , remainingMinutes
		//Print "x hours and x minutes"
		//xx hours, x minutes
		
		int minutes=2250;
		int hours=minutes/60;
		int remaingMinutes = minutes %60;
		int days=minutes/(60*24);
		int remainingDays = minutes %(60*24);
		
	System.out.println("\""+minutes + " minutes equals to " 
	+ hours + " hours and " + remaingMinutes + " minutes.\"");
	
	System.out.println(days);
	System.out.println(remainingDays);
	
	
	
	
}
	
	

}
