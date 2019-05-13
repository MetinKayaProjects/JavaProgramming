package day36_wrapperclasses_arraylistintro;

import java.util.ArrayList;
//import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
//		declarearraylist called languages
		ArrayList<String> languages = new ArrayList<>();
		
		languages.add("Turkish");
		languages.add("English");
		languages.add("Arabic");
		languages.add("Deutsch");
		languages.add("French");
		languages.add("Italian");
		languages.add("Spanish");
		
	
		
		System.out.println("How many languages : " + languages.size());  //7
		languages.add("Finland");
		System.out.println("How many languages : " + languages.size());  //8
		
		System.out.println();
		
//		get(index):  and  indexOf(object):
		System.out.println(languages.get(0));//Turkish
		System.out.println("Index of Turkish: " + languages.indexOf("Turkish"));//Index of Turkish: 0
		System.out.println(languages.toString());  //[Turkish, English, Arabic, Deutsch, French, Italian, Spanish, Finland]
		//languages.remove(0);
		System.out.println(languages.remove(0));  //Remove the first item Turkish
		System.out.println(languages.size());//How many languages after removing : 7
		System.out.println(languages.toString());//[English, Arabic, Deutsch, French, Italian, Spanish, Finland]
		System.out.println(languages.get(0));//After removing the new first item: English
	}

}
