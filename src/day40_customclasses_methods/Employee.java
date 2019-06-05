package day40_customclasses_methods;

public class Employee {
	
	public String name; // public can be used anywhere in project
	public String jobTitle;
	double salary; //can only be used in same package
	
	public void work() {
		System.out.println(name + " is working hard ...");
	}
	
	public void attendMeeting() {
		System.out.println(name + " is attending a meeting ...");
	}
	//"Name[name], jobTitle[jobTitle], salary[salary]"
	public void introduce() {
		System.out.println("Name[" + name +"], jobTitle[" + jobTitle 
				+"], salary[" + salary + "]");
	}
	public void setAllInfo2(String name, String jobTitle, double salary) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", jobTitle=" + jobTitle + ", salary=" + salary + "]";
	}


	
	
}