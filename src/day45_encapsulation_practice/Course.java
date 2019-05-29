package day45_encapsulation_practice;

import java.util.*;

public class Course {
	private String name;
	private List<String> teachers = new ArrayList<String>();
	private List<String> students = new ArrayList<String>();

	
	
	
	// add to void method
	public void addStudent(String stName) {
		students.add(stName);
	}

	// add to void method
	public void addTeacher(String thName) {
		teachers.add(thName);
	}

	// add method to remove
	public void removeStudents(String stName) {
		students.remove(stName);
	}

	// add method to remove
	public void removeTeachers(String thName) {
		teachers.remove(thName);
	}

	//toString method
	public String toString() {
		return "Course [name=" + name + ", teachers=" + teachers + ", students=" + students + "]";
	}
	//getter and setter method
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<String> teachers) {
		this.teachers = teachers;
	}

	public List<String> getStudents() {
		return students;
	}

	public void setStudents(List<String> students) {
		this.students = students;
	}

}
