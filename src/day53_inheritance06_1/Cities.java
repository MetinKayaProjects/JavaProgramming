package day53_inheritance06_1;


public class Cities {
	public static void main(String[] args) {
		
		City baku = new City(123, "Baku");
		System.out.println(baku);  //System.out.println(baku.toString);
		
		System.out.println();
		
		City istanbul = new City(444, "Istanbul");
		City anotherCity = new City(444, "Istanbul");
		
		if (istanbul.equals(anotherCity)) {
			System.out.println("Both are Istanbul");
		}else {
			System.out.println("Does not equal");
		}
		System.out.println(istanbul.toString());
		System.out.println(anotherCity.toString());
		
		System.out.println();
		
		System.out.println(baku.hashCode());  //2018699554    127
		System.out.println(istanbul.hashCode());  //1311053135     452
		System.out.println(anotherCity.hashCode());//118352462      452
		
		
	}

}