package day24_array_Vasyl;

import java.util.Arrays;



public class CarShop {
	public static void main(String[] args) {
		
//		BMW, Audi, Ford, Honda, Mercedes, Mercury, Rolls-Royce, Tesla
//     
		System.out.println("++STEP 1++");
		//1. Step create an array of strings, and store these cars inside that array.
		
		String[] cars = {"BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "Tesla"}; 
		//String[] cars = new String[8];
		String str = Arrays.toString(cars);  //String Array'i String'e cevirmek icin
		System.out.println(str); //[BMW, Audi, Ford, Honda, Mercedes, Mercury, Rolls-Royce, Tesla]
		
		System.out.println("\n++STEP 2++");
		//2. step Print car names that starts with M
		for(String c: cars) {
			if(!c.startsWith("M")) {  //M ile baslamayanlari skip it
				continue;  //skip it, ignore it
			}
			System.out.println(c);  //
		}
		System.out.println();
		
//		or
		
		System.out.println("StartsWM: ");
		for(String c: cars) {
			if(c.startsWith("M")) {  //M ile baslamayanlari skip it
				System.out.println(c);
			}
			
		}
		System.out.println();
		
		
		//or
		
		String listM = "";
		for(String c : cars) {
			if(c.startsWith("M")) {
				listM += c + " \n";
			}
			
		}System.out.println("listM: \n" + listM);
		
		
		System.out.println("++STEP 3++");
		
//		3.step Print all cars that have letter "r" somewhere in the name
//		please make search case insensitive
		for(String r : cars) {
			if(r.toLowerCase().contains("r")) {
				System.out.println(r);
			}
		}
		
		
		System.out.println("++STEP 4++");
//		4. step: Print car names that ends with a
		
		for(String endA: cars) {
			if(endA.endsWith("a")) {
				System.out.println(endA);  //Honda, Tesla
			}
		}
		
		
		System.out.println("+STEP 5+++");
//		5. step: print all cars that have at least 6 letters in the name
		
		for(String sixLetter: cars) {
			if(sixLetter.length() >= 6) {
				System.out.println(sixLetter);
			}
		}
		
//		
		
		System.out.println("+STEP 6  +++");
//		6. step: swap first and last value in the array:
//		Before: "BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "Tesla"
//		After : "Tesla", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "BMW" 
		
		//create a temp variable, that will get the value of first 
		String temp = cars[0]; //first car assigned to temp; cars[0] is emty now
//		and we can assign the last element to cars[0]:
		cars[0] = cars[cars.length-1];
//		And now the last element is empty and assign the temp to it. remember temp has car[0]
		cars[cars.length-1] = temp;
		
		System.out.println("Before sort");
		System.out.println(Arrays.toString(cars)); //String[] cars has been converted to String
//		[Tesla, Audi, Ford, Honda, Mercedes, Mercury, Rolls-Royce, BMW]
		
		System.out.println("After sort");
		Arrays.sort(cars);  					//sort in alphabetical order
		System.out.println(Arrays.toString(cars));
//		[Audi, BMW, Ford, Honda, Mercedes, Mercury, Rolls-Royce, Tesla]
		
//		Ford'un listedeki yerini bul:
		System.out.println(Arrays.binarySearch(cars, "Ford"));
		System.out.println(Arrays.binarySearch(cars, 2, 5, "Honda"));//cars listesinde index 2 ile 5 arasinda Honda varsa 
																	//kacinci indexte
		
	}

}
