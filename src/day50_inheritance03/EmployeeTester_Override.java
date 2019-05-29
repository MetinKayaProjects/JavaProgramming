package day50_inheritance03;

public class EmployeeTester_Override {
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		FullTimeEmployee ft = new FullTimeEmployee();
		Contractor ct = new Contractor();
		
		emp.calculatePay(40, 40);
		ft.calculatePay(40, 45);
		ct.calculatePay(40,55);
		
		
	}

}
