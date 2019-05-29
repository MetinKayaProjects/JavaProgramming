package day37_arraylist;

import java.util.ArrayList;

public class RemoveInteger {
	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>();
		System.out.println(nums.size()); //0
		System.out.println(nums.isEmpty());//true
		System.out.println(nums.size() == 0);//true
		
		nums.add(4);
		nums.add(1);
		nums.add(443);
		nums.add(5);
		nums.add(10);
		nums.add(100);
		nums.add(55);
		
		System.out.println(nums.toString());//[4, 1, 443, 5, 10, 100, 55]
		nums.remove(5);
		
		System.out.println(nums.toString());  //[4, 1, 443, 5, 10, 55]     5 is still there
		
		Integer n1 = new Integer(5);
		
		nums.remove( n1 ); //removes n1=5
		System.out.println(nums.toString()); //[4, 1, 443, 10, 55]
		
		nums.remove(new Integer(4));  //removes 4
		System.out.println(nums); //[1, 443, 10, 55]

		Integer n2 = Integer.valueOf(10);
		System.out.println("n2: " + n2);
		nums.remove(n2); ////removes 10 
		System.out.println(nums.toString()); //[1, 443, 55]
		
		nums.removeAll(nums); //removes all values
		System.out.println(nums.toString()); // []
		
		
	}

}
