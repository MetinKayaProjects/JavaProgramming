package day40_customclasses_methods;

public class MyEmployee {
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.name = "Ahmet";
		employee.jobTitle = "DEveloper";
		employee.salary = 120000.00;
		
		
		employee.introduce();
		employee.work();
		employee.attendMeeting();
	
		System.out.println();
		
		employee.jobTitle = "Team Lead";
		employee.salary = 100500.2;
		employee.introduce();
		
		//System.out.println(employee.salary);
	}

}
