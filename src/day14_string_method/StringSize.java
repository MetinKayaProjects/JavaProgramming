package day14_string_method;

public class StringSize {
	public static void main(String[] args) {
		
		String str1 = "Good Morning";
		//check if matches "Good Morning" and print match
		// or not match
		//Convert to all uppercase and print
		System.out.println(str1.length());//12
		if (str1.equals("Good Morning")) {
			System.out.println("Match");                     //Match
		}else {
			System.out.println(("Not Match"));
		}
		
		if(str1.equalsIgnoreCase("good morning")) {
			System.out.println("Match- ignore case");       //Match- ignore case
		}else {
			System.out.println("Not Match - ignore case");
		}
	System.out.println(str1.toUpperCase());				   //GOOD MORNING
	System.out.println("Before assignment: " + str1);      //Before assignment Good Morning
	str1 = str1.toUpperCase();
	System.out.println("After assignment: " + str1);      //After assignment: GOOD MORNING
	
	//combine the above methods together
	//convert to lowercase first then check if equals("good morning")
	
	if(str1.toLowerCase().equals("good morning")) {
		System.out.println("Chained method: match");
	}else {
		System.out.println("Chained method: do not match");
	}
	
	
	System.out.println("**************************************");
	System.out.println(("****find out how many characters in the string****"));
	
	String myName = "Metin";
	System.out.println("1)My name's length: " + myName.length());//My name length: 5
	
	int length = myName.length();
	System.out.println("2)My name's length: " + length);//My name's length: 5
	
	//usernames must be exactly 8 characters. 
	
	String userName = "MetinKaya";
	if(userName.length()== 8) {
		System.out.println("valid username");
	}else {
		System.out.println("invalid username"); 
	}
	
	//password must be at least 6 characters
	String password = "bananas";
	if(password.length() >= 6) {
		System.out.println("password is long enough!"); // true yazdirir
	}else {
		System.out.println("invalid password, too short"); 
	}
	
	}
}
