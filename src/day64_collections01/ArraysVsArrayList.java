package day64_collections01;

import java.util.*;

public class ArraysVsArrayList {
	public static void main(String[] args) {

//Arrays are fixed size
		//Keeps ordering
		//Allows duplicate
		//Allaows primitive and objects
	int[] numsArrays = {30, 50,5001};
	String [] days = new String[7];
	days[0] = "Monday";
	days[1] = "Tuesday";
	
	
	//ArrayList
	List<Integer> numList = new ArrayList<>();
	//ArrayList<Integer> numList = new ArrayList<>();
	numList.add(44);
	numList.add(44);
	numList.add(101);
	
	System.out.println(numsArrays[0]);  //30
	System.out.println(numList.get(0)); // 44
	
	System.out.println(Arrays.toString(numsArrays));//[30, 50, 5001]
	System.out.println(numList.toString());//[44, 44, 101]
	
	
	}

}
