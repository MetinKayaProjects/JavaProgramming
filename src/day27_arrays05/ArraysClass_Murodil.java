package day27_arrays05;

import java.util.Arrays;

public class ArraysClass_Murodil {
public static void main(String[] args) {
	
	int[] nums = {43, 12, 4, 1, 3, 5};
	//toString method
	System.out.println(Arrays.toString( nums ) );  //[43, 12, 4, 1, 3, 5]
//	or:
	String str = Arrays.toString( nums );
	System.out.println(str);    //[43, 12, 4, 1, 3, 5]
	
	//sort method. sorts array in ascending order
	Arrays.sort(nums);
	
	System.out.println(Arrays.toString( nums ) );  //[1, 3, 4, 5, 12, 43]
	
	String[] languages = {"Zulu", "Spanish", "Italian", "English", "1Polish", "arabic","Uzbek"};
	System.out.println(Arrays.toString(languages));
	
	Arrays.sort(languages);
	System.out.println(Arrays.toString(languages));

	int[] nums2 = {345, 665, 3333, 11, 3, 0, 66, 654322};
	//find lowest and largest values from nums2 array
	
	Arrays.sort(nums2);
	System.out.println(Arrays.toString(nums2));  //[0, 3, 11, 66, 345, 665, 3333, 654322]
	System.out.println(nums2.length);  //8
	int lowest = nums2[0];
	int largest = nums2[ nums2.length -1 ];  //nums[7] 
	
	System.out.println("Lowest num: " + lowest);   //nums[0] = 0
	System.out.println("Largest num: " + largest);  //nums[7] = 654322
	
	
	
	
}
}
