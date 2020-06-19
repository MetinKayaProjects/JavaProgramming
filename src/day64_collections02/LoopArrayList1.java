package day64_collections02;
import java.util.*;
public class LoopArrayList1 {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(50); nums.add(100); nums.add(100); nums.add(150); 
		nums.add(200); nums.add(300);
		
		//Loop using for each loop
		
		for (int n : nums) {
			System.out.print(n + " | ");
		}
		System.out.println();
		
		//Loop using For Loop
		for (int i = 0; i < nums.size(); i++) {
			System.out.print(nums.get(i) + " | ");
		}
		
		System.out.println();
		
		//forEach method of Java 8
		//forEach method comes from iterable interface
		// and we need to pass a lambda expression
		//lambda expression is part of java functional programming 
		//that started form java 8
		//It is used to passa an implementation on t=he while programming
		//we need ti use -> operator
		
		nums.forEach(n -> System.out.print(n + " | "));
		
		System.out.println();
		
		nums.removeIf(n -> n<150);
		
		nums.forEach(n -> System.out.print(n + " | "));
		
	}

}
