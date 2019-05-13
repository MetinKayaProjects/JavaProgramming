package day23_array_Vasyl;

import day15_string_manipulation.StartsEndsWith;

public class Arrays1 {
	public static void main(String[] args) {
		int[] numbers = new int[3];
		int num1 = 5;
		int num2 = 7;
		int num3 = 10;
		
		// assign to the first element in the array value of num1
		numbers[0] = num1;
		numbers[1] = num2;
		numbers[2] = num3;
		//numbers[2] = "a" impossible since this is String. data type should be same
		
		System.out.println(numbers); //[I@7852e922
		System.out.println(numbers[0]); //5
		System.out.println(numbers[1]); //7
		System.out.println(numbers[2]); //10
		
		System.out.println("***********************");
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println("***********************");
		
		//max size of an array
		byte[] bytesArray = new byte[Integer.MAX_VALUE-5];
		
		//String array its size is 5
		String[] str = new String[5];
		String[] names = {"Bill", "Burak", "Vlad", "Adem", "Hakan"}; //0,1,2,3,4
		System.out.println(names[0]); //Bill
		System.out.println(names[4]);//Hakan
		System.out.println("Number of items un this Array (names): " + names.length);
		//System.out.println(names[8]); //ERROR, since 8 is out of array range
		
		for(String name: names) {
			System.out.print(name+ " ");
		}
		System.out.println("\n\n*************************\n");
		String[] fruits = new String[] {"apple", "orange"};
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
		
		
		
	}

}
