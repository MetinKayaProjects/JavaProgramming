package day64_collections01;
import java.util.*;
public class SetExample {
	public static void main(String[] args) {
		
		Set<Integer> mySet = new HashSet<Integer>();
		mySet.add(100);
		mySet.add(500);
		mySet.add(800);
		mySet.add(900);
		mySet.add(1000);
		
		System.out.println(mySet.toString());  //[800, 100, 500, 900, 1000]  order is not same
		
		mySet.add(2500);
		
		System.out.println(mySet.toString());//[800, 100, 500, 900, 2500, 1000]
		
		mySet.add(45000);
		mySet.add(1);
		mySet.add(1);
		mySet.add(45000);
		System.out.println(mySet.toString());//[800, 1, 100, 500, 900, 2500, 1000, 45000]   duplication is not allowed
		
		System.out.println(mySet.size());//8
		
		
		List<String> list = Arrays.asList("23", "a", "b", "33", "33", "jj", "q", "t", "t");
		
		
		Set<String> unique = new HashSet<>(list);
		
		System.out.println(unique.toString());//[33, jj, 23, a, q, b, t]     //set stores unique values 
		System.out.println(list.toString()); //[23, a, b, 33, 33, jj, q, t, t]
		
		TreeSet<Integer> tSet = new TreeSet<Integer>();
		tSet.add(5);
		tSet.add(5);
		tSet.add(55);
		tSet.add(55);
		tSet.add(33);
		tSet.add(777);
		tSet.add(4000);
		tSet.add(4000);
		
		System.out.println(tSet.toString());//[5, 33, 55, 777, 4000]   unique values, every elements added only one time...
		
		
		
	}

}
