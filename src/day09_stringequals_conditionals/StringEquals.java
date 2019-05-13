package day09_stringequals_conditionals;



public class StringEquals {
	public static void main(String[] args) {
		
		
		String str1 = "java";
		String str2 = "java";
		
		System.out.println(str1 == str2); //true
		System.out.println(str1 == "java"); //true
		System.out.println(str2 == "Java"); // false....Java degil java olmali
		
		//preferrred way
		
		System.out.println(str1.equals(str2)); //true
		System.out.println(str1.equals("java")); //true
		System.out.println(str2.equals("java")); //true
		
		
		String today = new String("java");
		String str = new String("Hello");
		
		String month = "March";
		String month2 = new String("March");
		
		System.out.println(month == month2); //FALSE!!!!!!!!!!!!!!!!!!!!!
		System.out.println(month.equals(month2)); //TRUE
		System.out.println(month.equals("March")); //TRUE
		
		
	}

}
