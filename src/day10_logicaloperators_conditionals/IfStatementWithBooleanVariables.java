package day10_logicaloperators_conditionals;

public class IfStatementWithBooleanVariables {
	
	public static void main(String[] args) {
		boolean isbreakTime = false;
		
		if(isbreakTime == false) { // bu true demek.... BREAK TILL 8:35 PM  yadirir
			System.out.println("BREAK TILL 8:35 PM");
		}else {
			System.out.println("Not Break time yet");
		}
		
		//second version
		if(isbreakTime) {  //bu false demek, yani ikincyi yazdirir. 
			//boolean'da == veya benzer comparisoin ifadesine gerek yok. zaten yukarida true olarak tanimli
			System.out.println("BREAK TILL 8:35 PM");
		}else {
			System.out.println("Not Break time yet");
		}
		
		
		boolean classTime = true;
		if(classTime) {
			System.out.println("Come back on time");
		}else {
			System.out.println("TAke some water");
		}
		boolean qualified = false;
		//send a notification message if not qualified
		//we need to check if qualified variable contains FALSE
		
		if(qualified == false) { //true answer
			System.out.println("Your application was not approved.");
		}else {
			System.out.println("stay at home");
		}
		
	}

}
