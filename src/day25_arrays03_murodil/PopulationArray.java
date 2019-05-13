package day25_arrays03_murodil;

public class PopulationArray {
	public static void main(String[] args) {

//		create an array called population that can accept count 5 cities.
//		assign some values to each cities.

		int[] populations = new int[5];
		populations[0] = 5000;
		populations[1] = 7000;
		populations[2] = 10000;
		populations[4] = 35000; // {4} arada olabilir
		populations[3] = 45000;

//			int[] populations = {5000, 7000, 10000, 35000, 45000}  boyle de gosterilebilir ama yukaridaki sira olmali
		int[] populations2 = { 5000, 7000, 10000, 35000, 45000 };

		System.out.println(populations[0]);
		System.out.println("City 0 popilations: " + populations[0]); // 5000
		System.out.println("City 1 popilations: " + populations[1]); // 7000
		System.out.println("City 2 popilations: " + populations[2]); // 10000
		System.out.println("City 3 popilations: " + populations[3]); // 45000
		System.out.println("City 4 popilations: " + populations[4]); // 35000

		System.out.println("*** *** *** *** *** *** ");

		int idx = 0;
		System.out.println("City 0 popilations: " + populations[idx]); // 5000
		idx++;
		System.out.println("City 1 popilations: " + populations[idx]); // 7000
		idx++;
		System.out.println("City 2 popilations: " + populations[idx]); // 10000
		idx++;
		System.out.println("City 3 popilations: " + populations[idx]); // 45000
		idx++;
		System.out.println("City 4 popilations: " + populations[idx]); // 35000

		// or
		for (int i = 0; i < populations.length; i++) {
			System.out.println("city-forLoop " + i + ": " + populations[i]);
		}
		System.out.println();
		// or
		for (int p : populations) {
			System.out.println("city foreach: " + p);
		}

		String string = "abc";
		System.out.println("City str.length populations: " + populations[string.length()]); // 45000 str.length = 3

		System.out.println("============================");

		// String array called cities
		String[] cities = { "Miami", "London", "Tokyo", "Rome", "New York" };

		System.out.println("Population of " + cities[0] + " is " + populations[0]);
		System.out.println("Population of " + cities[1] + " is " + populations[1]);
		System.out.println("Population of " + cities[2] + " is " + populations[2]);
		System.out.println("Population of " + cities[3] + " is " + populations[3]);
		System.out.println("Population of " + cities[4] + " is " + populations[4]);

		System.out.println("------ OR ------");
		for (int i = 0; i < cities.length; i++) {
			System.out.println("Population of " + cities[i] + " is " + populations[i]);
		}

	}

}
