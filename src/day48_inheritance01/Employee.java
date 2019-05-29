package day48_inheritance01;
//Employee is a child class
public class Employee extends Person {
	
	String jobTitle;
	
	
	public void work() {
		System.out.println(name + " is working as " + jobTitle);
	}


	@Override
	public String toString() {
		return "Employee [jobTitle]=" + jobTitle + ", name=" + name + ", \n     age=" + age + ", gender=" + gender
				+ ", getClass()=" + getClass();
	}

}
