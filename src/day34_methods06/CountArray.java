package day34_methods06;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CountArray {
	public static void main(String[] args) {

//	int result = findOccurences(int[] array, int value);	

		int[] nums = { 2, 3, 4, 5, 5, 6, 6, 6, 7, 5, 5, 12 };
//	1. with Print return right away
		System.out.println("5 values: " + findOccurences(nums, 5));
		System.out.println(findOccurences(nums, 6));

//	2 way: assign return value into variable
		int five = findOccurences(nums, 5);
		System.out.println("5 values: " + five);

		if (five > 0) {
			System.out.println("We have 5s");
		} else {
			System.out.println("No 5s");
		}
		if (findOccurences(nums, 21) > 0) {
			System.out.println("We have 21s");
		} else {
			System.out.println("No 21s");
		}
		System.out.println();
//		create array and pass to method
		findOccurences(new int[] { 10, 20, 20, 30, 25, 52 }, 20);
		int twenty = findOccurences(new int[] { 10, 20, 20, 30, 25, 52 }, 20); // 1st way
		System.out.println("twenty: " + twenty);
		System.out.println(findOccurences(new int[] { 10, 20, 20, 30, 25, 52 }, 20));// 2nd way
		System.out.println("Twenty(2ndway): " + findOccurences(new int[] { 10, 20, 20, 30, 25, 52 }, 20));// 2nd way
		System.out.println();

		System.out.println("getRandomArray(11): " + Arrays.toString(getRandomArray(11)));

//		Random random = new Random();
//		System.out.println(Arrays.toString(getRandomArray(random.nextInt(5))));
		// for(;;) { //while(true) ==> both are infinite loop
		System.out.println(Arrays.toString(CountArray.getRandomArray(20)));
		// }
		int[] randomNums = CountArray.getRandomArray(3);//3 is size>>public static int[] getRandomArray(int size) 
		System.out.println(Arrays.toString(randomNums));
		
		System.out.println();
		
		System.out.println(Arrays.toString(getArray()));//[45, 43, 11, 545, 1000]

	}

	/*
	 * Method: findOccurences Return type: int Params. int[] array, int value Method
	 * will look value in the array and return the count of occurrences
	 */
	public static int findOccurences(int[] array, int value) {
		int counter = 0;
		for (int num : array) {
			if (num == value) {
				counter++;
			}

		}
		return counter;

//		for (int i = 0; i < array.length; i++) {
//			if (array[i] == value) {
//				counter++;
//			}
//		}
//		return counter;

	}

	/*
	 * Method name : getArray return type : int[] PArams: no In the method, build
	 * array and assign value int then return
	 */
	public static int[] getArray() { // array int oldugundan int[] yazdik
		int[] retArray = { 45, 43, 11, 545, 1000 };
		return retArray;
	}

	/*
	 * Method name : getRandomArray return type : int[] PArams: int size In the
	 * method, create an array with value of size; and assign random value from
	 * 0-100 and return it
	 */
	public static int[] getRandomArray(int size) {
		Random random = new Random(); // Create Random class object
		int[] nums = new int[size]; // declare array with size number of elements

		for (int i = 0; i < size; i++) {
			nums[i] = random.nextInt(101); // limited by 100 numbers, get random numbers and assign to num array index
		}
		return nums;

	}

}
