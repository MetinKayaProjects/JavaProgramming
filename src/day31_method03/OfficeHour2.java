package day31_method03;

public class OfficeHour2 {
	public static void main(String[] args) {
		int[] nums1 = new int[] { 1, 2, 4, 6, 7, 12, 15 };
		int[] nums2 = new int[] { 1, 4, 6, 7, 12, 3, 12 };
		int[] nums3 = new int[] { 4, 7, 6, 7, 12, 3, 12 };
		isArraySorted(nums1);
		isArraySorted(nums2);
		isArraySorted(nums3);
	
	}

	public static void isArraySorted(int[] arr) {
		boolean sorted = true; // local variable inside this method

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				sorted = false;
				break;// exit the loop
			}
		}
		System.out.println("Is Array sorted? - " + sorted);
	}

}
