package day06_operators2;

public class IncrementDecrement {
	public static void main(String[] args) {
		
		int employees = 50;
		System.out.println("Employees: " + employees);
		
		employees++;// sadece +1 artirir
		
		System.out.println("Employees: " + employees); //50+1
		
		employees++; //52
		employees++; //53
		System.out.println(employees);
		
		employees +=2; //55
		employees = employees +1; //56
		employees++; //57
		System.out.println(employees);//57
		
		
		employees--; //57-1=56
		System.out.println(employees);
		
		--employees; // -1 cikar demek... employees-- ile ayni
		System.out.println(employees); //55
		
	
	}

}
