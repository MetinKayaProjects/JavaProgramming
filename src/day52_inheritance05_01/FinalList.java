package day52_inheritance05_01;

import java.util.ArrayList;


public class FinalList {
	
	final static public String COLOR = "Yellow";  //instance variable
	
	
	public static void main(String[] args) {
		
		
		
		final ArrayList<String> COLORS = new ArrayList<String>();
		
		COLORS.add("Orange");
		COLORS.add("White");
		COLORS.add("Blue");
		COLORS.add("Black");
		COLORS.add("Red");
				
		System.out.println(COLORS.toString());
		
		COLORS.add("Brown");
		System.out.println(COLORS.toString());
		
		COLORS.add("Ping");
		System.out.println(COLORS.toString());
		
		COLORS.remove(5);
		COLORS.remove("Orange");
		System.out.println(COLORS.toString());
		
//		COLORS = new ArrayList<String>();   >> not compile
		
	}

}
