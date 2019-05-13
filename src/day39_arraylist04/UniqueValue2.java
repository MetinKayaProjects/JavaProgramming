package day39_arraylist04;

import java.util.*;


public class UniqueValue2 {
	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<Integer>();
		
		List<Integer> unique2 = new ArrayList<Integer>();
		
		nums.add(10);nums.add(10);nums.add(7);nums.add(8);
		nums.add(8);nums.add(3);nums.add(4);nums.add(8);
		
		System.out.println(nums);
		
		for (int i = 0; i < nums.size(); i++) {
			int count = 0;
				for (int j = 0; j < nums.size(); j++) {
					if (nums.get(i) == nums.get(j)) {
						count++;
					}
					
				}
				if (count ==1) {
					unique2.add(nums.get(i));
				}
			
		}
		System.out.println(unique2);
		
		
	}

}
