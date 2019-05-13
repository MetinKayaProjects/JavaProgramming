package day39_arraylist04;

import java.util.*;

public class CustomListMethods {
	public static void main(String[] args) {

		ArrayList<Integer> numsList = new ArrayList<Integer>();
		numsList.add(10);
		numsList.add(10);
		numsList.add(7);
		numsList.add(8);
		numsList.add(8);
		numsList.add(3);
		numsList.add(4);
		numsList.add(8);
		printList(numsList);
		System.out.println();

		List<Double> dList = new ArrayList<Double>(); // dList ismi farkli da olabilir: doubleLsit; numList2...
		dList.add(10.0);
		dList.add(10.0);
		dList.add(7.0);
		dList.add(8.0);
		dList.add(8.0);
		dList.add(3.0);
		dList.add(4.0);
		dList.add(8.0);
		double sumD = sumList(dList);
		System.out.println("Sum: " + sumD);
		System.out.println();

		System.out.println(getList(5));
//		ArrayList<Integer> getList(int size)
		ArrayList<Integer> list = getList(10);
		System.out.println(list);

		System.out.println(getRandomList(15));
		List<Integer> myList = getRandomList(10);
		Collections.sort(myList);
		System.out.println(myList);
		
		printList( (ArrayList<Integer>) getRandomList(7));
		System.out.println();
		
		
//		convertToIntList(List<String> strList)
		List<String> strNums = new ArrayList<>();
        strNums.add("123");
        strNums.add("33");
        strNums.add("128");
        strNums.add("3");
        System.out.println("String nums: " + strNums);
        
        List<Integer> converted = convertToIntList(strNums);
        System.out.println("Integer nums: " + converted);

	}

	/*
	 * printList return type: void params : ArrayList<Integer> Print all values in
	 * same line separated by comma
	 */
	public static void printList(ArrayList<Integer> nums) {
		for (Integer n : nums) {
			System.out.print(n + " ");
		}
		System.out.println();

	}

	/*
	 * sumList return type : Double param: List<Double> Calculates sum of each
	 * double value and returns the result
	 */
	public static double sumList(List<Double> dList) {
		double sum = 0.0;
		for (Double d : dList) { // Double or double no matter
			sum += d;
		}
		return sum;
	}

	/*
	 * getList return type : ArrayList<Integer> params: int size getList(5); =>
	 * [1,2,3,4,5]
	 */
	public static ArrayList<Integer> getList(int size) {

		ArrayList<Integer> nums3List = new ArrayList<Integer>();
		for (int i = 1; i <= size; i++) {
			nums3List.add(i);

		}
		return nums3List;
	}

	/*
	 * getRandomList return type: List<Integer> params: int size getList(5); => 3,
	 * 23, 54,77 5
	 */
	public static List<Integer> getRandomList(int size) {
		Random r = new Random(); // object of RAndom class

		List<Integer> randomNums = new ArrayList<Integer>();

		for (int i = 0; i < size; i++) {
			int number = r.nextInt(101);
			randomNums.add(number);
		}
		return randomNums;
	}
	/*
	 * 5) convertToIntList 
	 * Return type: List<Integer> 
	 * Param: List<String> 
	 * It will take each string and convert to Integer and return as Integer list
	 * List<String> strL = new ArrayList<>(); 
	 * strL.add("56"); 
	 * strL.add("99");
	 * convertToIntList(strL); => [56, 99]
	 * 
	 */
	public static List<Integer> convertToIntList(List<String> strList) {
        List<Integer> newList = new ArrayList<>();
        for(String str : strList) {
            newList.add( Integer.parseInt(str) );
        }
        return newList;
    }

}
