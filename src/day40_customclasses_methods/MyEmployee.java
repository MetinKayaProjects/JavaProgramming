package day40_customclasses_methods;

public class MyEmployee {
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.name = "Ahmet";
		employee.jobTitle = "Developer";
		employee.salary = 120000.00;
		
		
		employee.introduce();  //these methods' return type is void. so no need to println
		employee.work();
		employee.attendMeeting();
	
		System.out.println();
		
		employee.jobTitle = "Team Lead";
		employee.salary = 100500.2;
		employee.introduce();
		
		//System.out.println(employee.salary);
		
		Employee employee2 = new Employee();
		employee2.setAllInfo2("Metin", "SDET", 150000);
		System.out.println(employee2.jobTitle);
		System.out.println(employee2.name);
		System.out.println(employee2.salary);
		
		System.out.println(employee2.toString());
		
	}

}
