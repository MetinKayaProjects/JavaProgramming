package day45_encapsulation_practice;

import java.util.*;

public class Canvas {
	public static void main(String[] args) {

		Course course1 = new Course();
		course1.setName("Java Programming");

		List<String> javaTeachers = new ArrayList<String>();
		javaTeachers.add("Murodil");
		javaTeachers.add("Nadir");
		javaTeachers.add("Vasyl");
		javaTeachers.add("Marufcan");
		javaTeachers.add("Muhtar");

		course1.setTeachers(javaTeachers);
		System.out.println(course1.toString());
//		Course [name=Java Programming, teachers=[Murodil, Nadir, Vasyl, Marufcan, Muhtar], students=[]]
		
		List<String> javaStudents = new ArrayList<String>();
		javaStudents.add("Burak");
		javaStudents.add("Ali");
		javaStudents.add("Cengiz");
		javaStudents.add("Salih");
		javaStudents.add("Ahmet");
		
		course1.setStudents(javaStudents);
		System.out.println(course1.toString());
//		Course [name=Java Programming, teachers=[Murodil, Nadir, Vasyl, Marufcan, Muhtar], students=[Burak, Ali, Cengiz, Salih, Ahmet]]

		course1.addStudent("Metin");
		course1.addTeacher("Shaun");
		
		//check if they added
		if (course1.getTeachers().contains("Shaun")) {
			System.out.println("Shaun has been added to the teacher list");
		}else {
			System.out.println("Shaun is not a teacher");
		}
		
		if (course1.getStudents().contains("Metin")) {
			System.out.println("Metin has been added to the student list");
		}else {
			System.out.println("Metin is not a student");
		}
		
		System.out.println();
		
		course1.removeTeachers("Shaun");
		course1.removeStudents("Burak");
		
		System.out.println(course1.toString());
		
		//check if it is removed
		if(!course1.getTeachers().contains("Shaun")) {
			System.out.println("Shaun is removed successfully");
		}else {
			System.out.println("Shaun is still a teacher");
		}
		
		if(!course1.getStudents().contains("Burak")) {
			System.out.println("Burak is removed successfully");
		}else {
			System.out.println("Burak is still a student");
		}
		
		//orint the teacher names starts w "M"
		
		System.out.println(course1.getTeachers().get(0).startsWith("M")); //true
		
		
		List<String> nameList = new ArrayList<String>();
		for(int i=0; i < javaTeachers.size(); i++) {
			if(course1.getTeachers().get(i).startsWith("M")) {
				nameList.add(course1.getTeachers().get(i));
			}
			
		}System.out.println(nameList.toString());
//		[Murodil, Marufcan, Muhtar]
		
		System.out.println();
		
		List<String> nameList2 = new ArrayList<String>();
		for(String nl:javaStudents) {
			if (nl.startsWith("A")) {
				nameList2.add(nl);
			}
		}
		System.out.println(nameList2.toString()); //[Ali, Ahmet]
		
		int count=0;
		for(String nl : javaTeachers) {
			if(nl.startsWith("M")) {
				System.out.println(nl);
				count++;
			}
			
			for (int i = 0; i < javaTeachers.size(); i++) {
				if (javaTeachers.get(i).startsWith("M")) {
					javaTeachers.add(javaTeachers.get(i));
				}
			}
			
			
			
			
				
		}System.out.println(count);//3
		
		System.out.println();
		
		//Create an String Array include the names starts w/ "M"
		String[] str = new String[count];
		int k = 0 ;
		for (int i = 0; i < javaTeachers.size(); i++) {
			if (javaTeachers.get(i).startsWith("M")) {
				str[k] = javaTeachers.get(i);
				k++;
			}
			
		}System.out.println(Arrays.toString(str));
		
		
		
	}
}
