package day33_methods05;

public class AgeCalculator {
	public static void main(String[] args) {
		
		System.out.println(calculateAge(2019));
		
		System.out.println(calculateAge(2023));
		
		int ageResult = calculateAge(1973);
		
		ageResult = calculateAge(1999);
		System.out.println("DoB: 1999: your age is "+ ageResult);
		System.out.println(calculateAge(1999));
		System.out.println(calculateAge(2012));
		int age2 = calculateAge(1975);
		System.out.println("You are " + age2 + " years old");
	}
	/*
	 * method: calculateAge
	 * return; int
	 * params: int year
	 * calculates the age by using 2019 and return value
	 * ALSO print
	 * age 1 - 14 -> child
	 * age 15 - 25 -> youngster
	 * age 26 - 64 -> adult
	 * age 65 >   -> senior
	 * age -> negative -> "invalid age" and return 0; 
	 * return age
	 */
	public static int calculateAge(int year) {
	
		int age = 2019 - year;
		if (age<0) {
			System.out.println("invalid age");
			return 0;
		}
		if (age > 1 && age <= 14) {
			System.out.println(age + ": age 1 - 14 -> child");
//			return age;
		}else if(age >15 && age <= 25) {
			System.out.println(age + ": age 15 - 25 -> youngster");
//			return age;
		}else if (age > 26 && age < 64) {
			System.out.println(age + ": age 26 - 64 -> adult");
//			return age;
		}else if (age >= 65) {
			System.out.println(age + ": age 65 >   -> senior");
//			return age;
		}
		return age;
		

		
		
	}

}
