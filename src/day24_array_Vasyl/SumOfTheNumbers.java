package day24_array_Vasyl;

import java.util.Arrays;

public class SumOfTheNumbers {
	public static void main(String[] args) {
		//let's create an array of integers with length 3
		int[] numbers = new int[3];
		numbers[0] = 3; //first value in array
		numbers[1] = 5; //second value in array
		numbers[2] = 7; //third value in array
		System.out.println(numbers); //[I@7852e922  this is hash code
		//Array.toString() from array class can help us to print an array as a string
		System.out.println(Arrays.toString(numbers));//[3, 5, 7]
		
		
		// TASK: use for loop, in order to loop through the array
		//and calculate sum of all elements
		//numbers.length --> returns number of elements in the array
		//numbers.length = 5; //the final field array.length cannot be assigned
		int sum1 = 0;
		for(int i = 0; i<numbers.length; i++) {
			sum1 = sum1 + numbers[i];
		}
		System.out.println("Sum1: " + sum1);  //Sum: 15  (3+5+7=15)
		//or
		int sum2 = 0;
		for(int n : numbers) {
			sum2 += n;
		}System.out.println("Sum2: " + sum2);
		
		//TASK: find the largest value in the array
		
		int max = Integer.MIN_VALUE;  //int'in alabilicegi minimum sayiyi verir.
		//System.out.println(Integer.MIN_VALUE);  //-2147483648
//		int max = numbers[0];    //bu da olur
		for(int i = 0; i<numbers.length; i++) {
			if(numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println("Max number in the array is " + max); //7
		
		//TASK: find the minumum value in the array
		
		int min = Integer.MAX_VALUE;
//		int min = numbers[0];   //bu da olur. 
		for(int j=0; j < numbers.length; j++) {
			if(numbers[j]<min) {
				min = numbers[j];
			}
		}
		
		System.out.println("Min value in the array: " + min); //3
		
	}

}
