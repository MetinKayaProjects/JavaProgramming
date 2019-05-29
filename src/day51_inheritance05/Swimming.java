package day51_inheritance05;
/*
 * Swimming
		11 cal/minute
 */
public class Swimming extends Exercise {
	
	public int perform(int minutes) {
		System.out.println("Swimming");
		return minutes * 11;
	}

}
