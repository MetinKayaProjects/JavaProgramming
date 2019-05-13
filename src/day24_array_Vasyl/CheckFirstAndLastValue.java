package day24_array_Vasyl;



public class CheckFirstAndLastValue {
	public static void main(String[] args) {
		
		//write a program if first and last value in the array of ints are same - print true
		int[] numbers = {12,41,213,21,42,12};
		
		//.length is not a method, it is an instance variable (property)
		
		System.out.println(numbers[0]== numbers[numbers.length-1]); //true since starts with 12 and ends with 12
		
		//or
		boolean equals = numbers[0]== numbers[numbers.length-1];
		System.out.println(equals); //true
		
		
		//or
		
		if(numbers[0]== numbers[numbers.length-1]) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		
	}

}
