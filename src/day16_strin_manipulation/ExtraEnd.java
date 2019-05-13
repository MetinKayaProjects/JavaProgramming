package day16_strin_manipulation;

public class ExtraEnd {
	public static void main(String[] args) {
		
		String str = "java";
		String result = "";
		
		if(str.length() == 2) {
			result = str + str + str;
		}else {
			result = str.substring(str.length() - 2);
			result += result +result; // result = result + result + result
		}
		System.out.println(result);
		
		
		//Murodil
	
		String str2 = "hi";
		String result2 = "";
		if(str2.length() == 2) {
			result2 = str2+str2+str2;
		}else {
			result2 = str2.substring( str2.length() -2 );
			result2 = result2 + result2 + result2;
		}
		
		
		result = str.substring( str.length() -2 );
	    result = result + result + result;
		
		
		System.out.println(result2);
		
		
		
		
	}

}
