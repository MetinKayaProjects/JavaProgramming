package day04_primitives_operators;

public class CitiesWarmup {
	public static void main(String [] args) {
		
		//first way******
		
		int city1 = 2345673;
		int city2 = 5688944;
		int city3 = 16189445;
		
		//second way ****
		// int city1, city2, city3;
		
		//third way *****
		//int city1;
		//int city2;
		//int city3;
		
		//city1 = 2345673;
		//city2 = 5688944;
		//city3 = 16189445;
		
		System.out.print(city1+" "); // ayni satirda yazdirmak istiyorsak ln olmayacak. sadece print olacak
		System.out.print(city2+" ");
		System.out.println(city3+" ");// bu ln ile olmali!!!
		
		System.out.println("============================ ");//araya bos bir satir koymak icin
		
		// ayni satirda aralarina bosluk birakmanin diger yolu
		System.out.print(city1);
		System.out.print(" ");
		System.out.print(city2);
		System.out.print(" ");
		System.out.println(city3);
		
		System.out.println("============================ ");//araya bos bir satir koymak icin
		
		System.out.println(city1);
		System.out.println(city2);
		System.out.println(city3);
		System.out.println("============================ ");//araya bos bir satir koymak icin
		System.out.println(city1+ " "+city2+ " "+city3);
	}

}
