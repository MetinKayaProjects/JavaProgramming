package day52_inheritance05_01;

public class EqualsMethod {
	
	public static void main(String[] args) {
		
		Computer comp1 = new Computer("iMac", "Silver");
		
		Computer comp2 = new Computer("iMac", "Silver");
	
		System.out.println(comp1 == comp2);  //false    (override'dan once de false)
		System.out.println(comp1.equals(comp2));//true  (override'dan once  false)
		
		Computer comp3 = comp2;
		
		System.out.println(comp3 == comp2); //true      (override'dan once true)
		System.out.println(comp3.equals(comp2));//true		(override'dan once false)
		
		System.out.println();
		
		String str1 = "java";
		String str2 = new String("java");
		//checking only if the str1 and str2 point to same object
		System.out.println(str1 == str2);  // false       (override'dan once de false)
		//checking value in the str1 and str2.... Compares the values
		System.out.println(str1.equals(str2));//true      (override'dan once de true)
		
		
		
	}

}
