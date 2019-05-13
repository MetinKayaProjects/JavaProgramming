package day27_arrays05;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysClass {
	public static void main(String[] args) {
		
		int[] nums = { 3, 43, 65, 56, 5};
		
		//to string method
		
		System.out.println(Arrays.toString(nums)); //[3, 43, 65, 56, 5]    Arrays int is converted to String
//		or:
		String str = Arrays.toString(nums);       // sadece int'den degil tum dataType'lardan stringe cevirilebilir
		
		System.out.println(str);                   //[3, 43, 65, 56, 5]
		
		
		
		//to sort method
		Arrays.sort(nums); //[3, 5, 43, 56, 65]
		//System.out.println(Arrays.sort(nums)); //this is not possible since Arrays.sort(nums) is still array
		System.out.println(Arrays.toString(nums));  //[3, 5, 43, 56, 65]
		
		
		String[] languages = {"Zulu", "Italian","Spanish", "English", "Zambabwe","1Polish", "arabic", "Uzbek"};
		
		System.out.println(Arrays.toString(languages)); //[Zulu, Italian, Spanish, English, Polish, Arabic, Uzbek]
		Arrays.sort(languages);
		//after sort: first numbers; second UpperCAse; then lowercase:
		System.out.println(Arrays.toString(languages)); //[1Polish, English, Italian, Spanish, Uzbek, Zulu, arabic]
		
		for(String lng : languages) {
			System.out.print(lng + "-");  //1Polish-English-Italian-Spanish-Uzbek-Zambabwe-Zulu-arabic-
			
		}
		
		System.out.println("\n***************");
		int[] nums2 = {34, 1, 123, 38, 5677, 66};
		//find the lowest and the largest values from num2
		
		System.out.println(Arrays.toString(nums2));  //[34, 1, 123, 38, 5677, 66]
		
		Arrays.sort(nums2);  //[1, 34, 38, 66, 123, 5677]
		System.out.println(Arrays.toString(nums2));   //[1, 34, 38, 66, 123, 5677]
		int lowest = nums2[0];
		int largest = nums2[nums2.length-1];
		
		System.out.println("Lowest number: " + lowest);
		System.out.println("LArgest number: " + largest);
		
	}
	
}
