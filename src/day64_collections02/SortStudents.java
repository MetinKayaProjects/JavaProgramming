package day64_collections02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SortStudents   {
	public static void main(String[] args) {
		
		List<Student> stList = new ArrayList<>();
		stList.add(new Student(201, "Roman"));
		stList.add(new Student(301, "Ibrahim"));
		stList.add(new Student(401, "Ahmet"));
		stList.add(new Student(501, "John"));
		stList.add(new Student(601, "Michael"));
		
		System.out.println(stList.toString());
		
		Collections.sort(stList);
		System.out.println(stList.toString());
		
		String st1 = "w";
		String st2 = "b";
		
		System.out.println(st1.compareTo(st2));
		
		Student student1 = new Student(10, "Abiy");
		Student student2 = new Student(5, "Olena");
		
		System.out.println(student1.compareTo(student2));  //bu +1 verir. student1 buyuk Olena, 50 olsaydi -1 verirdi. ayni olsaydi 0.
		
	}

}
