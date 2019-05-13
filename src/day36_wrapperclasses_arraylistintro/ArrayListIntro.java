package day36_wrapperclasses_arraylistintro;
import java.util.*;
public class ArrayListIntro {
	public static void main(String[] args) {
		
		//Create an ArrayList
		System.out.println("\n**** Array: ****\n");
		
		String[] str = new String[5];
		str[0] = "Ali";
		str[1] = "Veli";
		str[2] = "Orhan";
		str[3] = "Mehmet";
		str[4] = "Hasan";
		
		System.out.println(str.length); //5
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		System.out.println(str[3]);
		System.out.println(str[4]);
		
		System.out.println();
		System.out.println("====forEach loop: =====");
		for(String s : str) {
			System.out.print(s + " ");
		}
		
		System.out.println();
//		or
		System.out.println("====for loop: =====");
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]+ " ");
		}
		
		
		System.out.println();	
		System.out.println("\n**** ArrayList: ****\n");
		
		ArrayList <String> names = new ArrayList<>();
		
		//assign values into arraylist
		
		names.add("Roma");
		names.add("Orhan");
		names.add("Istanbul");
		names.add("Izmir");
		names.add("Bursa");
		
		System.out.println(names.get(0)); //Roma
		System.out.println(names.get(1)); //Orhan
		System.out.println(names.get(2));
		System.out.println(names.get(3));
		System.out.println(names.get(4));
		System.out.println();
		
		System.out.println("Names count : " + names.size()); //5
		
		
		System.out.println();
		
		int[] newArray = new int[5];
		ArrayList<Integer> nums = new ArrayList<>();
		
		nums.add(new Integer("100"));
		nums.add(99);
		nums.add(2);
		nums.add(34);
		nums.add(90);
		
		System.out.println(nums.get(0));//100
		System.out.println(nums.get(1));//99
		System.out.println(nums.get(2));//2
		System.out.println(nums.get(3));//34
		System.out.println(nums.get(4));//90
		System.out.println();
		
		System.out.println("Nums count: " + nums.size());//Nums count: 5
		
		for(Integer n : nums) {
			System.out.print(n + " "); //100 99 2 34 90 
		}
		
		System.out.println();
		
		for (int i = 0; i < nums.size(); i++) {
			System.out.print(nums.get(i) + " ");//100 99 2 34 90 
		}
		
		
	}

}
